package com.hilcoe.MiniCloud.service;

import java.util.List;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import com.hilcoe.MiniCloud.entity.File;

public class FileServiceImpl implements FileService{

	@Override
	public File uploadFile(UUID bucketId, MultipartFile file, UUID uploadedBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File downloadFile(UUID fileId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File renameFile(UUID fileId, String newName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFile(UUID fileId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restoreFile(UUID fileId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveFile(UUID fileId, UUID destinationBucketId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<File> listFiles(UUID bucketId) {
		// TODO Auto-generated method stub
		return null;
	}

}
