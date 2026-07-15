package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.BucketAccess;

public interface BucketAccessDAO {
	
	void grantAccess(UUID bucketId,UUID userId,String permission);

	void revokeAccess(UUID bucketId,UUID userId);

	List<BucketAccess> getUsers(UUID bucketId);


}
