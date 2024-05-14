<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
        body {
           background-color: rgb(175, 202, 209);
        }
    </style>
<link rel="stylesheet" type="text/css" href="feedbackreview.css">
<meta charset="UTF-8">
<title>successful</title>
</head>
<body>

		<center><h1>DELETE FEEDBACK</h1></center>

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
    <form Action="delete" class="form" method="post">
    	
    	 <p class="name">
       <center> <label>feedback ID :</label> <input name="feedid" type="text"  placeholder="<%=fid%>" id="name" readonly/></center>
      </p>
      <p class="name">
       <center>  <label>user ID :</label><input name="userid" type="text"  placeholder="<%=uid%>" id="name" readonly/></center>
      </p>
      <p class="name">
       <center><label>user name :</label><input name="username" type="text" id="name" placeholder="<%=uname%>" readonly/></center>
      </p>
      <p class="text"> <center><label>feedback message</label></center>
        <textarea name="comment" id="comment"><%=msg%></textarea>
      </p>
     <br>
     
     
     <div class="submit">
        <input type="submit" value="DELETE" name = "submit" id="button-blue"/>
        <div class="ease"></div>
      </div>
      <br>
      <br>
    </form>
</div>
</body>
</html>