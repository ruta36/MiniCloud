package com.hilcoe.MiniCloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hilcoe.MiniCloud.dto.request.LoginRequest;
import com.hilcoe.MiniCloud.dto.request.RegisterRequest;
import com.hilcoe.MiniCloud.response.AuthResponse;
import com.hilcoe.MiniCloud.service.AuthService;
 

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	AuthService authService;
	
	@Autowired
	public AuthController(AuthService authService) {
		this.authService = authService;
	}
	
	//	for registering users
	@PostMapping("/register")
	public ResponseEntity<AuthResponse> registerUser(@RequestBody RegisterRequest registerData) {
        AuthResponse createdUser = authService.register(registerData);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
	
	//	user login
	@PostMapping("/login")
	public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest loginData) {
        AuthResponse loginResponse = authService.login(loginData);
        return new ResponseEntity<>(loginResponse, HttpStatus.CREATED);
    }
	
	@PostMapping("/refresh")
	public ResponseEntity<AuthResponse> refreshToken(@RequestBody RegisterRequest user) {
        AuthResponse createdUser = authService.register(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
	
	@PostMapping("/logout")
	public ResponseEntity<AuthResponse> logout(@RequestBody RegisterRequest user) {
        AuthResponse createdUser = authService.register(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}
