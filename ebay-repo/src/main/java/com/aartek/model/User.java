package com.aartek.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id=null;
	
	@Column(name="email" , nullable=false , unique=true)
	private String email=null;
	
	@Column(name="password")
	private String password=null;
	
	@Column(name="fname")
	private String fname=null;
	
	@Column(name="lname")
	private String lname=null;
	
	@Column(name="mobno")
	private Long mobno=null;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Long getMobno() {
		return mobno;
	}

	public void setMobno(Long mobno) {
		this.mobno = mobno;
	}

}