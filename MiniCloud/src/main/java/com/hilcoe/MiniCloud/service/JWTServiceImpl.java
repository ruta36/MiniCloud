package com.hilcoe.MiniCloud.service;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.hilcoe.MiniCloud.entity.Role;
import com.hilcoe.MiniCloud.entity.User;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTServiceImpl implements JWTService{
	
	private final String secret;
	private final long expiration;
	
	public JWTServiceImpl(@Value("${jwt.secret}") String secret, @Value("${jwt.expiration}") long expiration) {
		this.secret = secret;
		this.expiration = expiration;
	}
	
	private SecretKey getSigningKey() {
		return Keys.hmacShaKeyFor(secret.getBytes());
	}

	@Override
	public String generateAccessToken(User user,Role role) {
		// create JWT here
		return Jwts.builder().setSubject(user.getEmail())
				.claim("userId", user.getUserId())
				.claim("role", role.getName())
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis()+expiration))
				.signWith(getSigningKey())
				.compact();
	}

	@Override
	public String extractEmail(String token) {
		// extract email from JWT
		return Jwts.parserBuilder()
				.setSigningKey(getSigningKey())
				.build()
				.parseClaimsJws(token)
				.getBody()
				.getSubject();
	}

	@Override
	public Boolean validateToken(String token) {
		// verify signature and expiration
		try {
			Jwts.parserBuilder()
			.setSigningKey(getSigningKey())
			.build()
			.parseClaimsJws(token);
			
			return true;

		} catch (Exception e) {
			return false;
		}
	}

}
