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
background : pink ;
}

.card{
padding : 10px ;
text-align : center ;
padding : 10px 40px ;
}
            
.slot{
margin-left : 30px ;
font-size: 30px;
height : 230px ;
width : 170px ;
background : grey ;
border-radius : 10px ;
justify-content : space-between ;
border: 1px solid black ;
flex-direction: row;
display : inline block ;


}
.main {

            display: flex;
            flex-direction: row;
            font-size: 30px;
            color: black;
            border: 2px dashed grey;
            padding: 5px;
            min-width: 50%;
        }
 
 input {
 font-size : 30px ;
 }
 h1{
 font-size : 30px ;
 }
 

</Style>
<body>
<div class = "card" >
<form action ="BookSlots" method ="post">
<h1>Select Slots</h1>
<br><br>

<div class="main">
        <div class = "slot"><input type="radio" name="slots" value="1">Slot 1</div>
        <div class = "slot"><input type="radio" name="slots" value="2">Slot 2</div>
        <div class = "slot"><input type="radio" name="slots" value="3">Slot 3</div>
        <div class = "slot"><input type="radio" name="slots" value="4">Slot 4</div>
        <div class = "slot"><input type="radio" name="slots" value="5">Slot 5</div>
        <div class = "slot"><input type="radio" name="slots" value="6">Slot 6</div>    
        <div class = "slot"><input type="radio" name="slots" value="7">Slot 6</div>
    </div>
    <br><br><br><br><br><br><br><br>
    <div class="main">
        <div class = "slot"><input type="radio" name="slots" value="8">Slot 1</div>
        <div class = "slot"><input type="radio" name="slots" value="9">Slot 2</div>
        <div class = "slot"><input type="radio" name="slots" value="10">Slot 3</div>
        <div class = "slot"><input type="radio" name="slots" value="11">Slot 4</div>
        <div class = "slot"><input type="radio" name="slots" value="12">Slot 5</div>
        <div class = "slot"><input type="radio" name="slots" value="13">Slot 6</div>   
        <div class = "slot"><input type="radio" name="slots" value="14">Slot 6</div> 
    </div>

<br><br><br>
<input type = "submit" >
</form>
</div>
</body>
</html>