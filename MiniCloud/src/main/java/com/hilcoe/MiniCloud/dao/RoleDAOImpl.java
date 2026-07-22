package com.hilcoe.MiniCloud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hilcoe.MiniCloud.entity.Role;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RoleDAOImpl implements RoleDAO{
	
	EntityManager entityManager;
	
	@Autowired
	public RoleDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Role createRole(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getRole(Integer id) {
		return null;
	}

	@Override
	public List<Role> getRoles() {
		TypedQuery<Role> queryResult = entityManager.createQuery("FROM Role", Role.class);
		
		List<Role> roles = queryResult.getResultList();
		return roles;
	}

	@Override
	public Role updateRole(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRole(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Role findByName(String roleName) {
		try {
			Role role = entityManager.createQuery("SELECT s FROM Role s WHERE s.name=:roleName", Role.class).setParameter("roleName", roleName).getSingleResult();
		
			return role;
		} catch (NoResultException e) {
			return null;
		}
	}

	

}
