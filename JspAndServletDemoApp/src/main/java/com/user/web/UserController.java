package com.user.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.web.model.UserInfo;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int userId = Integer.parseInt(request.getParameter("userId"));
		
		UserDao dao = new UserDao();
		
		try {
			UserInfo user = dao.getUserInfo(userId);
			
//			Using RequestDispatcher method
			/*request.setAttribute("userInfo", user);
			
			RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
			rd.forward(request, response);*/
			
//			Using sendRedirect method
			HttpSession session = request.getSession();
			session.setAttribute("userInfo", user);
			response.sendRedirect("user.jsp"); // used to redirect to another servlet or another page
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
