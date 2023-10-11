<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
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
</style>
<body>
<div class = "card">
<form action = "Login" method ="post">
<div class ="title" ><h1>Sing-in</h1></div>
<input type = "text" name = "username" placeholder="Enter Username" ><br><br>
<input type = "text" name = "password" placeholder="Enter Password" ><br><br>
<input type = "Submit"  Value = "Sing-in" >
</form>
</div>
</body>
</html>