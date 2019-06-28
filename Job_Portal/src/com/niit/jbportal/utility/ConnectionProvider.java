package com.niit.jbportal.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	
	public static Connection getConn() throws Exception{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-LBLL14U\\TUSHAR;databaseName=niitdb;user=sa;password=sql@2012");
		return conn;
		}
}
