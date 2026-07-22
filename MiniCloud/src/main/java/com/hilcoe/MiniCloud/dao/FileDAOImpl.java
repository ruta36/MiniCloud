package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.hilcoe.MiniCloud.entity.File;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FileDAOImpl implements FileDAO{

	@Override
	public File uploadFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File getFile(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<File> getFiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File renameFile(UUID id, String newName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFile(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restoreFile(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveFile(UUID fileId, UUID bucketId) {
		// TODO Auto-generated method stub
		
	}

}
