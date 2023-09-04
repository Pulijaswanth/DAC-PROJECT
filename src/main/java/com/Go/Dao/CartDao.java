package com.Go.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Go.Dbconfig.Dbconfig;
import com.Go.pojo.Cart;

public class CartDao {
Connection con=Dbconfig.getConnection();
public boolean cart(Cart c) {
	try {
		String str="INSERT INTO CART_INFO VALUES(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(str);
		ps.setInt(1,0);
		ps.setString(2,c.getName());
		ps.setString(2,c.getPrice());
		ps.setString(2,c.getSize());
		if(ps.executeUpdate()>0) {
			return true;
		}
	}catch(Exception e) {
		System.out.println(e);
	}
	return false;
	
}
}
