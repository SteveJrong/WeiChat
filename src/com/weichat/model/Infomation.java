package com.weichat.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Infomation.findAll", query = "SELECT i FROM Infomation i")
public class Infomation implements Serializable {
	private static final long serialVersionUID = 1L;

	private String agreement;

	private String annualtax;

	private String area;

	private String begintime;

	private String beizhu;

	private String completiontime;

	private String contacts;

	private String dustry;

	private String enterprisewebsite;

	private String estimated;

	private double id;

	private String industrycode;

	private String legalperson;

	private String name;

	private String productdes;

	private String productname;

	private String qyname;

	private String signingtime;

	private String telenumber;

	public Infomation() {
	}

	public String getAgreement() {
		return this.agreement;
	}

	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}

	public String getAnnualtax() {
		return this.annualtax;
	}

	public void setAnnualtax(String annualtax) {
		this.annualtax = annualtax;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getBegintime() {
		return this.begintime;
	}

	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public String getCompletiontime() {
		return this.completiontime;
	}

	public void setCompletiontime(String completiontime) {
		this.completiontime = completiontime;
	}

	public String getContacts() {
		return this.contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getDustry() {
		return this.dustry;
	}

	public void setDustry(String dustry) {
		this.dustry = dustry;
	}

	public String getEnterprisewebsite() {
		return this.enterprisewebsite;
	}

	public void setEnterprisewebsite(String enterprisewebsite) {
		this.enterprisewebsite = enterprisewebsite;
	}

	public String getEstimated() {
		return this.estimated;
	}

	public void setEstimated(String estimated) {
		this.estimated = estimated;
	}

	public double getId() {
		return this.id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getIndustrycode() {
		return this.industrycode;
	}

	public void setIndustrycode(String industrycode) {
		this.industrycode = industrycode;
	}

	public String getLegalperson() {
		return this.legalperson;
	}

	public void setLegalperson(String legalperson) {
		this.legalperson = legalperson;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductdes() {
		return this.productdes;
	}

	public void setProductdes(String productdes) {
		this.productdes = productdes;
	}

	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getQyname() {
		return this.qyname;
	}

	public void setQyname(String qyname) {
		this.qyname = qyname;
	}

	public String getSigningtime() {
		return this.signingtime;
	}

	public void setSigningtime(String signingtime) {
		this.signingtime = signingtime;
	}

	public String getTelenumber() {
		return this.telenumber;
	}

	public void setTelenumber(String telenumber) {
		this.telenumber = telenumber;
	}

}