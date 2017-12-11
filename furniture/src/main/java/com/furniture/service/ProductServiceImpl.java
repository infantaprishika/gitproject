package com.furniture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furniture.dao.ProductDAO;
import com.furniture.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDAO productDAO;

	@Override
	public void addProduct(Product obj) {
		// TODO Auto-generated method stub
		productDAO.addProduct(obj);
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		productDAO.deleteProduct(productId);
		
	}

	@Override
	public void editProduct(int productId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> listAllProduct() {
		// TODO Auto-generated method stub
		return productDAO.listAllProduct();
	}

	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return productDAO.getProduct(productId);
	}
	

}
