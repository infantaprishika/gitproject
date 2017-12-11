package com.furniture.service;

import java.util.List;

import com.furniture.model.Category;


public interface CategoryService {
	
	public void addCategory(Category obj);	
	public void deleteCategory( int categoryId);
	public void editCategory(int categoryId);
	public List<Category> listAllCategory();
	public Category getCategory(int categoryId);
}



