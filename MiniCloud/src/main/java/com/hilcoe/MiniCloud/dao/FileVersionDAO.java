package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.FileVersion;

public interface FileVersionDAO {
	
	FileVersion uploadNewVersion();

	List<FileVersion> getVersions(UUID fileId);

	FileVersion getCurrentVersion(UUID fileId);

	void restoreVersion(UUID versionId);


}
