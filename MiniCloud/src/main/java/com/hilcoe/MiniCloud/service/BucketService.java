package com.hilcoe.MiniCloud.service;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.Bucket;
import com.hilcoe.MiniCloud.entity.File;

public interface BucketService {
	Bucket createBucket(UUID ownerId, String bucketName);
	Bucket getBucket(UUID bucketId);
	List<Bucket> getUserBuckets(UUID userId);
	Bucket renameBucket(UUID userId, String newName); 
	void deleteBucket(UUID bucketIdd);
	List<File> listBucketFiles(UUID bucketId);
	
}
