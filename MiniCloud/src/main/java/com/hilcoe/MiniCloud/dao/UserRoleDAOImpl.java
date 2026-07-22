package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hilcoe.MiniCloud.entity.Role;
import com.hilcoe.MiniCloud.entity.User;
import com.hilcoe.MiniCloud.entity.UserRole;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserRoleDAOImpl implements UserRoleDAO{

	EntityManager entityManager;
	
	@Autowired
	public UserRoleDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public void assignRole(UserRole userRole) {
		entityManager.persist(userRole);
	}

	@Override
	public void removeRole(UUID userId, Integer roleId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserRole> getUserRoles(User user) {
		try {
			List<UserRole> role = entityManager.createQuery("SELECT s FROM UserRole s WHERE s.user=:user", UserRole.class).setParameter("user", user).getResultList();
			return role;
		} catch (NoResultException e) {
			return null;
		}
	}

	
}
