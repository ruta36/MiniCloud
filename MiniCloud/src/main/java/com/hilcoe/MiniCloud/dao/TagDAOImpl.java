package com.hilcoe.MiniCloud.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hilcoe.MiniCloud.entity.Tag;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TagDAOImpl implements TagDAO{

	@Override
	public Tag createTag(Tag tag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tag updateTag(Tag tag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTag(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Tag> getTags() {
		// TODO Auto-generated method stub
		return null;
	}

}
