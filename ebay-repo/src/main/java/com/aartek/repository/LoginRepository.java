package com.aartek.repository;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.User;

@Repository
public class LoginRepository {
	
	@Autowired
	public HibernateTemplate template;
	
	public void showRepo(User user){
		System.out.println("Inside LoginRepository");
		System.out.println("Repo: Email : "+user.getEmail());
		System.out.println("Repo: Password : "+user.getPassword());
		
		if(user.getEmail()!=null && user.getPassword()!=null){
			
			List<User> li=template.find("from User u where u.email=? AND u.password=?",user.getEmail(),user.getPassword());
			Iterator<User> it=(Iterator)li.iterator();
			while(it.hasNext()){
				System.out.println("Successful Login !");
				User u1=(User)it.next();
				System.out.println(" Email : "+u1.getEmail()+" Password : "+u1.getPassword());
			}	
		}
		else{
			System.out.println("Enter correct email & password.");
		}
	}
}