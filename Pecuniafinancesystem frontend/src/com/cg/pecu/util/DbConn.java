package com.cg.pecu.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConn {
	public static Connection getConnection() throws Exception
	{Connection con=null;
		
		try {	Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
			    		"project","ramya");
			} 
		catch (Exception e) {
					e.printStackTrace();
				}
		return con;
			
			
	}
}
