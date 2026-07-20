package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.BucketAccess;

public class BucketAccessDAOImpl implements BucketAccessDAO{

	@Override
	public void grantAccess(UUID bucketId, UUID userId, String permission) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revokeAccess(UUID bucketId, UUID userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BucketAccess> getUsers(UUID bucketId) {
		// TODO Auto-generated method stub
		return null;
	}

}
