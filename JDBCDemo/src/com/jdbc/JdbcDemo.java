package com.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	
	public Connection connect() {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/starhealth_db", "root", "admin");
			System.out.println("Connected Successfully");
			Statement stmt = con.createStatement();
			
		//	insert query
		//	String query = "insert into vehicle values('Bike','FZ',234)";
			
		//  update query
			String query = "update vehicle set vmail = 'abc@gmail.com'";
			
			int count = stmt.executeUpdate(query);
			System.out.println(count+" records updated");
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return null;
		
	}

	public static void main(String[] args) {
		/*
		 * try { DriverManager.registerDriver(new com.mysql.jdbc.driver.Driver());
		 * DriverManager.getConnection("jdbc:mysql:thin://localhost:3306/starhealth_db",
		 * "root", "admin"); System.out.println("Connected Successfully"); } catch
		 * (SQLException e) { throw new RuntimeException(e); }
		 */

		JdbcDemo jdbc = new JdbcDemo();
		jdbc.connect();
		
		
	}

}
