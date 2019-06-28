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
<th>10th Percentage </th>
<th>10th Board </th>
<th>12th Percentage</th>
<th>12th Board </th>
<th>Graduation Percentage</th>
<th>College</th>
<th>Branch</th>
<th>Experience</th>
</tr>
</thead>

<c:forEach items="${empList}" var="e">
<tbody>
<tr>
<td> ${e.empId}</td>
<td> ${e.tenthmarks}</td>
<td> ${e.tenthboard}</td>
<td> ${e.twlevethmarks}</td>
<td> ${e.twlevethboard}</td>
<td> ${e.graduationmarks}</td>
<td> ${e.college}</td>
<td> ${e.branch}</td>
<td> ${e.experience}</td>
</tr>
</tbody>
</c:forEach>
</table>
</div>