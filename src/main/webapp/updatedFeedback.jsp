<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     
<!DOCTYPE html>
<html>
<head>
<style>
        body {
           
         	background-image: url(images/feedback/feed.jpg);
           	background-size: cover; 
            background-attachment: fixed; 
            background-repeat: no-repeat; 
        }
    button {
      text-decoration: none;
    }

    </style>
<link rel="stylesheet" type="text/css" href="feedbackreview.css">
<meta charset="UTF-8">
<title>title</title>
</head>
<body>

    <div id="container">
        <nav>
            <ul>
                <li><a href="#">HOME</a></li>
                <li>
                    <a href="#">ITEMS</a>
                </li>
                <li>
                    <a ></a>
                </li>
                <li CLASS="sign"><a CLASS="sign"href="#">SIGNIN</a></li>
                <li CLASS="sign"><a  CLASS="sign"href="#">SIGNUP</a></li>
            </ul>
        </nav>
    </div>
    
    <br>
    <br>
    
		<center><h1>FEEDBACKS</h1></center>
<div id="form-div">
  <form class="form" method="post">
<c:forEach var="feed" items="${feedDetails}">
	
	<c:set var ="fid" value="${feed.ID}"/>
	<c:set var ="id" value="${feed.userID}"/>
	<c:set var ="uname" value="${feed.name}"/>
	<c:set var ="msg1" value="${feed.msg}"/>
	
	
	   <p class="name">
	   
       <center> <label>feedback ID :</label><input name="feedid" type="text"  placeholder="${feed.ID}" id="name" readonly/></center>
      </p>
      <p class="name">
     
       <center> <label>user ID :</label> <input name="userid" type="text"  placeholder="${feed.userID}" id="name" readonly/></center>
      </p>
      <p class="name">
      
       <center><label>user name :</label> <input name="username" type="text"  placeholder="${feed.name}" id="name" readonly/></center>
      </p>
      <p class="text">
      <center><label>feedback message</label></center>
        <textarea name="comment" id="comment" placeholder="${feed.msg}" readonly></textarea>
      </p>
     
	
<br><br><br><br>
</c:forEach>
</form>
<br>
<div class="submit">
		
		<c:url value="updatefeedback.jsp" var ="feedupdate">
		
		<c:param name="fid" value="${fid}"/>
		<c:param name="uid" value="${id}"/>
		<c:param name="uname" value="${uname}"/>
		<c:param name="comment" value="${msg1}"/>
		</c:url>
		<a href="${feedupdate}">
        <input type="submit" value="UPDATE" name = "update" id="button-blue" /></a>
        
        <c:url value="deletefeedback.jsp" var ="delfeedback">
        
        <c:param name="fid" value="${fid}"/>
		<c:param name="uid" value="${id}"/>
		<c:param name="uname" value="${uname}"/>
		<c:param name="comment" value="${msg1}"/> 
		
        </c:url>
        <button id="button-blue" ><a href="./deleteFeedback?fid=${fid}">Delete</a></button>
        <div class="ease"></div>
      </div>

</div>
</body>
</html>