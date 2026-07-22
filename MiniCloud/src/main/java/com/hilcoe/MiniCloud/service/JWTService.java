package com.hilcoe.MiniCloud.service;

import com.hilcoe.MiniCloud.entity.Role;
import com.hilcoe.MiniCloud.entity.User;

public interface JWTService {

	String generateAccessToken(User user, Role role);
	String extractEmail(String token);
	Boolean validateToken(String token);
}
