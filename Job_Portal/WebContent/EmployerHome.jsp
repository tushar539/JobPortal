<%@include file="Header.jsp" %>

<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
   background-image: url("Images/login1.jpg");
  background-color:white;
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

</style>
    </head>
    <body>
    
    <div class="div" >
    <td>Welcome: </td>
	<span style="color:black;font-weight:bolder">${Fname}</span>
    </div>
    
        <div>
            <h3 align="center"> <u>Home Page</u></h3>
            
  <section>
  <div class="nav">
    <ul>
      <li><a href="AddJob.jsp">Add Jobs</a></li><br>
      <li><a href="ViewAllEmployee">Applicants List</a></li><br>
      <li><a href="ViewJobByRecruiter">Jobs List</a></li>
    </ul>
  </div>
  
  <article>
     <p align="justify"><b>Welcome to JobsHunt.com. One Place to give your career a Boost.</b> </p>
   <p style="font: bold 16px/30px Georgia,serif;">
   Employer Blogs:<br>
  <a href="https://careershift.com/blog/2019/05/how-to-offer-a-better-severance-package-for-displaced-workers/">- How to Offer a Better Severance Package for Displaced Workers</a><br> 
  <a href="https://careershift.com/blog/2019/05/rethinking-job-descriptions-the-secret-to-reaching-more-candidates/">- Rethinking Job Descriptions: The Secret to Reaching More Candidates</a><br>
   <a href="https://careershift.com/blog/2019/04/dont-let-the-college-admissions-scandal-ruin-hiring-college-students/">- Dont Let the College Admissions Scandal Ruin Hiring College Students</a><br>
   <a href="https://careershift.com/blog/2019/02/3-college-experiences-you-want-to-find-in-new-graduates/">- 3 College Experiences You Want to Find in New Graduates</a><br>
   <a href="https://careershift.com/blog/2019/01/generation-z-what-they-want-from-your-employer-brand/">- Generation Z: What They Want from Your Employer Brand</a><br>
   <a href="https://careershift.com/blog/2019/02/how-to-know-youre-ready-for-a-leadership-role/">- Are You Ready for a Leadership Role? How to Know for Sure</a><br>
   </p>
  </article>
</section>
 </div>
 
 </br> </br> </br>
 
 <div>
 <h5 align="center"><b><u>Top Colleges to Recruit</u></b></h5>
 <marquee behavior="slide" direction="left">
<img src="Images\pic6.png" width="125" height="82" alt="smiley">
<img src="Images\pic8.jpg" width="125" height="82" alt="smiley">
<img src="Images\pic9.png" width="125" height="82" alt="smiley">
<img src="Images\pic15.jpg" width="125" height="82" alt="smiley">
<img src="Images\pic10.png" width="125" height="82" alt="smiley">
<img src="Images\pic7.png" width="125" height="82" alt="smiley">
<img src="Images\pic13.jpg" width="125" height="82" alt="smiley">
<img src="Images\pic12.jpg" width="125" height="82" alt="smiley">
<img src="Images\pic14.jpg" width="125" height="82" alt="smiley">
<img src="Images\pic11.jpg" width="125" height="82" alt="smiley">
</marquee>
 </div>
 
 
 
 
 
 
 
 
 
 
 