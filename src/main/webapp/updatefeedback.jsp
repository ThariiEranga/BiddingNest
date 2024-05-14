<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
        body {
          background-image: url(images/feedback/up.jpg);
           background-size: cover; 
            
            background-repeat: no-repeat; 
            
        }
    </style>
<link rel="stylesheet" type="text/css" href="feedbackreview.css">
<meta charset="UTF-8">
<title>IUPDATE FEEDBACK</title>
</head>
<body><br><br>
<center><h1>UPDATE FEEDBACK</h1></center>

	<%
		String fid = request.getParameter("fid");
		String uid = request.getParameter("uid");
		String uname = request.getParameter("uname");
		String msg = request.getParameter("comment");
		
		if (uname == null || uname.isEmpty()) {
	        uname = "null";
		}

	%>

  <div id="form-div">
    <form action="./updatefeedbackServelet" class="form" method="post">
    
    <p class="name">
       <center> <label>feedback ID :</label><input name="fid" type="text"  value="<%=fid%>"   id="name" /></center>
      </p>
	<p class="name">
       <center> <label>user ID :</label> <input name="uid" type="text"  value="<%=uid%>" id="name" /></center>
      </p>
      <p class="name">
       <center><label>user name :</label> <input name="uname" type="text" id="name" value="<%=uname%>" /></center>
      </p>
      <p class="text"> <center><label>feedback message</label></center>
        <textarea name="cnt" id="comment"><%=msg%></textarea>
      </p>
     <br>
     
     
     <div class="submit">
        <input type="submit" value="UPDATE" name = "submit" id="button-blue"/>
        <div class="ease"></div>
      </div>
      <br>
      <br>
    </form>
  </div>
  
</body>
</html>