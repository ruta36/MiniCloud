package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.File;

public interface FileDAO {

	File uploadFile();

	File getFile(UUID id);

	List<File> getFiles();

	File renameFile(UUID id,String newName);

	void deleteFile(UUID id);

	void restoreFile(UUID id);

	void moveFile(UUID fileId,UUID bucketId);

}
