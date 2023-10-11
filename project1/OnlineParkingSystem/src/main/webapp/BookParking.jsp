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
.container{
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
<div class ="container"> 
<form action = "BookParking" method = "post">
<div class = "title"><h1>Book Parking </h1></div><br>
<b>Arrival Date : </b><input type ="date" name ="adate"><br><br>
<b>Departure Date : </b><input type ="date" name ="ddate"><br><br>
<b>Arrival Time : </b><input type ="time" name ="atime"><br><br>
<b>Departure Time :</b> <input type ="time" name ="dtime"><br><br>
<b>Vehicle No :</b> <input type ="text" name ="vechno"><br><br>
<b>Location :</b>
<select name="location" id="location">
<option value="Nagpur" >Nagpur</option>
<option value="Amravati" >Amravati</option>
</select><br><br>
<input type = "submit" >
</form>
</div>
</body>
</html>