package com.niit.jbportal.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.niit.jbportal.dao.EmployerDaos;
import com.niit.jbportal.model.Employer;
import com.niit.jbportal.utility.ConnectionProvider;

public class EmployerDaosImpl implements EmployerDaos{

	PreparedStatement ps=null;
	
	@Override
	public boolean addEmployer(Employer employer) {
		
		try{
			Connection conn=ConnectionProvider.getConn();
			ps=conn.prepareStatement("insert into employer(employername,employeremail,employerpass,employernum,employercompany,employerindustry) values(?,?,?,?,?,?)");
			ps.setString(1, employer.getEmployerName());
			ps.setString(2, employer.getEmployerEmail());
			ps.setString(3, employer.getEmployerPass());
			ps.setInt(4, employer.getEmployerNum());
			ps.setString(5, employer.getEmployerCompany());
			ps.setString(6, employer.getEmployerIndustry());
			
			
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
	public boolean deleteEmployer(int employerId) {
		
		return false;
	}

	@Override
	public boolean updateEmployer(Employer employer) {
		
		return false;
	}

	@Override
	public List<Employer> getAllEmployers() {
		
		return null;
	}

	@Override
	public boolean getEmployerById(int employerId) {
		
		return false;
	}

}
