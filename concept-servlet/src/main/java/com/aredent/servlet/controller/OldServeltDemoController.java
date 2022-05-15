package com.aredent.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OldServeltDemoController
 */
public class OldServeltDemoController extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		super.service(req, res);
		System.out.println("Service Called:");
	}

	@Override
	public void destroy() {
		System.out.println("Servlet is going to be Destryed");
		super.destroy();

	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Servlet initialized");
	}

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OldServeltDemoController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.print("Welcome :" + request.getParameter("name"));

		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String userName = request.getParameter("name");
		String pass = request.getParameter("pass");
		RequestDispatcher requestDispatcher = null;
		if (pass.equals("xyz123")) {
			RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("login");
			requestDispatcher1.forward(request, response);

		} else {
			pw.print("<b>Username or password not valid !!!</b>");
			requestDispatcher = request.getRequestDispatcher("/index.html");
			requestDispatcher.include(request, response);
		}

		pw.close();
	}

}
