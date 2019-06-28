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
<form action="AddEmployeeController" method="post">

<c:if test="${not empty pObj}">
<div align="left">
<button type="button" name="back" class="w3-button w3-teal" onclick="history.back()">Back</button>
</div>
<h1><b>Update Profile</b> </h1>
</c:if>
<c:if test="${empty pObj}">
<h1><b><u>Employee Registration</u></b> </h1>
</c:if>

<c:if test="${not empty msg }">
 <span style="color:blue;font-weight:bolder">${msg}</span>
</c:if>

<table cellpadding="10">
<c:if test="${not empty pObj}">
<tr>
<td>Employee Id: </td>
<td> <input type="text" name="empId" value="${pObj.empId}" readonly="readonly">  </td>
</tr>
</c:if>
<tr>
<td><label for="Fname">Full Name:</label> </td>
<td> <input type="text" name="fName" id="Fname" value="${pObj.fName}" placeholder="Enter your name" size=25 required> </td>
</tr>
<tr>
<td><label for="email">Email Address:</label></td>
<td> <input type="email" name="email" id="email" value="${pObj.email}" placeholder="Enter your email address" size=25 required> </td>
</tr>
<tr>
<td><label for="num">Mobile Number: </label></td>
<td> <input type="text" name="telNumber" id="num" value="${pObj.telNumber}" placeholder="Enter your number" size=25 required> </td>
</tr>
<tr>
<td><label for="pass">Password:</label> </td>
<td> <input type="password" name="password" id="pass" value="${pObj.password}" placeholder="Enter your passwpord" size=25 required> </td>
</tr>
<tr>
<td> </td>
<td> <input type="submit" value="Submit" class="w3-button w3-teal"></td>
</tr>
</table>
<table>
<c:if test="${empty pObj}">
<tr><td><a href="Employee_Login.jsp">Already Registered? Login here</a></td></tr>
</c:if>
</table>
</form>
</div>

