package com.niit.jbportal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.jbportal.model.Employee;
import com.niit.jbportal.utility.ConnectionProvider;


@WebServlet("/EmployeeLogin")
public class EmployeeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		try{
	        
	        Connection conn=ConnectionProvider.getConn();
	        
	        PreparedStatement ps=conn.prepareStatement("select * from employee where empemail=? and emppass=?");
	        ps.setString(1,email);
	        ps.setString(2,password);
	       
	       
	        ResultSet rs=ps.executeQuery();
	        if(rs.next()){
	        int empId=rs.getInt(1);
	        String name=rs.getString(2);  
	        String empemail=rs.getString(3);
	        int telnum=rs.getInt(4);
	        String profile=rs.getString(6);
	      Employee emp=new Employee(empId,name,empemail,telnum,profile);
	       
	        HttpSession  session=request.getSession();  
	        session.setAttribute("emp", emp);
	        
	        session.setAttribute("empid", empId);
	        session.setAttribute("Fname", name);
	        session.setAttribute("Email", empemail);
	        session.setAttribute("Tel", telnum);
	        session.setAttribute("profile", profile);
	        
	       
	        RequestDispatcher rd=request.getRequestDispatcher("EmployeeHome.jsp");
	        rd.forward(request,response);
	        
	        
	        }
	        else{
	        out.println("<div align='center' style='color:red'>Invalid email or password</div>");
	        
	        RequestDispatcher rd=request.getRequestDispatcher("Employee_Login.jsp");
	        rd.include(request, response);
	        
	           
	        }
	            
	        }
	        catch(Exception e){
	        e.printStackTrace();
	        }
		
		
	}

}
