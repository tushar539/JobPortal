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

import com.niit.jbportal.dao.EmployeeDaos;
import com.niit.jbportal.daosimpl.EmployeeDaosImpl;
import com.niit.jbportal.model.Employee;


@WebServlet("/ViewAllEmployee")
public class ViewAllEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		EmployeeDaos empDaoObj=new EmployeeDaosImpl();
		List<Employee> employee=empDaoObj.getAllEmployee();
		
		request.setAttribute("empList",employee);
		RequestDispatcher rd=request.getRequestDispatcher("ViewAllEmployee.jsp");
		rd.forward(request, response);
		
		
	}

}
