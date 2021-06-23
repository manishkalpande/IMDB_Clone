package com.main.beans;

import java.sql.*;

public class RegisterUser 
{	
	
	public String register() 
	{
		User user=new User();
		
		Connection con;
		CallableStatement cst;
		ResultSet rs;
		try 
		{
			
			DBConnector db=new DBConnector();
			con=db.getDbconnection();
			System.out.println(user.getUserid());
			System.out.println(user.getUsernm());
			System.out.println(user.getEmail());
			System.out.println(user.getDob());
			System.out.println(user.getCountry());
			cst=con.prepareCall("{call userRegister(?,?,?,?,?,?,?,?,now(),?)}");
			cst.setString(1,user.getUserid());
			cst.setString(2,user.getPassword());
			cst.setString(3,user.getUsernm());
			cst.setString(4,user.getEmail());
			cst.setString(5,user.getGen());
			cst.setDate(6,user.getDob());
			cst.setString(7,user.getMob());
			cst.setString(8,user.getCountry());
			cst.setBlob(9,user.getFile());
			cst.execute();
			
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return "index";
		
	}

}
