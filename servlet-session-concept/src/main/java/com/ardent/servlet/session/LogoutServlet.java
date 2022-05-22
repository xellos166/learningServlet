package com.ardent.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		RequestDispatcher dispatcher = null;
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);

		if (session != null) {
			String userName = (String) session.getAttribute("userName");
			if (userName != null && !userName.isBlank()) {
				session.invalidate();
				dispatcher = request.getRequestDispatcher("index.html");
				dispatcher.include(request, response);
				out.print("<h2>you have Succesfully Logged out </h2>");
			}
		} else {
			dispatcher = request.getRequestDispatcher("index.html");
			dispatcher.include(request, response);
			out.print("<h2>you have already Succesfully Logged out </h2>");
		}

	}

}
