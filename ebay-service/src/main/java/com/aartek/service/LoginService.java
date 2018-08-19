package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.User;
import com.aartek.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	public LoginRepository lr;
	
	public void showService(User user){
		System.out.println("Inside LoginService");
		System.out.println("Service: Email : "+user.getEmail());
		System.out.println("Service: Password : "+user.getPassword());
		lr.showRepo(user);
	}

}
