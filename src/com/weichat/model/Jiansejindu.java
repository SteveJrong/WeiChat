package com.weichat.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Jiansejindu.findAll", query = "SELECT j FROM Jiansejindu j")
public class Jiansejindu implements Serializable {
	private static final long serialVersionUID = 1L;

	private double id;

	private String plannedJunC;

	private String plannedJunSol;

	private String plannedJunTime;

	private String plannedStartC;

	private String plannedStartSol;

	private String plannedStartTime;

	private String postnedJunC;

	private String postnedJunSol;

	private String postnedJunTime;

	private String postnedStartC;

	private String postnedStartSol;

	private String postnedStartTime;

	private String progress;

	private String scale;

	public Jiansejindu() {
	}

	public double getId() {
		return this.id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getPlannedJunC() {
		return this.plannedJunC;
	}

	public void setPlannedJunC(String plannedJunC) {
		this.plannedJunC = plannedJunC;
	}

	public String getPlannedJunSol() {
		return this.plannedJunSol;
	}

	public void setPlannedJunSol(String plannedJunSol) {
		this.plannedJunSol = plannedJunSol;
	}

	public String getPlannedJunTime() {
		return this.plannedJunTime;
	}

	public void setPlannedJunTime(String plannedJunTime) {
		this.plannedJunTime = plannedJunTime;
	}

	public String getPlannedStartC() {
		return this.plannedStartC;
	}

	public void setPlannedStartC(String plannedStartC) {
		this.plannedStartC = plannedStartC;
	}

	public String getPlannedStartSol() {
		return this.plannedStartSol;
	}

	public void setPlannedStartSol(String plannedStartSol) {
		this.plannedStartSol = plannedStartSol;
	}

	public String getPlannedStartTime() {
		return this.plannedStartTime;
	}

	public void setPlannedStartTime(String plannedStartTime) {
		this.plannedStartTime = plannedStartTime;
	}

	public String getPostnedJunC() {
		return this.postnedJunC;
	}

	public void setPostnedJunC(String postnedJunC) {
		this.postnedJunC = postnedJunC;
	}

	public String getPostnedJunSol() {
		return this.postnedJunSol;
	}

	public void setPostnedJunSol(String postnedJunSol) {
		this.postnedJunSol = postnedJunSol;
	}

	public String getPostnedJunTime() {
		return this.postnedJunTime;
	}

	public void setPostnedJunTime(String postnedJunTime) {
		this.postnedJunTime = postnedJunTime;
	}

	public String getPostnedStartC() {
		return this.postnedStartC;
	}

	public void setPostnedStartC(String postnedStartC) {
		this.postnedStartC = postnedStartC;
	}

	public String getPostnedStartSol() {
		return this.postnedStartSol;
	}

	public void setPostnedStartSol(String postnedStartSol) {
		this.postnedStartSol = postnedStartSol;
	}

	public String getPostnedStartTime() {
		return this.postnedStartTime;
	}

	public void setPostnedStartTime(String postnedStartTime) {
		this.postnedStartTime = postnedStartTime;
	}

	public String getProgress() {
		return this.progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public String getScale() {
		return this.scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

}