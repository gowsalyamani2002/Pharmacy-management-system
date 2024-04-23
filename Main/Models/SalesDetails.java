package com.example.pharmacy.entity;



import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="sales")
public class SalesDetails {
	@Id
	private int saleID;
    private String customerName;
    private String customerContact;
    private  int drugID;  
    private int price;
    private int quantity;
    private int totalAmount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date customerDate;
	
    
    public SalesDetails() {
		super();
		
	}
    
    // Constructor
    public SalesDetails(int saleID, String customerName, String customerContact ,int drugID, int price, int quantity, int totalAmount,Date customerDate) {
    	super();
        this.saleID = saleID;
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.drugID = drugID;
        this.price = price;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.customerDate=customerDate;
    }

    public int getSaleID() {
		return saleID;
	}

	public void setSaleID(int saleID) {
		this.saleID = saleID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	
	public int getDrugID() {
		return drugID;
	}

	public void setDrugID(int drugID) {
		this.drugID = drugID;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Date getCustomerDate() {
		return customerDate;
	}
	
	public void setCustomerDate(Date customerDate) {
		this.customerDate=customerDate;
	}

}
