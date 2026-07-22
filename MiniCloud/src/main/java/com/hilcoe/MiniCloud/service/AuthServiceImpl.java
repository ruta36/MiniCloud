package com.hilcoe.MiniCloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
 
import com.hilcoe.MiniCloud.dao.RoleDAO;
import com.hilcoe.MiniCloud.dao.UserDAO;
import com.hilcoe.MiniCloud.dao.UserRoleDAO;
import com.hilcoe.MiniCloud.dto.request.LoginRequest;
import com.hilcoe.MiniCloud.dto.request.RegisterRequest; 
import com.hilcoe.MiniCloud.entity.Role;
import com.hilcoe.MiniCloud.entity.User;
import com.hilcoe.MiniCloud.entity.UserRole;
import com.hilcoe.MiniCloud.response.AuthResponse;
import com.hilcoe.MiniCloud.response.UserResponse;

@Service
public class AuthServiceImpl implements AuthService{
	
	private UserDAO userDao;
	private RoleDAO roleDao;
	private UserRoleDAO userRoleDao; 
	private PasswordEncoder passwordEncoder;
	
	private final JWTService jwtService;
	private final RefreshTokenService refreshTokenService;
	
	@Autowired
	public AuthServiceImpl (UserDAO userDao, RoleDAO roleDao, UserRoleDAO userRoleDao, PasswordEncoder passwordEncoder, JWTService jwtService, RefreshTokenService refreshTokenService) {
		this.userDao = userDao;
		this.roleDao = roleDao;
		this.userRoleDao = userRoleDao;
		this.passwordEncoder = passwordEncoder;
		this.jwtService = jwtService;
		this.refreshTokenService = refreshTokenService;
	}
	

	@Override
	public AuthResponse register(RegisterRequest request) {
		
//		if(userDao.findByEmail(request) !==n null) {
//			throw new RuntimeException("Email already exists");
//		}
//		first check if user name/email exists and throw error if already exists
		User existingEmail = userDao.findByEmail(request.getEmail());
		if(existingEmail != null) {
			throw new RuntimeException("Email already exists!");
		}
		
		User existingUsername = userDao.findByUsername(request.getUserName());
		if(existingUsername != null) {
			throw new RuntimeException("Username already exists!");
		}
		
		// suer doesn't exist so proceed to registering user
		String hashedPassword = passwordEncoder.encode(request.getPassword());
		System.out.println("hashedPassword"+hashedPassword);
		
		User user = new User();
		
		user.setUserName(request.getUserName());
		user.setFullName(request.getFullName());
		user.setEmail(request.getEmail());
		user.setPasswordHash(hashedPassword);
		user.setStorageQuotaBytes(1073741824L);
		
		User savedUser = userDao.registerUser(user);
		Role role = roleDao.findByName("USER");
		
		UserRole userRole = new UserRole();
		userRole.setUser(savedUser);
		userRole.setRole(role);
		
		userRoleDao.assignRole(userRole);
		
		String accessToken = jwtService.generateAccessToken(savedUser,role);
		String refreshToken = refreshTokenService.generateRefreshToken(savedUser);
		
		Role user_role = userRole.getRole();
		
		System.out.println("user role: "+user_role);
		 
		AuthResponse response = new AuthResponse();
		
		UserResponse userResponse = new UserResponse();

		userResponse.setUserId(user.getUserId());

		userResponse.setUserName(user.getUserName());
		userResponse.setFullName(user.getFullName());
		userResponse.setRole(user_role.getName());

		userResponse.setEmail(user.getEmail());
		response.setAccessToken(accessToken);
		response.setRefreshToken(refreshToken);
		response.setRole(user_role.getName());
		response.setUser(userResponse);
		
		return response;
	}

	@Override
	public AuthResponse login(LoginRequest request) {
		User user = userDao.findByEmail(request.getEmail());
		if(user == null) {
			throw new RuntimeException("invalid email or password");
		}
		
		boolean passwordMatches = passwordEncoder.matches(request.getPassword(), user.getPasswordHash());
		if(!passwordMatches) {
			throw new RuntimeException("Invalid email or password");
		}
		
		
		List<UserRole> roles = userRoleDao.getUserRoles(user);
		

		String accessToken = jwtService.generateAccessToken(user, roles.getFirst().getRole());
		String refreshToken = refreshTokenService.generateRefreshToken(user);
		
		AuthResponse response = new AuthResponse();
		
		UserResponse userResponse = new UserResponse();

		userResponse.setUserId(user.getUserId());
		userResponse.setUserName(user.getUserName());
		userResponse.setFullName(user.getFullName());
		userResponse.setEmail(user.getEmail());
		userResponse.setRole(roles.getFirst().getRole().getName());
		
		response.setAccessToken(accessToken);
		response.setRefreshToken(refreshToken);
		response.setRole(roles.getFirst().getRole().getName());
		response.setUser(userResponse);
		
		return response;
	}

	@Override
	public AuthResponse refreshToken(String refreshToken) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void logout(String refreshToken) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AuthResponse getUserDetail(String token) {
		// TODO Auto-generated method stub
		return null;
	}

}
