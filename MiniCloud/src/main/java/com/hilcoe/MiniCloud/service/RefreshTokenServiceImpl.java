package com.hilcoe.MiniCloud.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hilcoe.MiniCloud.dao.RefreshTokenDAO;
import com.hilcoe.MiniCloud.entity.RefreshToken;
import com.hilcoe.MiniCloud.entity.Role;
import com.hilcoe.MiniCloud.entity.User;

@Service
public class RefreshTokenServiceImpl implements RefreshTokenService{
	
	private final RefreshTokenDAO refreshTokenDao;
	private final PasswordEncoder passwordEncoder;
	

	public RefreshTokenServiceImpl(RefreshTokenDAO refreshTokenDao, PasswordEncoder passwordEncoder) {
		this.refreshTokenDao=refreshTokenDao;
		this.passwordEncoder=passwordEncoder;
	}

	@Override
	public String generateRefreshToken(User user) {
		String rawToken = UUID.randomUUID().toString();
		
		String hashedToken = passwordEncoder.encode(rawToken);
		
		RefreshToken refreshToken = new RefreshToken();
		refreshToken.setUser(user);
		refreshToken.setTokenHash(hashedToken);
		refreshToken.setExpiresAt(LocalDateTime.now().plusDays(30));
		refreshTokenDao.createToken(refreshToken);
		return rawToken;
	}

	@Override
	public String getRefreshToken(String hash) {
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
