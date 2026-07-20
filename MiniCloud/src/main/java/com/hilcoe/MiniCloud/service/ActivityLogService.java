package com.hilcoe.MiniCloud.service;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.ActivityLog;

public interface ActivityLogService {
	void recordActivity(UUID userId, String action, String resource);

	List<ActivityLog> getAllLogs();

	List<ActivityLog> getUserLogs(UUID userId);
}
