package com.hilcoe.MiniCloud.dao;

import java.util.List;

import com.hilcoe.MiniCloud.entity.Tag;

public interface TagDAO {

	Tag createTag(Tag tag);

	Tag updateTag(Tag tag);

	void deleteTag(Integer id);

	List<Tag> getTags();

}
