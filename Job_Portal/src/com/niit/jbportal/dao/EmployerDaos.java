package com.niit.jbportal.dao;

import java.util.List;

import com.niit.jbportal.model.Employer;

public interface EmployerDaos {

	public boolean addEmployer(Employer employer);
	public boolean deleteEmployer(int employerId);
	public boolean updateEmployer(Employer employer);
	public List<Employer> getAllEmployers();
	public boolean getEmployerById(int employerId);
}
