package com.main.beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	private Connection dbconnection;

	public DBConnector() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbconnection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/imdb_clone?user=root&password=Manish12");
		} 
		catch (Exception ex) {
			System.out.println(ex);
		}

	}

	public Connection getDbconnection() {
		return dbconnection;
	}

}
