package com.hilcoe.MiniCloud.service;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.BucketAccess; 

public interface BucketAccessService {
	void shareBucket(UUID bucketId,UUID userId,String permission); 
	void removeBucketAccess(UUID bucketId,UUID userId);
	List<BucketAccess> getBucketMembers(UUID bucketId);
}
