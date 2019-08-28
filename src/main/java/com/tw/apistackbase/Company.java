package com.tw.apistackbase;

public class Company {
	private String companyId;
	private String companyName;
	private String companyInfo;
	
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyInfo() {
		return companyInfo;
	}
	public void setCompanyInfo(String companyInfo) {
		this.companyInfo = companyInfo;
	}
	
	public Company(String companyID,String companyName,String companyInfo, String companyId) {
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyInfo = companyInfo;
	}
	
	public Company() {}

}
