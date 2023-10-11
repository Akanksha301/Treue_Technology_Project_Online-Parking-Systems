<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href=’https://fonts.googleapis.com/css?family=Merienda’ rel=’stylesheet’>
<style>
body{
background : Pink ;
 font-family: Merienda;
 font-size: 22px; 
}

li {
  display: inline;
}
li {
  float: left;
}

a {
  display: block;
  padding: 15px;
  background-color: #333;
  font-size : 20px ;
}
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change the link color to #111 (black) on hover */
li a:hover {
  background-color: grey;
  color: black;
}
.active {
  background-color: black;
}

.book{
Margin-top :50px ;
Margin-left : 550px ;
height : 200px ;
width : 400px ;
border-radius : 10px ;
background : #333 ;
Padding : 15px 20px ;
text-align : center ;
}
 h1{
 color : White ;
 text-align : center ;
 font-size : 30px ;
 font-weight : 30px ;
 font-family: Merienda;
 
 }
button{
height : 70px ;
width : 200px ;
font-Size : 25px ;
background : grey ;
color : white ;
border-radius : 10px ;

} 

</style>
<body>
<div class ="container">
<div class = "navbar">
<ul>
  <li><a href="default.asp">Home</a></li>
  <li><a href="http://localhost:8080/OnlineParkingSystem/Login.jsp">Sing-in</a></li>
  <li><a href="http://localhost:8080/OnlineParkingSystem/Register.jsp">Sing-Up</a></li>
  <li><a href="http://localhost:8080/OnlineParkingSystem/History.jsp">History</a></li>
  <li><a href="http://localhost:8080/OnlineParkingSystem/CanclePark.jsp">Cancel Parking</a></li>
  <li><a href="http://localhost:8080/OnlineParkingSystem/Logout.jsp">Logout</a></li>
</ul>
<Div Class = "title" ><h1 Style = "color : black ; font-size : 40px ;">Online Parking System</h1> 
</div>
<div class = "book">
<h1 Style = " font-size : 40px ;">Book Parking</h1>
<a href ="http://localhost:8080/OnlineParkingSystem/BookParking.jsp"><button>Click Here</button></a>
</div>
</div>
</div>
</body>
</html>