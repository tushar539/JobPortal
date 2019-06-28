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

@WebServlet("/AddEmployeeEducation")
public class AddEmployeeEducation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession  session=request.getSession();
		int empId=(Integer)session.getAttribute("empid");

		int tenthmarks=Integer.parseInt(request.getParameter("tenthmarks"));
		String tenthboard=request.getParameter("tenthboard");
		int twlevethmarks=Integer.parseInt(request.getParameter("twlevethmarks"));
		String twlevethboard=request.getParameter("twlevethboard");
		int graduationmarks=Integer.parseInt(request.getParameter("graduationmarks"));
		String college=request.getParameter("college");
		String branch=request.getParameter("branch");
		String experience=request.getParameter("experience");
		
		Employee employee=new Employee(empId,tenthmarks,tenthboard,twlevethmarks,twlevethboard,graduationmarks,college,branch,experience);
		EmployeeDaos empDaos=new EmployeeDaosImpl();

		boolean r=false;

		r=empDaos.addEmployeeEducation(employee);
		request.setAttribute("msg", "Details added Successfully");

		if(r){
		    RequestDispatcher rd=request.getRequestDispatcher("EmployeeHome.jsp");  
		    rd.include(request, response);  
		    
		}

		
	}

}
