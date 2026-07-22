package com.hilcoe.MiniCloud.service;

import com.hilcoe.MiniCloud.dto.request.LoginRequest;
import com.hilcoe.MiniCloud.dto.request.RegisterRequest;
import com.hilcoe.MiniCloud.response.AuthResponse;

public interface AuthService {
	AuthResponse register(RegisterRequest request);
	AuthResponse login(LoginRequest request);
	AuthResponse refreshToken(String refreshToken);
	void logout(String refreshToken);
	AuthResponse getUserDetail(String token);
}
