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
<div align="left">
<button type="button" name="back" class="w3-button w3-teal" onclick="history.back()">Back</button>
</div>

<div align="center">
<h1>Applicants List </h1>
</hr>
<c:if test="${not empty msg }">
<span style="color:red;font-weight:bolder">${msg}</span>
</c:if>
<table class="table table-hover">
 <thead>
<tr>
<th>Applicant Id </th>
<th>Applicant Name </th>
<th>Applicant Email </th>
<th>Applicant Tel Number</th>
<th>Education Details</th>
<th>Operations </th>
</tr>
</thead>

<c:forEach items="${empList}" var="e">
<tbody>
<tr>
<td> ${e.empId}</td>
<td> ${e.fName}</td>
<td> ${e.email}</td>
<td> ${e.telNumber}</td>
<td><a href="EmployeeEducationDetails?empId=${e.empId}">Education Details</a> </td>
<td><a href="BlackListController?empId=${e.empId}">BlackList</a> </td>
</tr>
</tbody>
</c:forEach>
</table>
</div>