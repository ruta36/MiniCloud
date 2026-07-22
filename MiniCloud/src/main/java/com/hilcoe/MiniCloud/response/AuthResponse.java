package com.hilcoe.MiniCloud.response;

public class AuthResponse {
	private String accessToken;
	private String refreshToken;
	private String role;
	private UserResponse user;
	
	public AuthResponse() {
		
	}
	
	public AuthResponse(String accessToken, String refreshToken, String role, UserResponse user) {
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.role = role;
		this.user = user;
	}
	
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public UserResponse getUser() {
		return user;
	}
	public void setUser(UserResponse user) {
		this.user = user;
	}
	
}
