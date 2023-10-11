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
 * Servlet implementation class BookParking
 */
public class BookParking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookParking() {
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
		 String username = (String)session.getAttribute("uname");
		String adate = request.getParameter("adate");
		String ddate = request.getParameter("ddate");
		String atime = request.getParameter("atime");
		String dtime = request.getParameter("dtime");
		String vechno = request.getParameter("vechno");
		String location = request.getParameter("location");
		
		session.setAttribute("adate",adate );
		session.setAttribute("ddate",ddate );
		session.setAttribute("atime",atime );
		session.setAttribute("dtime",dtime );
		session.setAttribute("vechno",vechno );
		session.setAttribute("location",location );
		
		if(location.equals("Nagpur")){  
	        RequestDispatcher rd=request.getRequestDispatcher("NagSlot.jsp");  
	        rd.forward(request, response);  
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("AmSlot.jsp");  
	        rd.forward(request, response);  
		}
	}

}
