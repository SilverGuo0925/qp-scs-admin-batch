package qp.scs.repository;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import qp.scs.model.Job;
import qp.scs.model.JobLog;

public interface JobRepository extends CrudRepository<Job, Long> {

	@Query("select u from Job u where u.className = :name")
	public List<Job> getByClassName(@Param("name") String name);

	@Query("select u from Job u")
	public List<Job> getJobs();


}
