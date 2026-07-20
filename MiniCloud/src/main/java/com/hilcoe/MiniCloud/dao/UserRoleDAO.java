package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.Role;

public interface UserRoleDAO {
	
	void assignRole(UUID userId, Integer roleId);

	void removeRole(UUID userId, Integer roleId);

	List<Role> getUserRoles(UUID userId);


}
