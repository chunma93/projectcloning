package com.genuwin.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class DBConnection {

	final String DRIVER = "org.mariadb.jdbc.Driver";
	final String URL = "jdbc:mariadb://127.0.0.1:3306/genuwin";
	final String USER = "root";
	final String PASSWORD = "dndlf0716";

	@Test
	public void connectionTest() throws Exception {

		Class.forName(DRIVER);

		try {
			Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println(con);

		} catch (Exception e) {
			e.printStackTrace();
		}
	} // connectionTest end
}