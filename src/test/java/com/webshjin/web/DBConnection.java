package com.webshjin.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class DBConnection {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/goot6?serverTimezone=Asia/Seoul";
	private static final String USER = "root";
	private static final String PWD = "1234";
	
	@Test
	public void testConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL,USER,PWD)){
			if(con != null) {
				System.out.println("db 연결 성공");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
