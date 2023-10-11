package com.project.parkingsystem.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.project.parkingsystem.Entity.RegisterEntity;
import com.project.parkingsystem.database.RegisterDatabase;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		
		String name = request.getParameter("name");
		long contact = Long.parseLong(request.getParameter("contact"));
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		RegisterEntity user = new RegisterEntity(name,contact,email,username,password);
		RegisterDatabase dao = new RegisterDatabase();
		String result = dao.regDataInsert(user);
		response.getWriter().print(result);
		if(result.equals("Data added successfully")) {
			session.setAttribute("message", "Register Succesfully");
			session.setAttribute("username",username);
			session.setAttribute("password",password);
			RequestDispatcher rd=request.getRequestDispatcher("Here.jsp"); 
			rd.forward(request, response);
			session.removeAttribute("message");
		}
		else {
			session.setAttribute("message", "This Username already exist !");
			RequestDispatcher rd=request.getRequestDispatcher("Here.jsp"); 
			rd.forward(request, response);
			session.removeAttribute("message");
		}
		
		
	}

}
