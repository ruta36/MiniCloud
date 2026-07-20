package com.hilcoe.MiniCloud.service;

import java.util.List; 

import com.hilcoe.MiniCloud.entity.Role;

public interface RoleService {
	Role createRole(Role role);

	Role getRole(Integer roleId);

	List<Role> getAllRoles();

	Role updateRole(Integer roleId, Role role);

	void deleteRole(Integer roleId);
}
