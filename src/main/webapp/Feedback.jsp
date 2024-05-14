<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
        body {
        	
         	background-image: url(images/feedbackgive.jpg);
            background-repeat: no-repeat; 
        }
    </style>
<meta charset="UTF-8">
<title>FEEDBACK</title>
<link rel="stylesheet" type="text/css" href="feedback.css">
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
	<center><h1>FEEDBACK</h1></center>
  <div id="form-div">
    <form action="feedback" class="form" method="post">
      
      <p class="name">
       <center> <input name="userid" type="text"  placeholder="Add User id" id="name" required/></center>
      </p>
      <p class="name">
       <center> <input name="username" type="text"  placeholder="Add Userame" id="name" required/></center>
      </p>
      <p class="text">
        <textarea name="comment" id="comment" placeholder="Add Comment" required></textarea>
      </p>
      
      
      <div class="submit">
        <input type="submit" value="SEND" name = "submit" id="button-blue"/>
        <div class="ease"></div>
      </div>
    </form>
  </div>
</body>
</html>

