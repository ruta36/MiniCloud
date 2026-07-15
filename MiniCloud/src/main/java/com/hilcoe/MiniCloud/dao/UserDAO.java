package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.User;

public interface UserDAO {
	User registerUser(User user);
	User getUser(UUID userId);
	List<User> getAllUsers();
	User updateUser(UUID user);
	void deleteUser(UUID userId);
	User findByUsername(String username);
	User findByEmail(String email);
;
}
