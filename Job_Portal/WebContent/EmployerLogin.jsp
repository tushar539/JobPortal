<%@include file="Header.jsp" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<head>
<style>

* {
  box-sizing: border-box;
}

.bg-img {
  background-image: url("Images/login2.jpg");

    filter: blur(8px);
  -webkit-filter: blur(8px);
  
  /* Full height */
  height: 500px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

/* Add styles to the form container */
.container {
  position:sticky;
  margin: 20px;
  max-width: 400px;
  padding: 16px;
  background-color: white;
}

/
/* Set a style for the submit button */
.btn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
}
</style>
</head>

<div class="bg-img" align="center">
<form action="EmployerLogin" class="container" method="post"> 
<h1 align="center"><b><u>Recruiter Login</u></b> </h1>
<table cellpadding="10">
<tr>
<td><label for="Email">Email:</label></td>
<td> <input type="email" name="employerEmail" id="Email" placeholder="Enter your email address" size=25 required> </td>
</tr>
<tr>
<td><label for="pass">Password: </label></td>
<td><input type="password" name="employerPass" id="pass" placeholder="Enter your password" size=25 required> </td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Login" class="w3-button w3-teal"></td>
</tr>
</table>
<div align="center">
<table>
<tr><td><a href="ForgotPass.jsp">Forgot Password</a></td></tr>
<tr><td><a href="NewEmployer.jsp">New? Register here</a></td></tr>
</table>
</div>
</form>
</div>
</br>


