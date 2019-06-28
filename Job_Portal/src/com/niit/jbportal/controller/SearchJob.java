package com.niit.jbportal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.jbportal.dao.JobDaos;
import com.niit.jbportal.daosimpl.JobDaosImpl;
import com.niit.jbportal.model.Job;


@WebServlet("/SearchJob")
public class SearchJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		JobDaos jobDaoObj=new JobDaosImpl();
		List<Job> job=jobDaoObj.getAllJobs();
		
		request.setAttribute("jobList",job);
		RequestDispatcher rd=request.getRequestDispatcher("ViewAllJobs.jsp");
		rd.forward(request, response);
		
		
	}

}
