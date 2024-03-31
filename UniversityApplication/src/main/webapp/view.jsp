<%@page import="com.techpalle.model.StudentDetails"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DISPLAY PAGE</title>
</head>
<body>
<h1>Student Details</h1>
	<%
	ArrayList<StudentDetails> al = (ArrayList<StudentDetails>) request.getAttribute("students");
	%>
	<table border="2">
	<%
	for(StudentDetails s : al)
	{
	%>
		<tr bgcolor = 'yellow'>
			<td><%=s.getSname()%></td>
			<td><%=s.getSemail()%></td>
			<td><%=s.getMaths()%></td>
			<td><%=s.getEnglish()%></td>
		</tr>
	<%
	}
	%>
	</table>
</body>
</html>