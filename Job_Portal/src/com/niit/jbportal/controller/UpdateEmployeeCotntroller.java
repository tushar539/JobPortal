package com.niit.jbportal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.jbportal.dao.EmployeeDaos;
import com.niit.jbportal.daosimpl.EmployeeDaosImpl;
import com.niit.jbportal.model.Employee;


@WebServlet("/UpdateEmployeeCotntroller")
public class UpdateEmployeeCotntroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession  session=request.getSession();
		
		int empid=Integer.parseInt(request.getParameter("empId"));
		
		EmployeeDaos empDaos=new EmployeeDaosImpl();
		Employee emp=empDaos.getEmployeeById(empid);
		
		request.setAttribute("pObj", emp);
		RequestDispatcher rd=request.getRequestDispatcher("NewEmployee.jsp");
        rd.forward(request,response);
	}
	}

