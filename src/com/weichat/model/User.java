package com.weichat.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String des;

	private String email;

	private String hobbit;

	private double id;

	private String password;

	private String place;

	private String username;

	private double usertype;

	private double zhucetype;

	public User() {
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHobbit() {
		return this.hobbit;
	}

	public void setHobbit(String hobbit) {
		this.hobbit = hobbit;
	}

	public double getId() {
		return this.id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public double getUsertype() {
		return this.usertype;
	}

	public void setUsertype(double usertype) {
		this.usertype = usertype;
	}

	public double getZhucetype() {
		return this.zhucetype;
	}

	public void setZhucetype(double zhucetype) {
		this.zhucetype = zhucetype;
	}

}