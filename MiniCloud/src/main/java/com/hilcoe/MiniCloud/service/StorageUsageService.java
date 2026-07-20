package com.hilcoe.MiniCloud.service;

import java.util.UUID;

import com.hilcoe.MiniCloud.entity.StorageUsage;

public interface StorageUsageService {

	StorageUsage getStorageUsage(UUID userId);

	StorageUsage recalculateStorageUsage(UUID userId);
}
