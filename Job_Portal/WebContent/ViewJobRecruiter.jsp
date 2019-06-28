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
<h1>Jobs Posted By You</h1>
</hr>
<c:if test="${not empty msg }">
<span style="color:red;font-weight:bolder">${msg}</span>
</c:if>
<table class="table table-hover">
 <thead>
<tr>
<th>Job Id </th>
<th>Job Title</th>
<th>Job SkillSet</th>
<th>Job location </th>
<th>Applicant Applied</th>
<th>Operations </th>
</tr>
</thead>

<c:forEach items="${jbList}" var="j">
<tbody>
<tr>
<td> ${j.jobId}</td>
<td> ${j.jobTitle}</td>
<td> ${j.skillSet}</td>
<td> ${j.location}</td>
<td> ${j.jobApplicant}</td>
<td><a href="DeleteJobController?jobId=${j.jobId}">Delete</a> </td>
</tr>
</tbody>
</c:forEach>
</table>
</div>