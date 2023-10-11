package com.project.parkingsystem.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import javax.servlet.http.Cookie;

import com.project.parkingsystem.Entity.BookParkingEntity;
import com.project.parkingsystem.database.BookParkinDatabase;

/**
 * Servlet implementation class BookSlots
 */
public class BookSlots extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookSlots() {
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
		
		HttpSession session = request.getSession();
		
		String username = (String)session.getAttribute("username");
		String adate = (String)request.getAttribute("adate");
		String ddate = (String)request.getAttribute("ddate");
		String atime = (String)request.getAttribute("atime");
		String dtime = (String)request.getAttribute("dtime");
		String vechno = (String)request.getAttribute("vechno");
		String location = (String)request.getAttribute("location");


		int slot = Integer.parseInt(request.getParameter("slots"));
		if(username == null) {
			session.setAttribute("message", "Please Login !!");
			RequestDispatcher rd=request.getRequestDispatcher("Here.jsp"); 
			rd.forward(request, response);
		}
		else {
			BookParkingEntity book = new BookParkingEntity(username,adate,ddate,atime,dtime,vechno,location,slot);
			BookParkinDatabase dao = new BookParkinDatabase();
			String result = dao.BookDataInsert(book);
			System.out.println(book);
			session.setAttribute("message", "Booking Has Been Placed");
			RequestDispatcher rd=request.getRequestDispatcher("Here.jsp"); 
			rd.forward(request, response);
		}
	}

}
