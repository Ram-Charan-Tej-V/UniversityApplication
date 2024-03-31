package com.techpalle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.techpalle.model.StudentDetails;

public class DataAccess {
		public static boolean insertStudents(String sname,String semail,int maths, int english)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root", "admin@2002");
				PreparedStatement s = con.prepareStatement("insert into student values (?,?,?,?)");
				s.setString(1, sname);
				s.setString(2, semail);
				s.setInt(3, maths);
				s.setInt(4, english);
				s.executeUpdate();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return false;
			
		}
		public static ArrayList<StudentDetails> getStudents() {
			ArrayList<StudentDetails> al = new ArrayList<StudentDetails>();//empty
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","admin@2002");
				Statement s = con.createStatement();
				ResultSet res = s.executeQuery("select * from student");
				if(res != null) {
					while(res.next() == true) {
						//read each row from student table
						String sname = res.getString(1);
						String semail = res.getString(2);
						int maths = res.getInt(3);
						int english = res.getInt(4);
						//create student object
						StudentDetails obj = new StudentDetails(sname,semail,maths,english);
						//add student object to arraylist
						al.add(obj);
					}
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}		
			return al;		
		}
		
	}

