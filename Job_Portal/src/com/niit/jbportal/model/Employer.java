package com.niit.jbportal.model;

public class Employer {

	private int employerId;
	private String employerName;
	private String employerEmail;
	private String employerPass;
	private int employerNum;
	private String employerCompany;
	private String employerIndustry;
	
	public Employer(){
		
	}
	
	public Employer(String employerName, String employerEmail, int employerNum, String employerCompany,
			String employerIndustry) {
	
		this.employerName = employerName;
		this.employerEmail = employerEmail;
		this.employerNum = employerNum;
		this.employerCompany = employerCompany;
		this.employerIndustry = employerIndustry;
	}



	public Employer(String employerName, String employerEmail, String employerPass, int employerNum,
			String employerCompany, String employerIndustry) {

		this.employerName = employerName;
		this.employerEmail = employerEmail;
		this.employerPass = employerPass;
		this.employerNum = employerNum;
		this.employerCompany = employerCompany;
		this.employerIndustry = employerIndustry;
	}


	public Employer(int employerId, String employerName, String employerEmail, String employerPass, int employerNum,
			String employerCompany, String employerIndustry) {

		this.employerId = employerId;
		this.employerName = employerName;
		this.employerEmail = employerEmail;
		this.employerPass = employerPass;
		this.employerNum = employerNum;
		this.employerCompany = employerCompany;
		this.employerIndustry = employerIndustry;
	}



	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getEmployerEmail() {
		return employerEmail;
	}
	public void setEmployerEmail(String employerEmail) {
		this.employerEmail = employerEmail;
	}
	public String getEmployerPass() {
		return employerPass;
	}
	public void setEmployerPass(String employerPass) {
		this.employerPass = employerPass;
	}
	public int getEmployerNum() {
		return employerNum;
	}
	public void setEmployerNum(int employerNum) {
		this.employerNum = employerNum;
	}
	public String getEmployerCompany() {
		return employerCompany;
	}
	public void setEmployerCompany(String employerCompany) {
		this.employerCompany = employerCompany;
	}
	public String getEmployerIndustry() {
		return employerIndustry;
	}
	public void setEmployerIndustry(String employerIndustry) {
		this.employerIndustry = employerIndustry;
	}
	
	
	
	
}
