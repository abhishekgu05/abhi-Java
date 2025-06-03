package com.techxyte1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class RegistrationDb {
	public static Connection connecton() throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost/XE\"";
		String username = "system";
		String password = "system";
		Class.forName("oralce.jdbc.driver.OracleDriver");
		return DriverManager.getConnection(url, username, password);
		
		
	}
}