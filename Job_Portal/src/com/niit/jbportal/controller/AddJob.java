package com.niit.jbportal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.jbportal.dao.JobDaos;
import com.niit.jbportal.daosimpl.JobDaosImpl;
import com.niit.jbportal.model.Job;


@WebServlet("/AddJob")
public class AddJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		String recruiter=request.getParameter("jobRecruiter");
		String jobtitle=request.getParameter("jobTitle");
		String jobdetails=request.getParameter("jobDetails");
		String skillset=request.getParameter("skillSet");
		String location=request.getParameter("location");

		Job job=new Job(recruiter,jobtitle,jobdetails,skillset,location);
		JobDaos jobDaos=new JobDaosImpl();

		boolean r=false;

		r=jobDaos.addJob(job);
		request.setAttribute("msg", "Job added Successfully");

		if(r){
		    RequestDispatcher rd=request.getRequestDispatcher("AddJob.jsp");  
		    rd.include(request, response);  
		    
		}

		
	}

}

