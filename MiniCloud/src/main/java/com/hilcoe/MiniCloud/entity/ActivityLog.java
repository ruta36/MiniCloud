package com.hilcoe.MiniCloud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "activity_logs")
public class ActivityLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "log_id")
	private Long logId;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@Column(name = "action")
	private String action;

	@Column(name = "resource_type")
	private String resourceType;

	@Lob
	@Column(name = "details")
	private String details;

	public ActivityLog() {
	}

	public ActivityLog(User user, String action, String resourceType, String details) {
		this.user = user;
		this.action = action;
		this.resourceType = resourceType;
		this.details = details;
	}

	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
}
