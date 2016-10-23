package com.clothingcloset.handlers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.clothingcloset.databaseconnections.ConnectionUtil;

public class LoginHandler {

	private static ConnectionUtil connectionUtil = new ConnectionUtil();
	public boolean registerUser(String userName, String password, Integer id,String userType){
		
		Connection conn = null;
		boolean isUserRegistered= false;
		Statement stmt= null;

		
		try{
			conn = connectionUtil.connectToDatabase();

			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql = "INSERT INTO USERLOGIN (USERNAME,ID,PASSWORD,USERTYPE) VALUES"
					+ "('"+userName+"',"+id+",'"+password+"','"+userType+"');";
			
			System.out.println("SQL Query is : "+sql);
			stmt.executeUpdate(sql);
			isUserRegistered = true;
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException sqlException) {
				sqlException.printStackTrace();
			} 
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} 
		} 
		return isUserRegistered;
		
	}
}
