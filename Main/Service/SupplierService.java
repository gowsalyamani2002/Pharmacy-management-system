package com.example.pharmacy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pharmacy.entity.StockDetails;
import com.example.pharmacy.entity.SupplierDetails;
import com.example.pharmacy.repository.Stockrepository;
import com.example.pharmacy.repository.SupplierRepository;

@Service
public class SupplierService {
	
	    @Autowired
		private SupplierRepository supplierrepo;
	    
	    
		//add
		public void addSupplier(SupplierDetails supplierdetails) {
			supplierrepo.save(supplierdetails);
		}
		
		//view
		public List<SupplierDetails > getAllSupplier(){
			return supplierrepo.findAll();
		}
		
		//update
		public SupplierDetails getSupplierDetailsById(int supplierID) {
			
			return supplierrepo.findById(supplierID).get();
		}
		//delete
		
		public void deleteById(int supplierID) {
			
			supplierrepo.deleteById(supplierID);
		}

}
