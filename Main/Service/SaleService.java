package com.example.pharmacy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pharmacy.entity.SalesDetails;
import com.example.pharmacy.entity.SupplierDetails;
import com.example.pharmacy.repository.SalesRepository;
import com.example.pharmacy.repository.SupplierRepository;


@Service
public class SaleService {
	
	@Autowired
	private SalesRepository salerepo;
	//add
	public void addSale(SalesDetails saledetails) {
		salerepo.save(saledetails);
	}
	
	//view
	public List<SalesDetails > getAllSale(){
		return salerepo.findAll();
	}
	
	//update
	public SalesDetails  getSaleDetailsById(int saleID) {
		
		return salerepo.findById(saleID).get();
	}
	//delete
	
	public void deleteById(int saleID) {
		
		salerepo.deleteById(saleID);
	}

}
	

