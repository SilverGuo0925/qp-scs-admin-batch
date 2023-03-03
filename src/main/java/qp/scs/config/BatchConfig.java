package qp.scs.config;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.config.TriggerTask;
import org.springframework.scheduling.support.CronTrigger;

import qp.scs.model.Job;
import qp.scs.repository.JobRepository;

@Configuration
@EnableScheduling
public class BatchConfig implements SchedulingConfigurer {

	private static final Logger logger = LoggerFactory.getLogger(BatchConfig.class);

	public static Map<Integer, TriggerTask> taskMap;

	@Autowired
	JobRepository jobRepository;
	@Autowired
	ApplicationContext applicationContext;

	@Transactional
	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		logger.info("Scheduling jobs...");

		List<Job> jobs = jobRepository.getJobs();

		taskMap = new HashMap<Integer, TriggerTask>();
		taskRegistrar.getTriggerTaskList().clear();
		for (final Job job : jobs) {
			String className = job.getClassName();

			if (!job.getIsActive()) {
				logger.info("  Job " + job.getId() + " (" + className + ") not loaded as it is not active");
				continue;
			}

			try {
				Runnable runnable = (Runnable) applicationContext.getBean(Class.forName(className));
				TriggerTask task = new TriggerTask(runnable, new Trigger() {
					@Override
					public Date nextExecutionTime(TriggerContext triggerContext) {
						return new CronTrigger(job.getCronExpression()).nextExecutionTime(triggerContext);
					}
				});
				taskRegistrar.addTriggerTask(task);
				taskMap.put(job.getId(), task);

				logger.info("  Job " + job.getId() + " (" + className + ") loaded. Cron expression = " + job.getCronExpression());
			} catch (BeansException | ClassNotFoundException e) {
				logger.error("  Unable to load Job " + job.getId() + " (" + className + ")", e);
			}
		}
	}
}
