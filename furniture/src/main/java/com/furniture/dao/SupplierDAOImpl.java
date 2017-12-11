package com.furniture.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.furniture.model.Supplier;


@Repository

/*
 * You must enable the transaction support (<tx:annotation-driven> or @EnableTransactionManagement) and declare the transactionManager and it should work through the SessionFactory.

You must add @Transactional into your @Repository

With @Transactional in your @Repository Spring is able to apply transactional support into your repository.
 * */
 
@Transactional
public class SupplierDAOImpl implements SupplierDAO{
	
	
	@Autowired
	SessionFactory sessionFactory;
	

	@Override
	public void addSupplier(Supplier obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(obj);
	}

	@Override
	public void deleteSupplier(int supplierId) {
		// TODO Auto-generated method stub
		Supplier obj = (Supplier) sessionFactory.getCurrentSession().get(Supplier.class, supplierId);
		sessionFactory.getCurrentSession().delete(obj);
	}

	@Override
	public void editSupplier(int supplierId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Supplier> listAllSuppliers() {
		 
		 return (List<Supplier>)	sessionFactory.getCurrentSession().createCriteria(Supplier.class).list();
		 
	}

	@Override
	public Supplier getSupplier(int supplierId) {
		// TODO Auto-generated method stub
		
	    return	(Supplier)sessionFactory.getCurrentSession().get(Supplier.class, supplierId);
 
	 
		
		 
	}

}
