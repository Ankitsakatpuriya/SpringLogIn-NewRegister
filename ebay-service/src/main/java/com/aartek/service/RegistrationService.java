package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.User;
import com.aartek.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	public RegistrationRepository rr;
	
	public void registerService(User user){
		System.out.println("Inside RegistrationService");
		rr.registerRepo(user);
	}
}
