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
<h1>Applied Jobs</h1>
</hr>

<table class="table table-hover">
 <thead>
<tr>
<th>Job Id </th>
<th>Job Recruiter</th>
<th>Job Title</th>
<th>Job Details</th>
<th>Job SkillSet</th>
<th>Job location </th>
</tr>
</thead>

<c:forEach items="${jobList}" var="j">
<tbody>
<tr>
<td> ${j.jobId}</td>
<td> ${j.jobRecruiter}</td>
<td> ${j.jobTitle}</td>
<td> ${j.jobDetails}</td>
<td> ${j.skillSet}</td>
<td> ${j.location}</td>
</tr>
</tbody>
</c:forEach>
</table>
</div>