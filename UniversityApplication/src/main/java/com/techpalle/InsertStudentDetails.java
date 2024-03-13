package com.techpalle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.dao.DataAccess;

/**
 * Servlet implementation class InsertStudentDetails
 */
@WebServlet("/InsertStudent")
public class InsertStudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertStudentDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("Sname");
		String email = request.getParameter("Semail");
		int mob = Integer.parseInt(request.getParameter("Smob"));
		int maths = Integer.parseInt(request.getParameter("Maths"));
		int english = Integer.parseInt(request.getParameter("English"));
		
		DataAccess.insertStudent(name, email, mob, maths, english);
		
		PrintWriter out = response.getWriter();		
		out.println("Details Inserted Successfully");
	}

}
