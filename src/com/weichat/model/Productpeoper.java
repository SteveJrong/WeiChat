package com.weichat.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Productpeoper.findAll", query = "SELECT p FROM Productpeoper p")
public class Productpeoper implements Serializable {
	private static final long serialVersionUID = 1L;

	private double id;

	private String name;

	private String telphone;

	public Productpeoper() {
	}

	public double getId() {
		return this.id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelphone() {
		return this.telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

}