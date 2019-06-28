package com.niit.jbportal.daosimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.niit.jbportal.dao.EmployeeDaos;
import com.niit.jbportal.model.Employee;
import com.niit.jbportal.utility.ConnectionProvider;

public class EmployeeDaosImpl implements EmployeeDaos{
	
	PreparedStatement ps=null;
	
	@Override
	public boolean addEmployee(Employee employee) {
		
		try{
			Connection conn=ConnectionProvider.getConn();
			ps=conn.prepareStatement("insert into employee(empname,empemail,emptelnum,emppass) values(?,?,?,?)");
			ps.setString(1, employee.getfName());
			ps.setString(2, employee.getEmail());
			ps.setInt(3, employee.getTelNumber());
			ps.setString(4, employee.getPassword());

			int i=ps.executeUpdate();
			if(i!=0){
				return true;
			}
				
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return false;	
		}

	@Override
	public boolean deleteEmployee(int empId) {
		
		try{
			Connection conn=ConnectionProvider.getConn();
			 ps=conn.prepareStatement("INSERT INTO blacklistedemployee(empid,empname,empemail) "
					+ "SELECT empid,empname,empemail FROM employee where empid=?");
			ps.setInt(1,empId);
			
			
			int i=ps.executeUpdate();
			
			if(i!=0){
				return true;
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		
		try{
			Connection conn=ConnectionProvider.getConn();
			PreparedStatement ps=conn.prepareStatement("update employee set empname=?,empemail=?,emptelnum=?,emppass=? where empid=?");
			ps.setString(1, employee.getfName());
			ps.setString(2, employee.getEmail());
			ps.setInt(3, employee.getTelNumber());
			ps.setString(4, employee.getPassword());
			ps.setInt(5, employee.getEmpId());
			

			int i=ps.executeUpdate();
			if(i!=0){
				return true;
			}
			
			
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		return false;
	}
	

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee> employee=new ArrayList<>();
		try{
			Connection conn=ConnectionProvider.getConn();
			PreparedStatement ps=conn.prepareStatement("select * from employee");
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				int empId=rs.getInt(1);
				String empName=rs.getString(2);
				String empEmail=rs.getString(3);
				int telNum=rs.getInt(4);
		
				Employee empObj=new Employee(empId,empName,empEmail,telNum);
				employee.add(empObj);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return employee;
	}

	
	@Override
	public Employee getEmployeeById(int empid) {
		try{
			Connection conn=ConnectionProvider.getConn();
			PreparedStatement ps=conn.prepareStatement("select * from employee where empid=?");
			ps.setInt(1,empid);

			ResultSet rs=ps.executeQuery();
			
	         if(rs.next()){
	             int pid=rs.getInt(1);
	             String empname=rs.getString(2);
	             String empemail=rs.getString(3);
	             int empnum=rs.getInt(4);
	             String emppass=rs.getString(5);
	             
	            Employee emp=new Employee(pid,empname,empemail,empnum,emppass);
	            return emp;
	         }
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee forgotPass(String email) {
					
		
		try{
			Connection conn=ConnectionProvider.getConn();
			PreparedStatement ps=conn.prepareStatement("select empemail,emppass from employee where empemail=?");
			ps.setString(1, email);
			
			ResultSet rs=ps.executeQuery();
			rs.next();
				String empEmail=rs.getString(1);
				String pass=rs.getString(2);
		
				Employee empObj=new Employee();
				empObj.setEmail(empEmail);
				empObj.setPassword(pass);
			    return empObj;	
			}
		catch(SQLException e){
			e.printStackTrace();return null;
		}
		catch(Exception e){
			return null;
		}
		
		
	}

	@Override
	public boolean addEmployeeEducation(Employee employee) {
		
		try{
			Connection conn=ConnectionProvider.getConn();
			ps=conn.prepareStatement("insert into employee_education values(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, employee.getEmpId());
			ps.setInt(2, employee.getTenthmarks());
			ps.setString(3, employee.getTenthboard());
			ps.setInt(4, employee.getTwlevethmarks());
			ps.setString(5, employee.getTwlevethboard());
			ps.setInt(6, employee.getGraduationmarks());
			ps.setString(7, employee.getCollege());
			ps.setString(8, employee.getBranch());
			ps.setString(9, employee.getExperience());
			
			
			int i=ps.executeUpdate();
			if(i!=0){
				return true;
			}
				
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
		
	}

	@Override
	public List<Employee> seeEducationDetails(int empId) {
		
		List<Employee> employee=new ArrayList<>();
		try{
			Connection conn=ConnectionProvider.getConn();
			PreparedStatement ps=conn.prepareStatement("select * from employee_education where employeeid=?");
			ps.setInt(1, empId);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				int empid=rs.getInt(1);
				int tenthmarks=rs.getInt(2);
				String tenthboard=rs.getString(3);
				int twlevethmarks=rs.getInt(4);
				String twlevethboard=rs.getString(5);
				int graduationmarks=rs.getInt(6);
				String college=rs.getString(7);
				String branch=rs.getString(8);
				String experience=rs.getString(9);
		
				Employee empObj=new Employee(empid,tenthmarks,tenthboard,twlevethmarks,twlevethboard,graduationmarks,college,branch,experience);
				employee.add(empObj);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return employee;
		
		
	}


}
