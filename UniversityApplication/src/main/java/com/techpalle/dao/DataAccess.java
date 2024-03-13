package com.techpalle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataAccess {
	public static boolean insertStudent(String name, String email, int mob, int maths, int english)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/University","root","admin@2002");
			PreparedStatement s = con.prepareStatement("insert into student(sname,semail,smob,maths,english) values(?,?,?,?,?)");
			s.setString(1, name);
			s.setString(2, email);
			s.setInt(3, mob);
			s.setInt(4, maths);
			s.setInt(5, english);
			s.executeUpdate();
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}

}
