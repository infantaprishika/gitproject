package com.furniture.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;

@Entity
public class Supplier {

	@Id
	private int supplierId;
	
	private String supplierName;
	
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	
	
}
