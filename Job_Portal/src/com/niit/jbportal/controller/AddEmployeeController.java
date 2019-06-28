package com.niit.jbportal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.jbportal.dao.EmployeeDaos;
import com.niit.jbportal.daosimpl.EmployeeDaosImpl;
import com.niit.jbportal.model.Employee;


@WebServlet("/AddEmployeeController")
public class AddEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String id=request.getParameter("empId");
		
		String fname=request.getParameter("fName");
		String email=request.getParameter("email");
		int telNumber=Integer.parseInt(request.getParameter("telNumber"));
		String password=request.getParameter("password");
		
		Employee emp=new Employee(fname,email,telNumber,password);
		EmployeeDaos empDaos=new EmployeeDaosImpl();

		boolean r=false;
		
		if(id==null){
			r=empDaos.addEmployee(emp);
			request.setAttribute("msg", "Registered Successfully");
			RequestDispatcher rd=request.getRequestDispatcher("NewEmployee.jsp");  
	        rd.include(request, response);
		}
		else{
			emp.setEmpId((Integer.parseInt(id)));
			r=empDaos.updateEmployee(emp);
			request.setAttribute("msg", "Details Updated Successfully");
			RequestDispatcher rd=request.getRequestDispatcher("EmployeeHome.jsp");  
	        rd.include(request, response);
	}

	
		
	}

}
