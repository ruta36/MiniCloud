package com.hilcoe.MiniCloud.service;

import java.util.List;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import com.hilcoe.MiniCloud.entity.File;

public interface FileService {
	File uploadFile(UUID bucketId, MultipartFile file, UUID uploadedBy);

	File downloadFile(UUID fileId);

	File renameFile(UUID fileId,String newName);

	void deleteFile(UUID fileId);

	void restoreFile(UUID fileId);

	void moveFile(UUID fileId,UUID destinationBucketId);
	
	List<File> listFiles(UUID bucketId);

	
}
