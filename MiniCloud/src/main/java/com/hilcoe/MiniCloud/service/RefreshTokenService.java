package com.hilcoe.MiniCloud.service;

import java.util.UUID;

import com.hilcoe.MiniCloud.entity.RefreshToken;
import com.hilcoe.MiniCloud.entity.User;

public interface RefreshTokenService {
	String generateRefreshToken(User user);

	String getRefreshToken(String hash);

	boolean validateRefreshToken(String token);

	void revokeRefreshToken(UUID tokenId);

	void revokeUserTokens(UUID userId);

}
