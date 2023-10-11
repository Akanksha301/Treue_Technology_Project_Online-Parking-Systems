package com.project.parkingsystem.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.project.parkingsystem.Entity.LoginEntity;
import com.project.parkingsystem.database.LoginDatabase;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		
		HttpSession session = request.getSession(true);
		
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Cookie cookie = new Cookie("username" , username);
		response.addCookie(cookie);
		
		LoginEntity user = new LoginEntity(username,password);
		LoginDatabase dao = new LoginDatabase();
		
		boolean Status = dao.logincheck(user);
		if(Status) {
			session.setAttribute("message", "Login Succesfully");
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			RequestDispatcher rd=request.getRequestDispatcher("Here.jsp"); 
			rd.forward(request, response);
		}
		else {
			session.setAttribute("message", "Invalid Username or Password");
			RequestDispatcher rd=request.getRequestDispatcher("Here.jsp"); 
			rd.forward(request, response);
		}
	}

}
