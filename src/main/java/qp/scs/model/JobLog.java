package qp.scs.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class JobLog  {

	protected transient Logger logger = LoggerFactory.getLogger(getClass());

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private LocalDateTime startDate;

	private LocalDateTime endDate;

	private String runBy;

	@ManyToOne(fetch = FetchType.LAZY)
	private Status runStatus;

	@ManyToOne(fetch = FetchType.LAZY)
	private Job job;

	@Column(length = 4000)
	private String filesProcessed = "";

	@Column(length = 4000)
	private String result = "";

	@CreatedBy
	private String createdBy;

	@CreatedDate
	private LocalDateTime createdDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public String getRunBy() {
		return runBy;
	}

	public void setRunBy(String runBy) {
		this.runBy = runBy;
	}

	public Status getRunStatus() {
		return runStatus;
	}

	public void setRunStatus(Status runStatus) {
		this.runStatus = runStatus;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public String getFilesProcessed() {
		return filesProcessed;
	}

	public void setFilesProcessed(String filesProcessed) {
		this.filesProcessed = filesProcessed.substring(0, Math.min(4000, filesProcessed.length()));
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result.substring(0, Math.min(4000, result.length()));
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

}
