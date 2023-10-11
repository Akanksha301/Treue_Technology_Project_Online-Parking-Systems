<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<Style>
body{
background : Pink ;
}
.card{
background : white ;
padding : 30px 30px ;
border-radius : 30px ;
text-align : center ;
}

input{
font-size: 20px;
}

input[placeholder] {
    font-size: 20px;
}
</Style>
<body>
<div class = "card" >
<form action = "Register" method ="post">
<div class = "title"><h1>Sing-Up</h1></div><br>
<input type = "text" name = "name" placeholder ="Enter Full Name" ><br><br>
<input type = "text" name = "contact" placeholder ="Enter Contact" ><br><br>
<input type = "text" name = "email" placeholder ="Enter Email" ><br><br>
<input type = "text" name = "username" placeholder ="Enter Username" ><br><br>
<input type = "text" name = "password" placeholder ="Enter Password" ><br><br>
<input type ="submit" value ="Sing-Up">
<input type ="reset" value = "Reset" >
<br><br>
<a href ="http://localhost:8080/OnlineParkingSystem/Login.jsp"><h3>Already a User ? Sing-in</h3></a>

</form>
</div>
</body>
</html>