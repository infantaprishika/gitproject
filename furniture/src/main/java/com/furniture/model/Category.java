package com.furniture.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Category {
	
@Id
	public int categoryId;
	public String categoryName;
	
  public int getCategoryId(){
	  return categoryId;
  }
  public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
  }

  public String getCategoryName(){
	  return categoryName;
  }
  public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
  }
}
