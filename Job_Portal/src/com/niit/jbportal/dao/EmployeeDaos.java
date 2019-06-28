package com.niit.jbportal.dao;

import java.util.List;

import com.niit.jbportal.model.Employee;

public interface EmployeeDaos {
	
	public boolean addEmployee(Employee employee);
	public boolean addEmployeeEducation(Employee employee);
	public boolean deleteEmployee(int empId);
	public boolean updateEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int empId);
	public Employee forgotPass(String email);
	public List<Employee> seeEducationDetails(int empId);

}
