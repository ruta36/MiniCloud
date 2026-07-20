package com.hilcoe.MiniCloud.dao;

import java.util.UUID;

import com.hilcoe.MiniCloud.entity.RefreshToken;
import com.hilcoe.MiniCloud.entity.User;

public class RefreshTokenDAOImpl implements RefreshTokenDAO{

	@Override
	public RefreshToken createToken(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RefreshToken findToken(String hash) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteToken(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validateToken(String token) {
		// TODO Auto-generated method stub
		return false;
	}

}
