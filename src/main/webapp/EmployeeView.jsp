<!-- 
 ~ author: @tridib2003
-->

<%@page import="com.tridib.app.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body style="background-color: #BBF7D0;">
	
	<%
		/* Using RequestDispatcher */
		// Employee emp = (Employee)request.getAttribute("employee");
	
		/* Using sendRedirect */
		Employee emp = (Employee)session.getAttribute("employee");
	
		// out.println(emp);
	%>

	<div style="text-align:center;">
	
	<h2>Employee Details</h2>
	
	<p style="text-align:center;">
		Employee ID: <%= emp.getEmp_id() %> <br>
		Name: <%= emp.getEmp_firstname() %> <%= emp.getEmp_surname() %>  <br>
		Age: <%= emp.getEmp_age() %> <br>
		Address: <%= emp.getEmp_address() %> <br>
		Contact: <%= emp.getContact_no() %> <br>
	</p>
	
	<br>
	
	<form action="index.jsp">
		<input type="submit" value="Go back">
	</form>
	
	</div>

</body>
</html>