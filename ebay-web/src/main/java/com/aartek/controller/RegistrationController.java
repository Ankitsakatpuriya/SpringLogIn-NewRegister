package com.aartek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.User;
import com.aartek.service.RegistrationService;

@Controller
public class RegistrationController {
	
	@Autowired
	public RegistrationService rs;
	
	@RequestMapping("/registrationPage")
	public String registrationPage(Model model){
		User user=new User();
		model.addAttribute("registrationUser",user);
		return "registration";
	}
	
	@RequestMapping(value="/registration1" , method=RequestMethod.POST)
	public String registrationUser(@ModelAttribute() User user,Model model){
		System.out.println("Inside RegistrationController");
		rs.registerService(user);
		
		/*
		user=new User();
		model.addAttribute("registrationUser",user);
		*/

		user=new User();
		model.addAttribute("keyUser",user);
		return "login";
	}
}