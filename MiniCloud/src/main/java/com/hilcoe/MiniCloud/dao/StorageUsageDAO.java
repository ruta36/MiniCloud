package com.hilcoe.MiniCloud.dao;

import java.util.UUID;

import com.hilcoe.MiniCloud.entity.StorageUsage;

public interface StorageUsageDAO {
	
	StorageUsage calculateUsage(UUID userId);

	StorageUsage getUsage(UUID userId);


}
