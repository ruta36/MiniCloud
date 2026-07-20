package com.hilcoe.MiniCloud.service;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.Role;

public interface UserRoleService {
	
	void assignRoleToUser(UUID userId, Integer roleId);

	void removeRoleFromUser(UUID userId, Integer roleId);

	List<Role> getUserRoles(UUID userId);

}
