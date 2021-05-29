package com.main.beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	private Connection dbconnection;

	public DBConnector() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbconnection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/e_wallet ? user=root&password=garry74");
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

	public Connection getDbconnection() {
		return dbconnection;
	}

}
