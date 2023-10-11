package com.project.parkingsystem.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.project.parkingsystem.Entity.BookParkingEntity;
import com.project.parkingsystem.Entity.RegisterEntity;

public class BookParkinDatabase {

	private String dburl ="jdbc:mysql://localhost:3306/OnlineParkingSystem" ;
	private String dbusername = "root";
	private String dbpassword ="Create@1234" ;
	private String dbdriver = "com.mysql.jdbc.Driver" ;
	
	public void loadDriver(String dbdriver) {
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con = null ;
		
		try {
			con = DriverManager.getConnection(dburl,dbusername,dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public String BookDataInsert (BookParkingEntity book) {
		String result = "Data added successfully" ;
		String Query = "insert into bookparking values(?,?,?,?,?,?,?,?)" ;
		
		loadDriver(dbdriver);
		Connection con = getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(Query);
			ps.setString(1,book.getUsername() );
			ps.setString(2, book.getAdate());
			ps.setString(3, book.getDdate());
			ps.setString(4, book.getAtime());
			ps.setString(5, book.getDtime());
			ps.setString(6, book.getVechno());
			ps.setString(7, book.getLocation());
			ps.setInt(8, book.getSlot());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "data not entered";
		}
		
		return result ;
		
	}
}
