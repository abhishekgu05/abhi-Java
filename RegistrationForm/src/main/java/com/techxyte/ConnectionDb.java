package com.techxyte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
	public static Connection connection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost/XE";
		String username = "system";
		String password = "system";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection(url, username, password);
	}
}