package com.hilcoe.MiniCloud.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.hilcoe.MiniCloud.entity.Role;

import jakarta.persistence.NoResultException;

@Service
public class UserRoleServiceImpl implements UserRoleService{

	@Override
	public void assignRoleToUser(UUID userId, Integer roleId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeRoleFromUser(UUID userId, Integer roleId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Role> getUserRoles(UUID userId) {
		
	}
	
	
	

}
