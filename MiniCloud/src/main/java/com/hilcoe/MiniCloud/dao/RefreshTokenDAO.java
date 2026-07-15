package com.hilcoe.MiniCloud.dao;

import java.util.UUID;

import com.hilcoe.MiniCloud.entity.RefreshToken;
import com.hilcoe.MiniCloud.entity.User;

public interface RefreshTokenDAO {
	
	RefreshToken createToken(User user);

	RefreshToken findToken(String hash);

	void deleteToken(UUID id);

	boolean validateToken(String token);


}
