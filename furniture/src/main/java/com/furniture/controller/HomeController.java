package com.furniture.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.furniture.model.Category;
import com.furniture.model.Product;
import com.furniture.model.Supplier;
import com.furniture.service.CategoryService;
import com.furniture.service.ProductService;
import com.furniture.service.SupplierService;

@Controller
public class HomeController {

	@Autowired
	SupplierService supplierService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/")
	public ModelAndView test(){		 
		return new ModelAndView("index");
	}
	
	//Takes us from Home page nav bar to the CRUD page
	
	@RequestMapping("supplierpage")
	public ModelAndView supplercrud(@ModelAttribute("command") Supplier supplier){	
		
		List<Supplier> list = supplierService.listAllSuppliers();
		 Map<String, Object> model = new HashMap<String, Object>();
		 model.put("supplierlist", list);
		return new ModelAndView("suppliercrud", model);
	}

	
	@RequestMapping("addSupplier")
	public ModelAndView addSupplier(@ModelAttribute("command") Supplier supplier){
		
		
		supplierService.addSupplier(supplier);
		return new ModelAndView("success");
	}
	
	@RequestMapping("editSupplier")
	public ModelAndView editSupplier(@RequestParam("id") int supplierId, @ModelAttribute("command") Supplier supplier){
		
		Supplier obj= supplierService.getSupplier(supplierId);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("supplier",  obj);
		return new ModelAndView("suppliercrud", model);
	}
	
	
	@RequestMapping("deleteSupplier")
	public ModelAndView deleteSupplier(@RequestParam("id") int supplierId){
		supplierService.deleteSupplier(supplierId);
		return new ModelAndView("success");
	}
	
	
	
	//Request Mappings for Category is here
	
	
	@RequestMapping("categorypage")
	public ModelAndView categorypage(@ModelAttribute("command") Category category){
		 List<Category> list = categoryService.listAllCategory();
		 
		 Map<String, Object> model = new HashMap<>();
		 model.put("categorylist", list);
		
		return new ModelAndView("categorycrud", model);
	}
	
	@RequestMapping("addCategory")
	public ModelAndView addCategory(@ModelAttribute("command") Category category){
		categoryService.addCategory(category);
		return new ModelAndView("success");
	}
	
	@RequestMapping("editCategory")
	public ModelAndView editCategory( @RequestParam("id") int categoryId, @ModelAttribute("command") Category category ){
	   Category obj=	 categoryService.getCategory(categoryId);
	   Map<String, Object> model = new HashMap<>();
		 model.put("category", obj);
		return new ModelAndView("categorycrud", model);
	}
	
	@RequestMapping("deleteCategory")
	public ModelAndView deleteCategory(@RequestParam("id") int categoryId){
		 categoryService.deleteCategory(categoryId);
		return new ModelAndView("success");
	}
	
	
	//Request Mappings for Product is here
	@RequestMapping("productpage")
	public ModelAndView productpage(@ModelAttribute("command") Product product){
		 List<Product> prodlist =productService.listAllProduct();
		 List<Category> catlist=categoryService.listAllCategory();
		 List<Supplier> suplist=supplierService.listAllSuppliers();
		 
		 Map<String, Object> model = new HashMap<>();
		 model.put("productList", prodlist);
		 model.put("categoryList", catlist);
		 model.put("supplierList", suplist);
		return new ModelAndView("productcrud", model);
	}
	
	
	@RequestMapping("addProduct")
	public ModelAndView addProduct(@ModelAttribute("command") Product product){
		System.out.println("Entering Add Product Method" + product.productId + product.categoryId +"\t "+product.supplierId+"\t"+ product.getSupplierId());
		productService.addProduct(product);
		System.out.println("Addinng prdouct into db");
		return new ModelAndView("success");
	}
	
	@RequestMapping("editProduct")
	public ModelAndView editProduct( @RequestParam("id") int productId, @ModelAttribute("command") Product product ){
	   Product obj=	 productService.getProduct(productId);
	   Map<String, Object> model = new HashMap<>();
		 model.put("product", obj);
		return new ModelAndView("categorycrud", model);
	}
	
	
	
}
