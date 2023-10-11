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
<div class ="card">
<form action = "CancelParking" method ="post">
<h1>Cancle Parking</h1>
<b>Are you sure you want to Cancel Parking ?</b><br><br>
<input type="radio" name="decision" value="yes">
<label >Yes</label><br>
<input type="radio"  name="decision" value="no">
<label >No</label><br><br>
<input type = "submit" value = "submit" >
</form>
</div>
</body>
</html>