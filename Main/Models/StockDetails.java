package com.example.pharmacy.entity;


	
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="stock")
	public class StockDetails{
		
		@Id
		private int drugID;
	    private String drugName;
	    private int quantity;
	   @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date expiredDate;
	    private int price;


	    // Constructor
	    public StockDetails() {
	    	super();
	    	
	    }
	    public StockDetails(int drugID, String drugName,  int quantity,Date expiredDate, int price) {
	    	super();
	        this.drugID = drugID;
	        this.drugName = drugName;
	        this.quantity = quantity;
	        this.expiredDate = expiredDate;
	        this.price = price;
	    }

		public int getDrugID() {
			return drugID;
		}

		public void setDrugID(int drugID) {
			this.drugID = drugID;
		}

		public String getDrugName() {
			return drugName;
		}

		public void setDrugName(String drugName) {
			this.drugName = drugName;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public Date getExpiredDate() {
			return expiredDate;
		}

		public void setExpiredDate(Date expiredDate) {
			this.expiredDate = expiredDate;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

	}

		


