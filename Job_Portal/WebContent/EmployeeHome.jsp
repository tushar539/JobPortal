<%@include file="Header.jsp" %>

<style>
* {
  box-sizing: border-box;
}

body {
 background-image: url("Images/login1.jpg");
  background-color:white;
  font-family: Arial, Helvetica, sans-serif;
}

.nav {
  float: left;
  width: 30%;
  height: 300px; 
  background: #ccc;
  padding: 20px;
}

nav ul {
  list-style-type: none;
  padding: 0;
}

article {
  float: left;
  padding: 20px;
  width: 70%;
  background-color: #f1f1f1;
  height: 300px; 
}


section:after {
  content: "";
  display: table;
  clear: both;
}


.div {
  text-align:right;
  padding: 6px;
 
}

#d{
 text-align:center;
}

</style>
	</head>
	<body>

<div class="div">
    <td>Welcome: </td>
	<span style="color:black;font-weight:bolder">${Fname}</span>
</div>
    
 <c:if test="${not empty msg }">
 <div id="d">
 	<span style="color:blue;font-weight:bolder">${msg}</span>
</div>
</c:if>

<div>
            <h3 align="center"> <u>Home Page</u></h3>
            
  <section>
  <div class="nav">
    <ul>
   	  <li><a href="Employee_education.jsp">Add Education Details</a></li><br>
      <li><a href="SearchJob">Search Jobs</a></li><br>
      <li><a href="AppliedJobs">Applied Jobs</a></li><br>
    </ul>
  </div>
  
  <article>
  <p align="justify"><b>Welcome to JobsHunt.com. One Place to give your career a Boost.</b></p>
   <p style="font: bold 16px/30px Georgia,serif;" >
   Jobs Blogs:<br>
  <a href="https://careershift.com/blog/2019/02/how-to-know-youre-ready-for-a-leadership-role/">- The Post-Graduation To-Do List That Will Land You In Your Dream Job</a><br> 
  <a href="https://careershift.com/blog/2018/09/switching-college-majors/">- 4 Things to Consider Before Switching College Majors</a><br>
   <a href="https://careershift.com/blog/2017/06/productive-job-search-this-summer/">- 6 Hot Tips for a Productive Job Search This Summer</a><br>
   <a href="https://careershift.com/blog/2017/05/college-graduate-where-to-go-from-here/">- 3 Unexpected College Lessons To Take Into Your Job Search</a><br>
   <a href="https://careershift.com/blog/2017/03/four-ways-college-students-grads-can-find-jobs/">- Why College Students Should Rely on Their Alma Mater for Jobs</a><br>
   <a href="https://careershift.com/blog/2016/12/internships-students-resolution/">- The 4 Best New Years Resolutions To Make For Your College Students</a><br>
   </p>
  </article>
</section>
 </div>
 
 </br> </br> </br>

 <div>
 <h5 align="center"><b><u>Top Companies Hiring</u></b></h5>
 <marquee behavior="slide" direction="left">
<img src="Images\dell.png" width="125" height="82" alt="smiley">
<img src="Images\boeing.jpg" width="125" height="82" alt="smiley">
<img src="Images\at&t.png" width="125" height="82" alt="smiley">
<img src="Images\wipro.jpg" width="125" height="82" alt="smiley">
<img src="Images\fedex.png" width="125" height="82" alt="smiley">
<img src="Images\hcl.jpg" width="125" height="82" alt="smiley">
<img src="Images\hp.jpg" width="125" height="82" alt="smiley">
<img src="Images\ibm.png" width="125" height="82" alt="smiley">
<img src="Images\intel.png" width="125" height="82" alt="smiley">
<img src="Images\uni.jpg" width="125" height="82" alt="smiley">
</marquee>
 </div>

