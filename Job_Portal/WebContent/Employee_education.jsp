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
<form action="AddEmployeeEducation" method="post">

<h1><b>Add Education Details</b> </h1>


<c:if test="${not empty msg }">
 <span style="color:blue;font-weight:bolder">${msg}</span>
</c:if>

<table cellpadding="10">
<tr>
<td>Employee Id: </td>
<td> <input type="text" name="empId" value="${empid}" readonly="readonly">  </td>
</tr>
<tr>
<td><label for="tenth">10th Marks:</label> </td>
<td> <input type="text" name="tenthmarks" id="tenth" placeholder="Enter 10th marks in percentage" size=25 required> </td>
</tr>
<tr>
<td><label for="tenth_board">10th Board</label></td>
<td> <input type="text" name="tenthboard" id="tenth_board" placeholder="Enter board" size=25 required> </td>
</tr>
<tr>
<td><label for="twelveth">12th Marks: </label></td>
<td> <input type="text" name="twlevethmarks" id="num" placeholder="Enter 12th marks in percentage" size=25 required> </td>
</tr>
<tr>
<td><label for="twelveth_board">12th Board:</label> </td>
<td> <input type="text" name="twlevethboard" id="twelveth_board" placeholder="Enter board" size=25 required> </td>
</tr>
<tr>
<td><label for="graduation">Graduation Score:</label> </td>
<td> <input type="text" name="graduationmarks" id="graduation" placeholder="Enter graduation marks in percentage" size=25 required> </td>
</tr>
<tr>
<td><label for="college">College:</label> </td>
<td> <input type="text" name="college" id="college" placeholder="Enter college name" size=25 required> </td>
</tr>
<tr>
<td><label for="branch">Branch:</label> </td>
<td> <input type="text" name="branch" id="branch" placeholder="Enter course branch" size=25 required> </td>
</tr>
<tr>
<td><label for="experience">Experience:</label> </td>
<td> <input type="text" name="experience" id="experience" placeholder="Enter experience if any" size=25 required> </td>
</tr>
<tr>
<td> </td>
<td> <input type="submit" value="Submit" class="w3-button w3-teal"></td>
</tr>
</table>
</form>
</div>

