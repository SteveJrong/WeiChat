package com.weichat.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Dangtuanjianshe.findAll", query = "SELECT d FROM Dangtuanjianshe d")
public class Dangtuanjianshe implements Serializable {
	private static final long serialVersionUID = 1L;

	private String dangwugzz;

	private String dangYPeoper;

	private String huoDongkaiZhan;

	private double id;

	private String jianSeQingK;

	private String phone;

	private String shuji;

	private String tjianSeQingK;

	private String tuanYPeoper;

	public Dangtuanjianshe() {
	}

	public String getDangwugzz() {
		return this.dangwugzz;
	}

	public void setDangwugzz(String dangwugzz) {
		this.dangwugzz = dangwugzz;
	}

	public String getDangYPeoper() {
		return this.dangYPeoper;
	}

	public void setDangYPeoper(String dangYPeoper) {
		this.dangYPeoper = dangYPeoper;
	}

	public String getHuoDongkaiZhan() {
		return this.huoDongkaiZhan;
	}

	public void setHuoDongkaiZhan(String huoDongkaiZhan) {
		this.huoDongkaiZhan = huoDongkaiZhan;
	}

	public double getId() {
		return this.id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getJianSeQingK() {
		return this.jianSeQingK;
	}

	public void setJianSeQingK(String jianSeQingK) {
		this.jianSeQingK = jianSeQingK;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getShuji() {
		return this.shuji;
	}

	public void setShuji(String shuji) {
		this.shuji = shuji;
	}

	public String getTjianSeQingK() {
		return this.tjianSeQingK;
	}

	public void setTjianSeQingK(String tjianSeQingK) {
		this.tjianSeQingK = tjianSeQingK;
	}

	public String getTuanYPeoper() {
		return this.tuanYPeoper;
	}

	public void setTuanYPeoper(String tuanYPeoper) {
		this.tuanYPeoper = tuanYPeoper;
	}

}