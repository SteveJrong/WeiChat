package com.weichat.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Qiyefuwu.findAll", query = "SELECT q FROM Qiyefuwu q")
public class Qiyefuwu implements Serializable {
	private static final long serialVersionUID = 1L;

	private double id;

	private String longzhi;

	private String pinpai;

	private String pinxun;

	private String yongGong;

	public Qiyefuwu() {
	}

	public double getId() {
		return this.id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getLongzhi() {
		return this.longzhi;
	}

	public void setLongzhi(String longzhi) {
		this.longzhi = longzhi;
	}

	public String getPinpai() {
		return this.pinpai;
	}

	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}

	public String getPinxun() {
		return this.pinxun;
	}

	public void setPinxun(String pinxun) {
		this.pinxun = pinxun;
	}

	public String getYongGong() {
		return this.yongGong;
	}

	public void setYongGong(String yongGong) {
		this.yongGong = yongGong;
	}

}