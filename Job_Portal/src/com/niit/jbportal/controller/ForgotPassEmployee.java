package com.niit.jbportal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.jbportal.dao.EmployeeDaos;
import com.niit.jbportal.daosimpl.EmployeeDaosImpl;
import com.niit.jbportal.model.Employee;


@WebServlet("/ForgotPass")
public class ForgotPassEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
          
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();		
		
		String email=request.getParameter("employeeemail");
		
		EmployeeDaos empDaoObj=new EmployeeDaosImpl();
		Employee emp=empDaoObj.forgotPass(email);
		
		request.setAttribute("employee", emp);
				
		RequestDispatcher rd=request.getRequestDispatcher("ForgotPassMailSend");  
	    rd.forward(request, response); 
	
	}

}
