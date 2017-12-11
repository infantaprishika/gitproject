package com.furniture.dao;

import java.util.List;
import com.furniture.model.Product;

public interface ProductDAO {
	
	public  void addProduct( Product obj);
	public  void deleteProduct( int productId);
	public void editProduct(int productId);
	public  List<Product> listAllProduct();
	public  Product getProduct(int productId);
	

}
