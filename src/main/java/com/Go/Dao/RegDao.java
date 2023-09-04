package com.Go.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Go.Dbconfig.Dbconfig;
import com.Go.pojo.Reg;

public class RegDao {
	Connection con=Dbconfig.getConnection();
	public boolean addUser(Reg use) {
		try {
			String qry = "Insert into Customer_details values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(qry);
			ps.setInt(1, 0);
			ps.setString(2,use.getFirstname());
			ps.setString(3,use.getLastname());
			ps.setString(4,use.getEmail());
			ps.setString(5,use.getPhone());
			ps.setString(6,use.getArea());
			ps.setString(7,use.getLandmark());
			ps.setString(8,use.getPincode());
			ps.setString(9,use.getPassword());
			if(ps.executeUpdate()>0)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return (false);
	}

}
