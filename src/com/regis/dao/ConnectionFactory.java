package com.regis.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() throws ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection(
					"jdbc:oracle:thin:@10.250.100.1:1521:dev1",
					"delivery2","delivery2");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}