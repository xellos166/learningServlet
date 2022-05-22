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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		RequestDispatcher dispatcher = null;
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("userName");
		String pass = request.getParameter("password");

		if (userName != null && !userName.isBlank() && userName.equals("admin@gmail.com") && pass != null
				&& !pass.isBlank() && pass.equals("abc@123")) {
			// session creation
			HttpSession session = request.getSession(true);
			session.setAttribute("userName", userName);
			dispatcher = request.getRequestDispatcher("header.html");
			dispatcher.include(request, response);
			out.print("<h2>you have Succesfully Logged in </h2>");

		} else {
			dispatcher = request.getRequestDispatcher("index.html");
			dispatcher.include(request, response);
			out.print("<h4>User Name or Password invalid</h4>");

		}

	}

}
