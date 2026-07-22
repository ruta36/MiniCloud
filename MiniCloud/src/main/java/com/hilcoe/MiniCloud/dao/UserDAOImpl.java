package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hilcoe.MiniCloud.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO{
	
	private EntityManager entityManager;
	
	@Autowired
    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	@Override
	public User registerUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User getUser(UUID userId) {
		User user = entityManager.find(User.class, userId);
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		TypedQuery<User> users = entityManager.createQuery("FROM User", User.class);
        return users.getResultList();
	}

	@Override
	public User updateUser(UUID user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(UUID userId) {
		User user = entityManager.find(User.class, userId);
		if(user != null) {
			entityManager.remove(user);
		}
	}

	@Override
	public User findByUsername(String username) {
		try {
			User user = entityManager.createQuery("SELECT s FROM User s WHERE s.userName=:username", User.class).setParameter("username", username).getSingleResult();
			return user;
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public User findByEmail(String email) {
		
		try {
			User user = entityManager.createQuery("SELECT s FROM User s WHERE s.email=:email", User.class).setParameter("email", email).getSingleResult();
			return user;
			
		} catch (NoResultException e) {
			return null;
		}
		 
	}

}
