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
<form action="AddJob" method="post">

<div align="left">
<button type="button" name="back" class="w3-button w3-teal" onclick="history.back()">Back</button>
</div>

<h1><b>Add Job</b> </h1>

<c:if test="${not empty msg }">
 <span style="color:green;font-weight:bolder">${msg}</span>
</c:if>
<table cellpadding="10">
<tr>
<td> <label for="jobrecruiter">Job Recruiter:</label> </td>
<td> <input type="text" name="jobRecruiter" value="${Fname}" id="jobrecruiter" size=25 required> </td>
</tr>
<tr>
<td> <label for="jobtitle">Job Title:</label> </td>
<td> <input type="text" name="jobTitle" id="jobtitle" placeholder="Enter job title" size=25 required> </td>
</tr>
<tr>
<td><label for="jobdetails">Job Details:</label></td>
<td> <input type="text" name="jobDetails" id="jobdetails" placeholder="Enter job details" size=25 required> </td>
</tr>
<tr>
<td><label for="skillset">Skill Set:</label> </td>
<td> <input type="text" name="skillSet" id="skillset" placeholder="Enter job skillset" size=25 required> </td>
</tr>
<tr>
<td><label for="location">Location: </label></td>
<td> <input type="text" name="location" id="location" placeholder="Enter job location" size=25 required> </td>
</tr>
<tr>
<td> </td>
<td> <input type="submit" value="Submit" class="w3-button w3-teal">
<a href="EmployerHome.jsp" class="w3-btn w3-teal"> Cancel </a>
</td>
</tr>
</table>
</form>
</div>

