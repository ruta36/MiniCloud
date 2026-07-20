package com.hilcoe.MiniCloud.service;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.User;

public interface UserService {
	User registerUser(User user);

	User getUser(UUID userId);

	List<User> getAllUsers();

	User updateUser(UUID userId, User user);

	void deleteUser(UUID userId);
}
