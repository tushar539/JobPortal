package com.niit.jbportal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogOutController")
public class LogOutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");  
         PrintWriter out=response.getWriter();  
         
         HttpSession session=request.getSession();  
         // session.invalidate(); 
         String sess=null;
         session.setAttribute("emp",sess); 
     
         request.getRequestDispatcher("Index.jsp").include(request, response);  
           
        
	}

	

}
