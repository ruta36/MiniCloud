package com.hilcoe.MiniCloud.service;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.Bucket;
import com.hilcoe.MiniCloud.entity.File;

public class BucketServiceImpl implements BucketService{

	@Override
	public Bucket createBucket(UUID ownerId, String bucketName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bucket getBucket(UUID bucketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bucket> getUserBuckets(UUID userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bucket renameBucket(UUID userId, String newName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBucket(UUID bucketIdd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<File> listBucketFiles(UUID bucketId) {
		// TODO Auto-generated method stub
		return null;
	}

}
