package com.tecsup.lab08.crud.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionDB {

	public static Connection getConnection() {
		Connection con=null;
		String url="jdbc:oracle:thin:@192.168.13.250:1521:xe";
		String user="HR";
		String password ="HR";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection Completed");
		}catch(SQLException|ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}finally {
			
		}
		return con;
	}
}
