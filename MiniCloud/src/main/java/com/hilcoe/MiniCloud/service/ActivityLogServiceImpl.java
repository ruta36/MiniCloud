package com.hilcoe.MiniCloud.service;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.ActivityLog;

public class ActivityLogServiceImpl implements ActivityLogService{

	@Override
	public void recordActivity(UUID userId, String action, String resource) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ActivityLog> getAllLogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ActivityLog> getUserLogs(UUID userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
