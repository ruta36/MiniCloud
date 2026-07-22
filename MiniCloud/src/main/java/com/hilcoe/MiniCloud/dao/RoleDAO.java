package com.hilcoe.MiniCloud.dao;

import java.util.List;

import com.hilcoe.MiniCloud.entity.Role;

public interface RoleDAO {
	Role createRole(Role role);
	Role getRole(Integer id);
	List<Role> getRoles();
	Role updateRole(Role role);
	void deleteRole(Integer id);
	Role findByName(String roleName);
	
}
