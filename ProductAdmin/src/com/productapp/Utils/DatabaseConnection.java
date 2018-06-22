package com.productapp.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/flightdatabase";
	private static final String USER = "monish";
	private static final String PASS = "monish";

	public static Connection getDBConnection() {
		Connection conn = null;

		try {

			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

		} catch (Exception e) {
			System.out.println("Database Connection Exception Occured" + e);
		}
		return conn;
	}
	
	public static int executeQuerytoUpdate(Connection con,String query) {
		Statement stmt=null;
		
		int result=0;
		try {
			 stmt=con.createStatement();
		    result=stmt.executeUpdate(query);
		} catch (SQLException e) {
			
			System.out.println(" Exception Occured when trying to eecute query" + e);
		}
		finally {
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		if (con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		}
		return result;
		
	}
	
}