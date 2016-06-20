package com.weichat.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Qiyefazhan.findAll", query = "SELECT q FROM Qiyefazhan q")
public class Qiyefazhan implements Serializable {
	private static final long serialVersionUID = 1L;

	private String chanzhi;

	private double id;

	private String investment;

	private String jiushuQiye;

	private String renYuan;

	private String shangTime;

	private String shuishou;

	private String touTime;

	private String xiaTime;

	private String zhuyaoPro;

	public Qiyefazhan() {
	}

	public String getChanzhi() {
		return this.chanzhi;
	}

	public void setChanzhi(String chanzhi) {
		this.chanzhi = chanzhi;
	}

	public double getId() {
		return this.id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getInvestment() {
		return this.investment;
	}

	public void setInvestment(String investment) {
		this.investment = investment;
	}

	public String getJiushuQiye() {
		return this.jiushuQiye;
	}

	public void setJiushuQiye(String jiushuQiye) {
		this.jiushuQiye = jiushuQiye;
	}

	public String getRenYuan() {
		return this.renYuan;
	}

	public void setRenYuan(String renYuan) {
		this.renYuan = renYuan;
	}

	public String getShangTime() {
		return this.shangTime;
	}

	public void setShangTime(String shangTime) {
		this.shangTime = shangTime;
	}

	public String getShuishou() {
		return this.shuishou;
	}

	public void setShuishou(String shuishou) {
		this.shuishou = shuishou;
	}

	public String getTouTime() {
		return this.touTime;
	}

	public void setTouTime(String touTime) {
		this.touTime = touTime;
	}

	public String getXiaTime() {
		return this.xiaTime;
	}

	public void setXiaTime(String xiaTime) {
		this.xiaTime = xiaTime;
	}

	public String getZhuyaoPro() {
		return this.zhuyaoPro;
	}

	public void setZhuyaoPro(String zhuyaoPro) {
		this.zhuyaoPro = zhuyaoPro;
	}

}