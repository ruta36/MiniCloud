package com.hilcoe.MiniCloud.service;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.Tag;

public interface FileTagService {
	void createFileTag(UUID fileId,Integer tagId);

	void deleteFileTag(UUID fileId,Integer tagId);

	List<Tag> listFileTags(UUID fileId);
}
