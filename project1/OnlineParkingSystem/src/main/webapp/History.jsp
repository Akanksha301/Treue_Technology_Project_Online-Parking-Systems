<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.sql.*" %>
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

</Style>
<body>
<table border ="1" style="width : 100%">
    <tr>
             
       <th>Username</th>
       <th>ArrivalDate</th>
       <th>Departure Date</th>
       <th>ArrivalTime</th>
       <th>Departure Time </th>
       <th>Vehicle No</th>
       <th>Location</th>
       <th>Slot No</th>

   </tr> 
   
<%

String username = (String)request.getSession().getAttribute("username");
String password = (String)request.getSession().getAttribute("password");

String Query = "select * from BookParking where username = ?" ;

String driver = "com.mysql.jdbc.Driver";
String Db_url = "jdbc:mysql://localhost:3306/OnlineParkingSystem";
String Db_username = "root";
String Db_password = "Create@1234";
     try{
    	 Class.forName(driver);
    	 Connection con = DriverManager.getConnection(Db_url,Db_username,Db_password);
    	 PreparedStatement ps = con.prepareStatement(Query);
		 ps.setString(1, username);
		 ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			%>
			<tr> 
			   <td><%=rs.getString("username") %></td>
			   <td><%=rs.getString("a_date") %></td>
			   <td><%=rs.getString("d_date") %></td>
			   <td><%=rs.getString("a_time") %></td>
			   <td><%=rs.getString("d_time") %></td>
			   <td><%=rs.getString("VechicleNo") %></td>
			   <td><%=rs.getString("location") %></td>
			   <td><%=rs.getString("slot_no") %></td>
			</tr>
			<% 
			}
 }
 catch(Exception e){
	 
 }
 %>  
 
   
</table>
</body>
</html>