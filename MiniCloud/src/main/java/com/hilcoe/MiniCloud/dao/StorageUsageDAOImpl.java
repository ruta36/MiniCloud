package com.hilcoe.MiniCloud.dao;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.hilcoe.MiniCloud.entity.StorageUsage;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StorageUsageDAOImpl implements StorageUsageDAO{

	@Override
	public StorageUsage calculateUsage(UUID userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StorageUsage getUsage(UUID userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
