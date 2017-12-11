package com.furniture.service;

import java.util.List;

import com.furniture.model.Product;

public interface ProductService {

	public  void addProduct( Product obj);
	public  void deleteProduct( int productId);
	public void editProduct(int productId);
	public  List<Product> listAllProduct();
	public  Product getProduct(int productId);
	
}
