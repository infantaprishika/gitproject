package com.furniture.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {
	
	@Id
	@Column
	public int productId;
	
	@Column
	public String productName;
	
	@Column
	public String productDescription;
	
	@Column
	public long productPrice;
	
	@Transient
	public  MultipartFile image;
	
	public MultipartFile getImage() {
		return image;
	
	}
	public void setImage(MultipartFile image) {
		this.image=image;
	}
	
	public int getproductId(){
		return productId;
	}
	public void setProductId(int productId){
		this.productId=productId;
	}
	
	public String getproductName(){
		return productName;
	}
	public void setProductName(String productName){
		this.productName=productName;
	}
	
	public String getproductDescription(){
		return productDescription;
	}
	public void setProductDescription(String productName){
		this.productName=productName;
	}
	
	public long getproductPrice(){
		return productPrice;
	}
	public void setProductPrice(long productPrice){
		this.productPrice=productPrice;
	}
	
	public int categoryId;
	public int supplierId;
	
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	
	@ManyToOne
	@JoinColumn(name ="categoryId" , nullable = false, updatable = false, insertable= false)
	public  Category category;
	
	public Category getCategory(){
		return category;
	}
	public void setCategory(Category category){
		this.category = category;
	}
	
	@ManyToOne
	@JoinColumn(name="supplierId", nullable=false,updatable=false,insertable=false)	
	
	public  Supplier supplier;
	
	public Supplier getSupplier(){
		return supplier;
	}
	public void setSupplier(Supplier supplier){
		this.supplier=supplier;
	}
	
	
}
