package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
	private static final String DRIVERCLASS = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/working?useUnicode=true&characterEncoding=utf-8";
	private static final String USERNAME = "bankMaster";
	private static final String PASSWORD = "1234";
	
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(DRIVERCLASS);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	
	public void closeAll(Connection conn, Statement st, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (st != null)
				st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
