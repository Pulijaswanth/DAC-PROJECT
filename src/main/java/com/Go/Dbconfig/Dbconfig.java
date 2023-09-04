package com.Go.Dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconfig {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ECOM","root","Jaswanth@3434");
			return con;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

}