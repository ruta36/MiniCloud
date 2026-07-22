package com.hilcoe.MiniCloud.dao;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.hilcoe.MiniCloud.entity.RefreshToken;
import com.hilcoe.MiniCloud.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RefreshTokenDAOImpl implements RefreshTokenDAO{

	EntityManager entityManager;
	
	public RefreshTokenDAOImpl(EntityManager entityManager) {
		this.entityManager=entityManager;
	}
	@Override
	public RefreshToken createToken(RefreshToken refreshToken) {
		 entityManager.persist(refreshToken);

		 return refreshToken;
	}

	@Override
	public RefreshToken findToken(String hash) {
		try {

	        return entityManager
	                .createQuery(
	                    "SELECT rt FROM RefreshToken rt WHERE rt.tokenHash = :hash",
	                    RefreshToken.class
	                )
	                .setParameter(
	                    "hash",
	                    hash
	                )
	                .getSingleResult();

	    } catch(Exception e) {

	        return null;

	    }
	}

	@Override
	public void deleteToken(UUID id) {
		RefreshToken token =
	            entityManager.find(
	                    RefreshToken.class,
	                    id
	            );

	    if(token != null) {

	        entityManager.remove(
	                token
	        );

	    }
		
	}


}
