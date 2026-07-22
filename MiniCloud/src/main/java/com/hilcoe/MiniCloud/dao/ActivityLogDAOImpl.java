package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.hilcoe.MiniCloud.entity.ActivityLog;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ActivityLogDAOImpl implements ActivityLogDAO{

	@Override
	public void logActivity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ActivityLog> getLogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ActivityLog> getLogsByUser(UUID userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
