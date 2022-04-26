package com.bridgelabz.jdbc;
import java.sql.DriverManager;
import java.sql.SQLException;
	
public class DBConnection {

public static void main(String[] args) {
// step 1
			
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	    System.out.println("Driver loaded");
        } 
	    catch (ClassNotFoundException e) 
	    {
		System.out.println("Driver not loaded");
		}
// step 2
		String JDBCURL = "jdbc:mysql://localhost:3306/";
		try {
		DriverManager.getConnection(JDBCURL, "root", "Prachi@1808");
		System.out.println("Connection established");
		}
		catch (SQLException e) {
		System.out.println("Connection not established");
			}
		}
	}