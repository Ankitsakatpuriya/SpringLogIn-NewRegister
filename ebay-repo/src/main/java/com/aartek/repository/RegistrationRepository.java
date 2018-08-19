package com.aartek.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.User;

@Repository
public class RegistrationRepository {
	
	@Autowired
	public HibernateTemplate ht;
	
	public void registerRepo(User user){
		System.out.println("Inside Registration Repository");
		if(user.getEmail()!=null && user.getFname()!=null && user.getLname()!=null && user.getMobno()!=null && user.getPassword()!=null){
			ht.save("User", user);
			System.out.println("Registered Successfully.");
		}
		else {
			System.out.println("Enter complete details.");
		}
	}
}
