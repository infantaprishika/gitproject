package com.furniture.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.furniture.model.Product;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addProduct(Product obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(obj);
		
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		Product obj=(Product) sessionFactory.getCurrentSession().get(Product.class, productId);
		sessionFactory.getCurrentSession().delete(obj);
		
	}

	@Override
	public void editProduct(int productId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> listAllProduct() {
		// TODO Auto-generated method stub
		 return (List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class).list();
	}

	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return	(Product)sessionFactory.getCurrentSession().get(Product.class, productId);

		
		}
	

}
