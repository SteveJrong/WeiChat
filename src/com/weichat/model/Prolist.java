package com.weichat.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Prolist.findAll", query = "SELECT p FROM Prolist p")
public class Prolist implements Serializable {
	private static final long serialVersionUID = 1L;

	private String fang;

	private double freecheck;

	private double howlong;

	private double id;

	private double money;

	@Column(name = "pro_id")
	private double proId;

	private String uploadfu;

	public Prolist() {
	}

	public String getFang() {
		return this.fang;
	}

	public void setFang(String fang) {
		this.fang = fang;
	}

	public double getFreecheck() {
		return this.freecheck;
	}

	public void setFreecheck(double freecheck) {
		this.freecheck = freecheck;
	}

	public double getHowlong() {
		return this.howlong;
	}

	public void setHowlong(double howlong) {
		this.howlong = howlong;
	}

	public double getId() {
		return this.id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public double getMoney() {
		return this.money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getProId() {
		return this.proId;
	}

	public void setProId(double proId) {
		this.proId = proId;
	}

	public String getUploadfu() {
		return this.uploadfu;
	}

	public void setUploadfu(String uploadfu) {
		this.uploadfu = uploadfu;
	}

}