package com.example.pharmacy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="supplier")

public class SupplierDetails {
	@Id
	private int supplierID;
    private String supplierName;
    private int drugID;
    private String supplierContact;
    
    public SupplierDetails() {
    	super();
    }

    // Constructor
    public SupplierDetails(int supplierID, String supplierName, int drugID ,String supplierContact) {
    	super();
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.drugID = drugID;
        this.supplierContact = supplierContact;
    }
    
    // Getters and setters	

	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
    
	public String getSupplierContact() {
		return supplierContact;
	}
	
	public void setSupplierContact(String supplierContact) {
		this.supplierContact = supplierContact;
	}

	public int getDrugID() {
		return drugID;
	}

	public void setDrugID(int drugID) {
		this.drugID = drugID;
	}
	

}
