package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.Tag;

public interface FileTagDAO {
	
	void addTag(UUID fileId,Integer tagId);

	void removeTag(UUID fileId,Integer tagId);

	List<Tag> getFileTags(UUID fileId);


}
