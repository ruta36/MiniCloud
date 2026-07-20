package com.hilcoe.MiniCloud.service;

import java.util.UUID;

import com.hilcoe.MiniCloud.entity.RefreshToken;
import com.hilcoe.MiniCloud.entity.User;

public class RefreshTokenServiceImpl implements RefreshTokenService{

	@Override
	public RefreshToken generateRefreshToken(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RefreshToken getRefreshToken(String hash) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateRefreshToken(String token) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void revokeRefreshToken(UUID tokenId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revokeUserTokens(UUID userId) {
		// TODO Auto-generated method stub
		
	}

}
