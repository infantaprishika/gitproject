package com.furniture.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.furniture.model.Category;

@Repository
@Transactional
public class CategoryDAOImpl implements CategoryDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	public void addCategory(Category obj) {
		// TODO Auto-generated method stub
		
		sessionFactory.getCurrentSession().saveOrUpdate(obj);
		
	}

	public void deleteCategory(int categoryId) {
		// TODO Auto-generated method stub
		
		Category obj=(Category) sessionFactory.getCurrentSession().get(Category.class, categoryId);
		sessionFactory.getCurrentSession().delete(obj);
		
	}

	
	public void editCategory(int categoryId) {
		// TODO Auto-generated method stub
		
		
	}

	public List<Category> listAllCategory() {
		// TODO Auto-generated method stub
		
		 return (List<Category>) sessionFactory.getCurrentSession().createCriteria(Category.class).list();
		 
		
	}

	public Category getCategory(int categoryId) {
		// TODO Auto-generated method stub
		
		return	(Category)sessionFactory.getCurrentSession().get(Category.class, categoryId);
	}
	
 
}
