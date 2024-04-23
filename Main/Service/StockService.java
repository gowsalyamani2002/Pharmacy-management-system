package com.example.pharmacy.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pharmacy.entity.StockDetails;
import com.example.pharmacy.repository.Stockrepository;

@Service
public class StockService {
	
	   @Autowired
		private Stockrepository stockrepo;
		//add
		public void addStock(StockDetails stockdetails) {
			stockrepo.save(stockdetails);
		}
		
		//view
		public List<StockDetails> getAllStock(){
			return stockrepo.findAll();
		}
		
		//update
		public StockDetails getStockDetailsById(int drugID) {
			
			return stockrepo.findById(drugID).get();
		}
		//delete
		
		public void deleteById(int drugID) {
			
			stockrepo.deleteById(drugID);
		}


		

		 
		 

		
	}



