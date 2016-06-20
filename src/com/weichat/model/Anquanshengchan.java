package com.weichat.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Anquanshengchan.findAll", query = "SELECT a FROM Anquanshengchan a")
public class Anquanshengchan implements Serializable {
	private static final long serialVersionUID = 1L;

	private String anquanguanli;

	private String anquanshengchan;

	private String anquansheshi;

	private String diangongzuoye;

	private String fuzeName;

	private String gaochuzuoye;

	private String hanjiezuoye;

	private double id;

	private String jianquanqingk;

	private String jiaoyuqingk;

	private String peoYuanQingk;

	private String phone;

	private String qitazuoye;

	private String shengchanchucun;

	private String shiguyinhuan;

	private String weixianhuaxue;

	private String yesName;

	private String yesornofenchen;

	private String yesOrNoJianko;

	private String yesOrNoJoinQQ;

	private String yesorxiaofang;

	private String yesoryouxiankj;

	private String yesorzhongda;

	private String yesyouname;

	private String zhilengzuoye;

	private String zhiybjiankang;

	private String zhiyebing;

	public Anquanshengchan() {
	}

	public String getAnquanguanli() {
		return this.anquanguanli;
	}

	public void setAnquanguanli(String anquanguanli) {
		this.anquanguanli = anquanguanli;
	}

	public String getAnquanshengchan() {
		return this.anquanshengchan;
	}

	public void setAnquanshengchan(String anquanshengchan) {
		this.anquanshengchan = anquanshengchan;
	}

	public String getAnquansheshi() {
		return this.anquansheshi;
	}

	public void setAnquansheshi(String anquansheshi) {
		this.anquansheshi = anquansheshi;
	}

	public String getDiangongzuoye() {
		return this.diangongzuoye;
	}

	public void setDiangongzuoye(String diangongzuoye) {
		this.diangongzuoye = diangongzuoye;
	}

	public String getFuzeName() {
		return this.fuzeName;
	}

	public void setFuzeName(String fuzeName) {
		this.fuzeName = fuzeName;
	}

	public String getGaochuzuoye() {
		return this.gaochuzuoye;
	}

	public void setGaochuzuoye(String gaochuzuoye) {
		this.gaochuzuoye = gaochuzuoye;
	}

	public String getHanjiezuoye() {
		return this.hanjiezuoye;
	}

	public void setHanjiezuoye(String hanjiezuoye) {
		this.hanjiezuoye = hanjiezuoye;
	}

	public double getId() {
		return this.id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getJianquanqingk() {
		return this.jianquanqingk;
	}

	public void setJianquanqingk(String jianquanqingk) {
		this.jianquanqingk = jianquanqingk;
	}

	public String getJiaoyuqingk() {
		return this.jiaoyuqingk;
	}

	public void setJiaoyuqingk(String jiaoyuqingk) {
		this.jiaoyuqingk = jiaoyuqingk;
	}

	public String getPeoYuanQingk() {
		return this.peoYuanQingk;
	}

	public void setPeoYuanQingk(String peoYuanQingk) {
		this.peoYuanQingk = peoYuanQingk;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQitazuoye() {
		return this.qitazuoye;
	}

	public void setQitazuoye(String qitazuoye) {
		this.qitazuoye = qitazuoye;
	}

	public String getShengchanchucun() {
		return this.shengchanchucun;
	}

	public void setShengchanchucun(String shengchanchucun) {
		this.shengchanchucun = shengchanchucun;
	}

	public String getShiguyinhuan() {
		return this.shiguyinhuan;
	}

	public void setShiguyinhuan(String shiguyinhuan) {
		this.shiguyinhuan = shiguyinhuan;
	}

	public String getWeixianhuaxue() {
		return this.weixianhuaxue;
	}

	public void setWeixianhuaxue(String weixianhuaxue) {
		this.weixianhuaxue = weixianhuaxue;
	}

	public String getYesName() {
		return this.yesName;
	}

	public void setYesName(String yesName) {
		this.yesName = yesName;
	}

	public String getYesornofenchen() {
		return this.yesornofenchen;
	}

	public void setYesornofenchen(String yesornofenchen) {
		this.yesornofenchen = yesornofenchen;
	}

	public String getYesOrNoJianko() {
		return this.yesOrNoJianko;
	}

	public void setYesOrNoJianko(String yesOrNoJianko) {
		this.yesOrNoJianko = yesOrNoJianko;
	}

	public String getYesOrNoJoinQQ() {
		return this.yesOrNoJoinQQ;
	}

	public void setYesOrNoJoinQQ(String yesOrNoJoinQQ) {
		this.yesOrNoJoinQQ = yesOrNoJoinQQ;
	}

	public String getYesorxiaofang() {
		return this.yesorxiaofang;
	}

	public void setYesorxiaofang(String yesorxiaofang) {
		this.yesorxiaofang = yesorxiaofang;
	}

	public String getYesoryouxiankj() {
		return this.yesoryouxiankj;
	}

	public void setYesoryouxiankj(String yesoryouxiankj) {
		this.yesoryouxiankj = yesoryouxiankj;
	}

	public String getYesorzhongda() {
		return this.yesorzhongda;
	}

	public void setYesorzhongda(String yesorzhongda) {
		this.yesorzhongda = yesorzhongda;
	}

	public String getYesyouname() {
		return this.yesyouname;
	}

	public void setYesyouname(String yesyouname) {
		this.yesyouname = yesyouname;
	}

	public String getZhilengzuoye() {
		return this.zhilengzuoye;
	}

	public void setZhilengzuoye(String zhilengzuoye) {
		this.zhilengzuoye = zhilengzuoye;
	}

	public String getZhiybjiankang() {
		return this.zhiybjiankang;
	}

	public void setZhiybjiankang(String zhiybjiankang) {
		this.zhiybjiankang = zhiybjiankang;
	}

	public String getZhiyebing() {
		return this.zhiyebing;
	}

	public void setZhiyebing(String zhiyebing) {
		this.zhiyebing = zhiyebing;
	}

}