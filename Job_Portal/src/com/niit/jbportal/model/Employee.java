package com.niit.jbportal.model;

public class Employee {

	private int empId;
	private String fName;
	private String email;
	private int telNumber;
	private String password;
	private int tenthmarks;
	private String tenthboard;
	private int twlevethmarks;
	private String twlevethboard;
	private int graduationmarks;
	private String college;
	private String branch;
	private String experience;
	
	
	
	public Employee(int empId, int tenthmarks, String tenthboard, int twlevethmarks, String twlevethboard,
			int graduationmarks, String college, String branch, String experience) {
		this.empId = empId;
		this.tenthmarks = tenthmarks;
		this.tenthboard = tenthboard;
		this.twlevethmarks = twlevethmarks;
		this.twlevethboard = twlevethboard;
		this.graduationmarks = graduationmarks;
		this.college = college;
		this.branch = branch;
		this.experience = experience;
	}

	public Employee(String email) {
		
		this.email = email;
	}

	public Employee(String fName, String email, String password) {
	
		this.fName = fName;
		this.email = email;
		this.password = password;
	}
	
	public Employee(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public int getTenthmarks() {
		return tenthmarks;
	}

	public void setTenthmarks(int tenthmarks) {
		this.tenthmarks = tenthmarks;
	}

	public String getTenthboard() {
		return tenthboard;
	}

	public void setTenthboard(String tenthboard) {
		this.tenthboard = tenthboard;
	}

	public int getTwlevethmarks() {
		return twlevethmarks;
	}

	public void setTwlevethmarks(int twlevethmarks) {
		this.twlevethmarks = twlevethmarks;
	}

	public String getTwlevethboard() {
		return twlevethboard;
	}

	public void setTwlevethboard(String twlevethboard) {
		this.twlevethboard = twlevethboard;
	}

	public int getGraduationmarks() {
		return graduationmarks;
	}

	public void setGraduationmarks(int graduationmarks) {
		this.graduationmarks = graduationmarks;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public Employee(int empId, String fName, String email, int telNumber) {
	
		this.empId = empId;
		this.fName = fName;
		this.email = email;
		this.telNumber = telNumber;
	}
	

	public Employee(){
		
	}

	public Employee(int empId, String fName, String email, int telNumber, String password) {
		this.empId = empId;
		this.fName = fName;
		this.email = email;
		this.telNumber = telNumber;
		this.password = password;
	}



	public Employee(String fName, String email, int telNumber, String password) {
		this.fName = fName;
		this.email = email;
		this.telNumber = telNumber;
		this.password = password;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(int telNumber) {
		this.telNumber = telNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
