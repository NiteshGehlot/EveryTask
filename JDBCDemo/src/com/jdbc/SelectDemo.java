package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/starhealth_db", "root", "admin");
			System.out.println("Connected Successfully");
			Statement stmt = con.createStatement();
			
			String query = "select * from vehicle";
			ResultSet result = stmt.executeQuery(query);
			while(result.next()) {
				String vtype = result.getString("vtype");
				String vname = result.getString("vname");
				int vid = result.getInt("vid");
				String vmail = result.getString("vmail");
				
				
				System.out.println(vtype+" "+vname+" "+vid+" "+vmail);
				
			}

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
		
	}

}
