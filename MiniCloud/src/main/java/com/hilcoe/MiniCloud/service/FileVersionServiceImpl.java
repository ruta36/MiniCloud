package com.hilcoe.MiniCloud.service;

import java.util.List;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import com.hilcoe.MiniCloud.entity.FileVersion;

public class FileVersionServiceImpl implements FileVersionService{

	@Override
	public FileVersion uploadNewVersion(UUID fileId, MultipartFile file, UUID userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FileVersion> getFileVersions(UUID fileId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileVersion getCurrentVersion(UUID fileId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void restoreVersion(UUID versionId) {
		// TODO Auto-generated method stub
		
	}

}
