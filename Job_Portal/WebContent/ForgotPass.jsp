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
<form action="ForgotPass" method="post">

<c:if test="${not empty msg }">
<span style="color:green;font-weight:bolder">${msg}</span>
</c:if>

<h1><b><u>Forgot password</u></b> </h1>
<table cellpadding="10">
<tr>
<td>Email: </td>
<td> <input type="email" name="employeeemail" placeholder="Enter your email to found your account" size=40 required> </td>
</tr>
<tr>
<td> </td>
<td> <input type="submit" value="Submit" class="w3-button w3-teal">

<a href="Index.jsp" class="w3-btn w3-teal"> Cancel </a>

</td>
</tr>
</table>
</form>
</div>

