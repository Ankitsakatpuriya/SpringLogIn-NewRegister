package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.Product;

@Repository
public class ProductRepository {
	
	@Autowired
	public HibernateTemplate ht;
	
	public void saveProduct(Product product){
		System.out.println("Inside ProductRepository save");
		
		ht.save("Product", product);
		System.out.println("Successfully saved product.");
	}
	
	public List<Product> findProduct(){
		System.out.println("Inside ProductRepository find");
		List<Product> li=ht.find("from Product");
		return li;
	}
}
