package com.example.pharmacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pharmacy.entity.SupplierDetails;

public interface  SupplierRepository extends JpaRepository<SupplierDetails,Integer>{

}
