package com.example.pharmacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pharmacy.entity.StockDetails;

public interface Stockrepository extends JpaRepository<StockDetails, Integer>{
		
		}



