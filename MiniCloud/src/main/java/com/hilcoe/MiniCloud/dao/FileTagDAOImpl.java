package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.hilcoe.MiniCloud.entity.Tag;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FileTagDAOImpl implements FileTagDAO{

	@Override
	public void addTag(UUID fileId, Integer tagId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTag(UUID fileId, Integer tagId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Tag> getFileTags(UUID fileId) {
		// TODO Auto-generated method stub
		return null;
	}

}
