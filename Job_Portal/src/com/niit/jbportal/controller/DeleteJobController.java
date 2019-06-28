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
import javax.servlet.http.HttpSession;

import com.niit.jbportal.dao.JobDaos;
import com.niit.jbportal.daosimpl.JobDaosImpl;
import com.niit.jbportal.model.Job;

@WebServlet("/DeleteJobController")
public class DeleteJobController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession  session=request.getSession();
		String recruiter=(String) session.getAttribute("Fname");
		
		int jobId=Integer.parseInt(request.getParameter("jobId"));
		JobDaos jobDaoObj=new JobDaosImpl();
		jobDaoObj.deleteJob(jobId);
		
		List<Job> job=jobDaoObj.getJobByRecruiter(recruiter);
		
		request.setAttribute("msg", "Job Deleted Successfully");
		request.setAttribute("jbList", job);
		 RequestDispatcher rd=request.getRequestDispatcher("ViewJobRecruiter.jsp");
         rd.forward(request,response);
		
		
	}

}
