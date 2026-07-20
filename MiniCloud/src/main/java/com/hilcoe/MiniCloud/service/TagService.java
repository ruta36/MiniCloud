package com.hilcoe.MiniCloud.service;

import java.util.List;

import com.hilcoe.MiniCloud.entity.Tag;

public interface TagService {
	Tag createTag(Tag tag);

	Tag updateTag(Integer tagId, Tag tag);

	void deleteTag(Integer tagId);

	List<Tag> getAllTags();
}
