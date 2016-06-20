package com.weichat.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Zhengwuqingkuang.findAll", query = "SELECT z FROM Zhengwuqingkuang z")
public class Zhengwuqingkuang implements Serializable {
	private static final long serialVersionUID = 1L;

	private String chartreviewcon;

	private String chartreviewtime;

	private String commercialtaxcon;

	private String commercialtaxtime;

	private String constructionprojectCon;

	private String constructionprojectTime;

	private String controlUnitcon;

	private String controlUnitTime;

	private String eiacon;

	private String eiatime;

	private String fireinspectionCon;

	private String fireinspectionTime;

	private double id;

	private String othercon;

	private String otherTime;

	private String permissioncon;

	private String permissiontime;

	private String permitcon;

	private String permittime;

	private String programmeReportcon;

	private String programmeReportTime;

	private String projextcon;

	private String projexttime;

	private String recordcon;

	private String recordTime;

	public Zhengwuqingkuang() {
	}

	public String getChartreviewcon() {
		return this.chartreviewcon;
	}

	public void setChartreviewcon(String chartreviewcon) {
		this.chartreviewcon = chartreviewcon;
	}

	public String getChartreviewtime() {
		return this.chartreviewtime;
	}

	public void setChartreviewtime(String chartreviewtime) {
		this.chartreviewtime = chartreviewtime;
	}

	public String getCommercialtaxcon() {
		return this.commercialtaxcon;
	}

	public void setCommercialtaxcon(String commercialtaxcon) {
		this.commercialtaxcon = commercialtaxcon;
	}

	public String getCommercialtaxtime() {
		return this.commercialtaxtime;
	}

	public void setCommercialtaxtime(String commercialtaxtime) {
		this.commercialtaxtime = commercialtaxtime;
	}

	public String getConstructionprojectCon() {
		return this.constructionprojectCon;
	}

	public void setConstructionprojectCon(String constructionprojectCon) {
		this.constructionprojectCon = constructionprojectCon;
	}

	public String getConstructionprojectTime() {
		return this.constructionprojectTime;
	}

	public void setConstructionprojectTime(String constructionprojectTime) {
		this.constructionprojectTime = constructionprojectTime;
	}

	public String getControlUnitcon() {
		return this.controlUnitcon;
	}

	public void setControlUnitcon(String controlUnitcon) {
		this.controlUnitcon = controlUnitcon;
	}

	public String getControlUnitTime() {
		return this.controlUnitTime;
	}

	public void setControlUnitTime(String controlUnitTime) {
		this.controlUnitTime = controlUnitTime;
	}

	public String getEiacon() {
		return this.eiacon;
	}

	public void setEiacon(String eiacon) {
		this.eiacon = eiacon;
	}

	public String getEiatime() {
		return this.eiatime;
	}

	public void setEiatime(String eiatime) {
		this.eiatime = eiatime;
	}

	public String getFireinspectionCon() {
		return this.fireinspectionCon;
	}

	public void setFireinspectionCon(String fireinspectionCon) {
		this.fireinspectionCon = fireinspectionCon;
	}

	public String getFireinspectionTime() {
		return this.fireinspectionTime;
	}

	public void setFireinspectionTime(String fireinspectionTime) {
		this.fireinspectionTime = fireinspectionTime;
	}

	public double getId() {
		return this.id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getOthercon() {
		return this.othercon;
	}

	public void setOthercon(String othercon) {
		this.othercon = othercon;
	}

	public String getOtherTime() {
		return this.otherTime;
	}

	public void setOtherTime(String otherTime) {
		this.otherTime = otherTime;
	}

	public String getPermissioncon() {
		return this.permissioncon;
	}

	public void setPermissioncon(String permissioncon) {
		this.permissioncon = permissioncon;
	}

	public String getPermissiontime() {
		return this.permissiontime;
	}

	public void setPermissiontime(String permissiontime) {
		this.permissiontime = permissiontime;
	}

	public String getPermitcon() {
		return this.permitcon;
	}

	public void setPermitcon(String permitcon) {
		this.permitcon = permitcon;
	}

	public String getPermittime() {
		return this.permittime;
	}

	public void setPermittime(String permittime) {
		this.permittime = permittime;
	}

	public String getProgrammeReportcon() {
		return this.programmeReportcon;
	}

	public void setProgrammeReportcon(String programmeReportcon) {
		this.programmeReportcon = programmeReportcon;
	}

	public String getProgrammeReportTime() {
		return this.programmeReportTime;
	}

	public void setProgrammeReportTime(String programmeReportTime) {
		this.programmeReportTime = programmeReportTime;
	}

	public String getProjextcon() {
		return this.projextcon;
	}

	public void setProjextcon(String projextcon) {
		this.projextcon = projextcon;
	}

	public String getProjexttime() {
		return this.projexttime;
	}

	public void setProjexttime(String projexttime) {
		this.projexttime = projexttime;
	}

	public String getRecordcon() {
		return this.recordcon;
	}

	public void setRecordcon(String recordcon) {
		this.recordcon = recordcon;
	}

	public String getRecordTime() {
		return this.recordTime;
	}

	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}

}