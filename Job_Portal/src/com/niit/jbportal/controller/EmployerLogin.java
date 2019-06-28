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

import com.niit.jbportal.model.Employer;
import com.niit.jbportal.utility.ConnectionProvider;


@WebServlet("/EmployerLogin")
public class EmployerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String employerEmail=request.getParameter("employerEmail");
		String employerPass=request.getParameter("employerPass");
		
		try{
	        
	        Connection conn=ConnectionProvider.getConn();
	        
	        PreparedStatement ps=conn.prepareStatement("select * from employer where employeremail=? and employerpass=?");
	        ps.setString(1,employerEmail);
	        ps.setString(2,employerPass);
	       
	       
	        ResultSet rs=ps.executeQuery();
	        if(rs.next()){
	        String name=rs.getString(2);
	        String employeremail=rs.getString(3);
	        int telnum=rs.getInt(5);
	        String company=rs.getString(6);
	        String industry=rs.getString(7);
	        
	        Employer emp=new Employer(name,employeremail,telnum,company,industry);
	       
	        HttpSession  session=request.getSession();
	        session.setAttribute("emp", emp);
	        
	        session.setAttribute("Fname", name);
	        session.setAttribute("Email", employeremail);
	        session.setAttribute("Tel", telnum);
	        session.setAttribute("Company", company);
	        session.setAttribute("Industry", industry);
	        
	       
	        RequestDispatcher rd=request.getRequestDispatcher("EmployerHome.jsp");
	        rd.forward(request,response);
	        
	        
	        }
	        else{
	        out.println("<div align='center' style='color:red'>Invalid email or password</div>");
	        
	        RequestDispatcher rd=request.getRequestDispatcher("EmployerLogin.jsp");
	        rd.include(request, response);
	        
	           
	        }
	            
	        }
	        catch(Exception e){
	        e.printStackTrace();
	        }
		
		
	}

}
