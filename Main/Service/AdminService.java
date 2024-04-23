package com.example.pharmacy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pharmacy.entity.Admin;
import com.example.pharmacy.repository.adminrepository;

@Service
public class AdminService {
	
	@Autowired
	private adminrepository adminrepo;
	
	
	public Admin admin(String username, String password) {
	     Admin  admin= adminrepo.findByUsernameAndPassword(username, password);
	      return admin;
	  }

	 
	
	
	
	
	
	

}
