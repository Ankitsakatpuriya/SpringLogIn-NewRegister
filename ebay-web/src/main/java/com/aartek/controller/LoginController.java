package com.aartek.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.Product;
import com.aartek.model.User;
import com.aartek.service.LoginService;

@Controller
public class LoginController {
	
	private static Logger logger=Logger.getLogger(LoginController.class);
	
	@Autowired
	public LoginService ls;
	
	@RequestMapping("/showPage")
	public String myLogin(Model model){
		logger.info("in my login method");
		//	System.out.println("Inside LoginController");
		User user=new User();
		//	ls.showService(user);
		model.addAttribute("keyUser", user);
		return "login";
	}
	
	@RequestMapping(value="/login1", method=RequestMethod.POST)
	public String signInAction(@ModelAttribute("keyUser") User user,Model model){
		System.out.println("Inside LoginController");
		System.out.println("Controller Email : "+user.getEmail());
		System.out.println("Controller Password : "+user.getPassword());
		ls.showService(user);
		
		Product product=new Product();
		model.addAttribute("addProduct", product);
		
		return "product";	
	}
	
	
}
