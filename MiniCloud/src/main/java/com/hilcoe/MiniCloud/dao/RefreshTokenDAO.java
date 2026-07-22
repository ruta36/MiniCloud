package com.hilcoe.MiniCloud.dao;

import java.util.UUID;

import com.hilcoe.MiniCloud.entity.RefreshToken;
import com.hilcoe.MiniCloud.entity.User;

public interface RefreshTokenDAO {
	
	RefreshToken createToken(RefreshToken refereshToken);

	RefreshToken findToken(String hash);

	void deleteToken(UUID id);



}
