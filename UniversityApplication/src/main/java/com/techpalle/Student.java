package com.techpalle;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.dao.DataAccess;
import com.techpalle.model.StudentDetails;

/**
 * Servlet implementation class Student
 */
@WebServlet("/Save")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ArrayList<StudentDetails> al =  DataAccess.getStudents();
		request.setAttribute("students", al);
		RequestDispatcher r = request.getRequestDispatcher("view.jsp");
		r.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String sname = request.getParameter("sname");
		String semail = request.getParameter("semail");
		int maths = Integer.parseInt(request.getParameter("maths"));
		int english = Integer.parseInt(request.getParameter("english"));
		
		DataAccess.insertStudents(sname,semail,maths,english);
		doGet(request, response);
	}

}
