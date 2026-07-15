package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.Bucket;
import com.hilcoe.MiniCloud.entity.File;

public interface BucketDAO {
	Bucket createBucket(Bucket bucket);
	Bucket getBucket(UUID id);
	List<Bucket> getBuckets();
	Bucket updateBucket(Bucket bucket);
	void deleteBucket(UUID id);

	List<File> getBucketFiles(UUID bucketId);


}
