package com.furniture.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furniture.dao.CategoryDAO;
import com.furniture.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDAO categoryDAO;

	@Override
	public void addCategory(Category obj) {
		// TODO Auto-generated method stub
		
		categoryDAO.addCategory(obj);
		
	}

	@Override
	public void deleteCategory(int categoryId) {
		// TODO Auto-generated method stub
		
  		categoryDAO.deleteCategory(categoryId);
		
	}

	@Override
	public void editCategory(int categoryId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Category> listAllCategory() {
		// TODO Auto-generated method stub
		
		return categoryDAO.listAllCategory();
		
	}

	@Override
	public Category getCategory(int categoryId) {
		// TODO Auto-generated method stub
		
		return categoryDAO.getCategory(categoryId);
		
	}
	

}
