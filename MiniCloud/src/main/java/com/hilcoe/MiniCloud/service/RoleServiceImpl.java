package com.hilcoe.MiniCloud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hilcoe.MiniCloud.dao.RoleDAO;
import com.hilcoe.MiniCloud.entity.Role;

@Service
public class RoleServiceImpl implements RoleService{
	
	private RoleDAO roleDao;
	

	@Override
	public Role createRole(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getRole(Integer roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> getAllRoles() {
		List<Role> roles = roleDao.getRoles();
		return roles;
	}

	@Override
	public Role updateRole(Integer roleId, Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRole(Integer roleId) {
		// TODO Auto-generated method stub
		
	}

}
