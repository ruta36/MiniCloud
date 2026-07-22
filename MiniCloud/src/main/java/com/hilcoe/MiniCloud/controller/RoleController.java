package com.hilcoe.MiniCloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hilcoe.MiniCloud.entity.Role;
import com.hilcoe.MiniCloud.service.RoleService;

@RestController
@RequestMapping("/api/role")
public class RoleController {
	
	RoleService roleService;
	
	@Autowired
	public RoleController(RoleService roleService) {
		this.roleService = roleService;
	}
	
	@GetMapping("/")
	public List<Role> getAllRoles() {
		List<Role> roles = roleService.getAllRoles();
		return roles;
	}
}
