package com.hilcoe.MiniCloud.service;

import java.util.List;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import com.hilcoe.MiniCloud.entity.FileVersion;

public interface FileVersionService {
	FileVersion uploadNewVersion(UUID fileId, MultipartFile file, UUID userId);

	List<FileVersion> getFileVersions(UUID fileId);

	FileVersion getCurrentVersion(UUID fileId);

	void restoreVersion(UUID versionId);
}
