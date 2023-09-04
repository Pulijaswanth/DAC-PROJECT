package com.Go.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Go.Dbconfig.Dbconfig;
import com.Go.pojo.Login;

import jakarta.servlet.RequestDispatcher;

public class LoginDao {
	Connection con=Dbconfig.getConnection();
	public boolean login(Login log) {
		try {
			String str="Select email,password from Customer_details where email=? AND password=?";
			PreparedStatement ps=con.prepareStatement(str);
			ps.setString(1,log.getEmail());
			ps.setString(2,log.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
		
	}
	
}
