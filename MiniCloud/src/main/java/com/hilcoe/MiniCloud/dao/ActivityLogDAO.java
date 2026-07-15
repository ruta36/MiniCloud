package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.ActivityLog;

public interface ActivityLogDAO {
	
	void logActivity();

	List<ActivityLog> getLogs();

	List<ActivityLog> getLogsByUser(UUID userId);


}
