package com.project.parkingsystem.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CancelParking
 */
public class CancelParking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CancelParking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		jakarta.servlet.http.HttpSession session = request.getSession();
		
		String username = (String) session.getAttribute("username");
		String password = (String) session.getAttribute("password");
		
		if(username == null) {
			session.setAttribute("message", "Login please");
			RequestDispatcher rd=request.getRequestDispatcher("Here.jsp"); 
			rd.forward(request, response);
		}
		else {
			
			 boolean status = true ;
			 String dburl ="jdbc:mysql://localhost:3306/OnlineParkingSystem" ;
			 String dbusername = "root";
			 String dbpassword ="Create@1234" ;
			 String dbdriver = "com.mysql.jdbc.Driver" ;
			 
			 String Query = "Delete from BookParking where username = ?" ;
			 
			 try {
				Class.forName(dbdriver);
				Connection con = DriverManager.getConnection(dburl,dbusername,dbpassword);
				PreparedStatement ps = con.prepareStatement(Query);
				ps.setString(1, "username");
				ResultSet rs = ps.executeQuery();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				status = false ;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				status = false ;
			}
			 
			 if(status) {
				 session.setAttribute("message", "Parking Canceled");
					RequestDispatcher rd=request.getRequestDispatcher("Here.jsp"); 
					rd.forward(request, response);
			 }
			 else {
				 session.setAttribute("message", "Some Trouble Occor Please try again");
					RequestDispatcher rd=request.getRequestDispatcher("Here.jsp"); 
					rd.forward(request, response);
			 }
		}
	}

}
