<%@include file="Header.jsp" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
body  {
  background-image: url("Images/login1.jpg");
  background-color:white;
}
</style>
</head>
<body>
<div align="center">
<form action="AddEmployerController" method="post">

<h1><b><u>Employer Registration</u></b> </h1>
<c:if test="${not empty msg }">
 <span style="color:green;font-weight:bolder">${msg}</span>
</c:if>
<table cellpadding="10">
<tr>
<td> <label for="Fname">Full Name:</label> </td>
<td> <input type="text" name="employerName" id="Fname" placeholder="Enter your name" size=25 required> </td>
</tr>
<tr>
<td><label for="email">Email Address:</label></td>
<td> <input type="email" name="employerEmail" id="email" placeholder="Enter your email address" size=25 required> </td>
</tr>
<tr>
<td><label for="pass">Password:</label> </td>
<td> <input type="password" name="employerPass" id="pass" placeholder="Enter your passwpord" size=25 required> </td>
</tr>
<tr>
<td><label for="num">Mobile Number: </label></td>
<td> <input type="text" name="employerNum" id="num" placeholder="Enter your number" size=25 required> </td>
</tr>
<tr>
<td><label for="company">Company Name: </label></td>
<td> <input type="text" name="employerCompany" id="company" placeholder="Enter your number" size=25 required> </td>
</tr>
<tr> 
<td><label for="industry">Industry Type:</label> </td>
<td> <select name="employerIndustry" id="industry">
<option value="none">Select Industry</option>
<option value="textiles">Textiles / Garments / Fashion / Accessories</option>
<option value="accounting">Accounting / Finance</option>
<option value="hotels">Hotels / Restaurants / Airlines / Travel</option>
<option value="software">IT Software / Software Services</option>
<option value="bpo">BPO / Call Centre / ITES</option>
<option value="hardware">IT Hardware / Networking</option>
<option value="property">Real Estate / Property</option>
<option value="medical">Medical / Healthcare / Hospital</option>
</select>
</td>
</tr>
<tr>
<td> </td>
<td> <input type="submit" value="Register" class="w3-button w3-teal"></td>
</tr>
</table>
<table>
<tr><td><a href="EmployerLogin.jsp">Already Registered? Login here</a></td></tr>
</table>
</form>
</div>

