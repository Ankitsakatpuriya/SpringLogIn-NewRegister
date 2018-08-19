package com.aartek.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.Product;
import com.aartek.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	public ProductService ps;
	
	@RequestMapping("/productPage")
	public String  showProduct(Model model){
		ArrayList<Product> li=null;
		Product product=new Product();
		model.addAttribute("addProduct", product);
		return "product";
	}
	
	@RequestMapping(value="/product1" , method=RequestMethod.POST)
	public String submitProduct(@ModelAttribute("addProduct")Product product , Model model){
		System.out.println("InsideProduct Controller");
		
		List li=ps.prodService(product);
		Iterator<Product> it=li.iterator();
		while(it.hasNext()){
			Product prod=(Product)it.next();
			System.out.println(prod.getPid()+"   "+prod.getPname()+"   "+prod.getPprice()+"   "+prod.getDate()+"   "+prod.getPdesc());
		}
		
		product=new Product();
		model.addAttribute("addProduct", product);
		model.addAttribute("prodList", li);
		return "product";
	}
}