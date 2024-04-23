package com.example.pharmacy.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pharmacy.entity.Admin;

@Repository
public interface adminrepository extends JpaRepository<Admin,Integer> {
	Admin findByUsernameAndPassword(String username, String password);

}
