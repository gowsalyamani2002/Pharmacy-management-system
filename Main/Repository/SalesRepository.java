package com.example.pharmacy.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pharmacy.entity.SalesDetails;

public interface  SalesRepository extends JpaRepository<SalesDetails,Integer>{

}
