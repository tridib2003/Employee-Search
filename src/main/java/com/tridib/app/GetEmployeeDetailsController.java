/*
 * author: @tridib2003
 */

package com.tridib.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tridib.app.dao.EmployeeDAO;
import com.tridib.app.model.Employee;

public class GetEmployeeDetailsController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int emp_id = Integer.parseInt(request.getParameter("empid"));
		
		EmployeeDAO empdao = new EmployeeDAO();
		
		Employee emp1 = empdao.getEmployeeData(emp_id);
		
		/* Using RequestDispatcher */
//		request.setAttribute("employee", emp1);
//		
//		RequestDispatcher rd = request.getRequestDispatcher("EmployeeView.jsp");
//		rd.forward(request, response);
		
		/* Using HttpSession, sendRedirect */
		HttpSession session = request.getSession();
		session.setAttribute("employee", emp1);
		
		response.sendRedirect("EmployeeView.jsp");
	}

}
