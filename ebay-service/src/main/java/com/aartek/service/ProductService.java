package com.aartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.Product;
import com.aartek.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	public ProductRepository pr;
	
	public List<Product> prodService(Product product){
		System.out.println("Inside  ProductService");
		pr.saveProduct(product);
		List<Product> li= pr.findProduct();
		System.out.println("end of  ProductService");
		return li;
	}
}
