package com.niit.jbportal.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.niit.jbportal.dao.JobDaos;
import com.niit.jbportal.model.Employee;
import com.niit.jbportal.model.Job;
import com.niit.jbportal.utility.ConnectionProvider;

public class JobDaosImpl implements JobDaos{
	
	PreparedStatement ps=null;
	
	@Override
	public boolean addJob(Job job) {
		try{
			Connection conn=ConnectionProvider.getConn();
			ps=conn.prepareStatement("insert into job(recruiter,jobtitle,jobdetails,skillset,location) values(?,?,?,?,?)");
			ps.setString(1, job.getJobRecruiter());
			ps.setString(2, job.getJobTitle());
			ps.setString(3, job.getJobDetails());
			ps.setString(4, job.getSkillSet());
			ps.setString(5, job.getLocation());

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
	public boolean deleteJob(int jobId) {
		
		try{
			Connection conn=ConnectionProvider.getConn();
			 ps=conn.prepareStatement("delete from job where jobid=?");
			 ps.setInt(1,jobId);
			
			
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
	public List<Job> getAllJobs() {
		
		List<Job> job=new ArrayList<>();
		try{
			Connection conn=ConnectionProvider.getConn();
			PreparedStatement ps=conn.prepareStatement("select * from job");
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				int jobid=rs.getInt(1);
				String recruiter=rs.getString(2);
				String jobtitle=rs.getString(3);
				String jobdetails=rs.getString(4);
				String skillset=rs.getString(5);
				String location=rs.getString(6);
				
				Job jobObj=new Job(jobid,recruiter,jobtitle,jobdetails,skillset,location);
				job.add(jobObj);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return job;
	}

	@Override
	public Job getJobByTitle(String jobTitle) {
		
		return null;
	}

	@Override
	public boolean applyForJob(String jobApplicant,int jobId) {
		
		try{
			Connection conn=ConnectionProvider.getConn();
			PreparedStatement ps=conn.prepareStatement("update job set jobapplicant=? where jobid=?");
			ps.setString(1, jobApplicant);
			ps.setInt(2, jobId);

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
	public List<Job> getJobByRecruiter(String jobRecruiter) {
		
		List<Job> job=new ArrayList<>();
		try{
			Connection conn=ConnectionProvider.getConn();
			PreparedStatement ps=conn.prepareStatement("select jobid,jobtitle,skillset,location,jobapplicant from job where recruiter=?");
			ps.setString(1, jobRecruiter);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				int jobid=rs.getInt(1);
				String jobtitle=rs.getString(2);
				String skillset=rs.getString(3);
				String location=rs.getString(4);
				String applicant=rs.getString(5);
				
				Job jobObj=new Job(jobid,jobtitle,skillset,location,applicant);
				job.add(jobObj);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return job;
	}

	@Override
	public List<Job> getAppliedJobs(String jobApplicant) {
		
		List<Job> job=new ArrayList<>();
		try{
			Connection conn=ConnectionProvider.getConn();
			PreparedStatement ps=conn.prepareStatement("select * from job where jobapplicant=?");
			ps.setString(1, jobApplicant);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				int jobid=rs.getInt(1);
				String recruiter=rs.getString(2);
				String jobtitle=rs.getString(3);
				String jobdetails=rs.getString(4);
				String skillset=rs.getString(5);
				String location=rs.getString(6);
				
				Job jobObj=new Job(jobid,recruiter,jobtitle,jobdetails,skillset,location);
				job.add(jobObj);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return job;
		
	}


}
