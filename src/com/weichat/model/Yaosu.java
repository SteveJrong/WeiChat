package com.weichat.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Yaosu.findAll", query = "SELECT y FROM Yaosu y")
public class Yaosu implements Serializable {
	private static final long serialVersionUID = 1L;

	private String electric;

	private String gas;

	private String hearing;

	private double id;

	private String load;

	private String regard;

	private String water;

	public Yaosu() {
	}

	public String getElectric() {
		return this.electric;
	}

	public void setElectric(String electric) {
		this.electric = electric;
	}

	public String getGas() {
		return this.gas;
	}

	public void setGas(String gas) {
		this.gas = gas;
	}

	public String getHearing() {
		return this.hearing;
	}

	public void setHearing(String hearing) {
		this.hearing = hearing;
	}

	public double getId() {
		return this.id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getLoad() {
		return this.load;
	}

	public void setLoad(String load) {
		this.load = load;
	}

	public String getRegard() {
		return this.regard;
	}

	public void setRegard(String regard) {
		this.regard = regard;
	}

	public String getWater() {
		return this.water;
	}

	public void setWater(String water) {
		this.water = water;
	}

}