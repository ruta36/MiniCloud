package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.Role;
import com.hilcoe.MiniCloud.entity.User;
import com.hilcoe.MiniCloud.entity.UserRole;

public interface UserRoleDAO {
	
	void assignRole(UserRole user);

	void removeRole(UUID userId, Integer roleId);

	List<UserRole> getUserRoles(User user);


}
