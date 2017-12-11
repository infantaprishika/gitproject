package com.furniture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furniture.dao.SupplierDAO;
import com.furniture.model.Supplier;

@Service
public class SupplierServiceImpl implements SupplierService{
	
	@Autowired 
	SupplierDAO supplierDAO;
	
	@Override
	public void addSupplier(Supplier obj) {
		// TODO Auto-generated method stub
		supplierDAO.addSupplier(obj);
	}

	@Override
	public void deleteSupplier(int supplierId) {
		// TODO Auto-generated method stub
		
		supplierDAO.deleteSupplier(supplierId);
		
	}

	@Override
	public void editSupplier(int supplierId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Supplier> listAllSuppliers() {
		// TODO Auto-generated method stub
		return supplierDAO.listAllSuppliers();
		
	}

	@Override
	public Supplier getSupplier(int supplierId) {
		// TODO Auto-generated method stub
		
		return supplierDAO.getSupplier(supplierId);
		 
	}

}
