package com.weichat.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Youhuizhengce.findAll", query = "SELECT y FROM Youhuizhengce y")
public class Youhuizhengce implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cashsituation;

	private String content;

	private double id;

	private String money;

	private String typename;

	public Youhuizhengce() {
	}

	public String getCashsituation() {
		return this.cashsituation;
	}

	public void setCashsituation(String cashsituation) {
		this.cashsituation = cashsituation;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getId() {
		return this.id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getMoney() {
		return this.money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

}