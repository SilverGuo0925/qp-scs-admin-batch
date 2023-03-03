package qp.scs.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Id;



@Entity
public class Job extends AuditableEntity{

	@Id
	private Integer id;

	private String className;

	private String scheduleDescription;

	private String cronExpression;

	//@Column(nullable = false, columnDefinition = "NUMBER(1,0) DEFAULT 0")
	private Boolean isActive;

	private LocalDateTime lastStartDate;

	private LocalDateTime lastEndDate;

	private String lastRunBy;

	@ManyToOne(fetch = FetchType.LAZY)
	private Status lastRunStatus;

	@Column(length = 4000)
	private String description;

	@OneToMany(mappedBy = "job")
	private Set<JobLog> jobLogs = new HashSet<>();

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getScheduleDescription() {
		return scheduleDescription;
	}

	public void setScheduleDescription(String scheduleDescription) {
		this.scheduleDescription = scheduleDescription;
	}

	public String getCronExpression() {
		return cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public LocalDateTime getLastStartDate() {
		return lastStartDate;
	}

	public void setLastStartDate(LocalDateTime lastStartDate) {
		this.lastStartDate = lastStartDate;
	}

	public LocalDateTime getLastEndDate() {
		return lastEndDate;
	}

	public void setLastEndDate(LocalDateTime lastEndDate) {
		this.lastEndDate = lastEndDate;
	}

	public String getLastRunBy() {
		return lastRunBy;
	}

	public void setLastRunBy(String lastRunBy) {
		this.lastRunBy = lastRunBy;
	}

	public Status getLastRunStatus() {
		return lastRunStatus;
	}

	public void setLastRunStatus(Status lastRunStatus) {
		this.lastRunStatus = lastRunStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<JobLog> getJobLogs() {
		return jobLogs;
	}

	public void setJobLogs(Set<JobLog> jobLogs) {
		this.jobLogs = jobLogs;
	}

}
