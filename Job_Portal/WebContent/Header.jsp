<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>JobHunts.com</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>


<nav class="navbar navbar-expand-md bg-dark navbar-dark">
  <a class="navbar-brand" href="Index.jsp"><b>JobHunts.com</b></a>
  
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar" >
    <ul class="navbar-nav mr-auto"> 
    <div class="dropdown">
    <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown">More</button>
    <div class="dropdown-menu">
      <h5 class="dropdown-header">Top Colleges & Courses</h5>
      <a class="dropdown-item" href="https://www.shiksha.com/mba/ranking/top-mba-colleges-in-india/2-2-0-0-0">Top MBA Colleges</a>
      <a class="dropdown-item" href="https://www.shiksha.com/b-tech/ranking/top-engineering-colleges-in-india/44-2-0-0-0">Top Engineering Colleges</a>
      <a class="dropdown-item" href="https://www.shiksha.com/bba-bachelor-of-business-administration-chp">BBA/BBM</a>
      <a class="dropdown-item" href="https://www.shiksha.com/bca-bachelor-of-computer-applications-chp">BCA,DCA,BSC,CS/IT</a>
      <h5 class="dropdown-header">Top Exams</h5>
      <a class="dropdown-item" href="https://www.shiksha.com/b-tech/jee-main-exam">JEE Main</a>
      <a class="dropdown-item" href="https://www.shiksha.com/engineering/gate-exam">Gate</a>
      <a class="dropdown-item" href="https://www.shiksha.com/medicine-health-sciences/medicine/neet-ug-exam">NEET</a>
    </div>
  </div>
      </ul>
      
      <ul class="navbar-nav m1-auto">
       
             <c:if test="${empty emp}"> 
             <div class="dropdown">
   		 <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown"> Login</button>			
    <div class="dropdown-menu">
      <a class="dropdown-item" href="Employee_Login.jsp">JobSeeker Login</a>
      <a class="dropdown-item" href="EmployerLogin.jsp">Recruiter Login</a>
    </div>
  </div>
  </c:if>
  
<c:if test="${not empty emp}">
  <div class="dropdown">
   		 <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown">Profile</button>			
    <div class="dropdown-menu">
      <a class="dropdown-item" href="UpdateEmployeeCotntroller?empId=${empid}">Update Profile</a>
      <a class="dropdown-item" href="LogOutController">Log Out</a>
    </div>
  </div>
  </c:if>
  
   <li class="nav-item">
        <a class="nav-link" href="https://www.glassdoor.co.in/Reviews/index.htm">Company Reviews</a>
      </li> 
      
   
     
  <li class="nav-item">
        <a class="nav-link" href="About_Us.jsp">About us</a>
  </li> 
      
        <li class="nav-item">
        <a class="nav-link" href="Contactus.jsp">Contact Us</a>
      </li> 
      
    </ul>
  </div>  
  
</nav>
<br>