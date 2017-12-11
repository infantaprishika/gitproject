package com.furniture.dao;

import java.util.List;

import com.furniture.model.Supplier;

public interface SupplierDAO {
	
	public void addSupplier( Supplier obj );
	public void deleteSupplier( int supplierId);
	public void editSupplier(int supplierId);
	public List<Supplier> listAllSuppliers();
	public Supplier getSupplier(int supplierId);
	

}
