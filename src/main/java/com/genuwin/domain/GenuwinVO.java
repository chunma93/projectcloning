package com.genuwin.domain;

import java.util.Date;

public class GenuwinVO {
	
	private int pk;
	private String RPT_CD;
	private String RPT_NM;
	private String RPT_LNM;
	private String RPT_FNM;
	private String REMARKS;
	private String CRT_BY;
	private Date CRT_DT;
	private String MOD_BY;
	private Date MOD_DT;
	private int DEL_IF;
	
	
	public int getPk() {
		return pk;
	}
	public void setPk(int pk) {
		this.pk = pk;
	}
	public String getRPT_CD() {
		return RPT_CD;
	}
	public void setRPT_CD(String rPT_CD) {
		RPT_CD = rPT_CD;
	}
	public String getRPT_NM() {
		return RPT_NM;
	}
	public void setRPT_NM(String rPT_NM) {
		RPT_NM = rPT_NM;
	}
	public String getRPT_LNM() {
		return RPT_LNM;
	}
	public void setRPT_LNM(String rPT_LNM) {
		RPT_LNM = rPT_LNM;
	}
	public String getRPT_FNM() {
		return RPT_FNM;
	}
	public void setRPT_FNM(String rPT_FNM) {
		RPT_FNM = rPT_FNM;
	}
	public String getREMARKS() {
		return REMARKS;
	}
	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}
	public String getCRT_BY() {
		return CRT_BY;
	}
	public void setCRT_BY(String cRT_BY) {
		CRT_BY = cRT_BY;
	}
	public Date getCRT_DT() {
		return CRT_DT;
	}
	public void setCRT_DT(Date cRT_DT) {
		CRT_DT = cRT_DT;
	}
	public String getMOD_BY() {
		return MOD_BY;
	}
	public void setMOD_BY(String mOD_BY) {
		MOD_BY = mOD_BY;
	}
	public Date getMOD_DT() {
		return MOD_DT;
	}
	public void setMOD_DT(Date mOD_DT) {
		MOD_DT = mOD_DT;
	}
	public int getDEL_IF() {
		return DEL_IF;
	}
	public void setDEL_IF(int dEL_IF) {
		DEL_IF = dEL_IF;
	}
	
	

}
