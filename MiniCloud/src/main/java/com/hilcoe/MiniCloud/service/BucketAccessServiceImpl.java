package com.hilcoe.MiniCloud.service;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.BucketAccess;

public class BucketAccessServiceImpl implements BucketAccessService {

	@Override
	public void shareBucket(UUID bucketId, UUID userId, String permission) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBucketAccess(UUID bucketId, UUID userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BucketAccess> getBucketMembers(UUID bucketId) {
		// TODO Auto-generated method stub
		return null;
	}

}
