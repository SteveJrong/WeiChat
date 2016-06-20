package com.weichat.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Guotu.findAll", query = "SELECT g FROM Guotu g")
public class Guotu implements Serializable {
	private static final long serialVersionUID = 1L;

	private double id;

	private String indexCon;

	private String indexTime;

	private String landCertificateC;

	private String landCertificateT;

	private String landListingcon;

	private String landListingPri;

	private String landListingTime;

	private String landSigncon;

	private String landSignTime;

	public Guotu() {
	}

	public double getId() {
		return this.id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getIndexCon() {
		return this.indexCon;
	}

	public void setIndexCon(String indexCon) {
		this.indexCon = indexCon;
	}

	public String getIndexTime() {
		return this.indexTime;
	}

	public void setIndexTime(String indexTime) {
		this.indexTime = indexTime;
	}

	public String getLandCertificateC() {
		return this.landCertificateC;
	}

	public void setLandCertificateC(String landCertificateC) {
		this.landCertificateC = landCertificateC;
	}

	public String getLandCertificateT() {
		return this.landCertificateT;
	}

	public void setLandCertificateT(String landCertificateT) {
		this.landCertificateT = landCertificateT;
	}

	public String getLandListingcon() {
		return this.landListingcon;
	}

	public void setLandListingcon(String landListingcon) {
		this.landListingcon = landListingcon;
	}

	public String getLandListingPri() {
		return this.landListingPri;
	}

	public void setLandListingPri(String landListingPri) {
		this.landListingPri = landListingPri;
	}

	public String getLandListingTime() {
		return this.landListingTime;
	}

	public void setLandListingTime(String landListingTime) {
		this.landListingTime = landListingTime;
	}

	public String getLandSigncon() {
		return this.landSigncon;
	}

	public void setLandSigncon(String landSigncon) {
		this.landSigncon = landSigncon;
	}

	public String getLandSignTime() {
		return this.landSignTime;
	}

	public void setLandSignTime(String landSignTime) {
		this.landSignTime = landSignTime;
	}

}