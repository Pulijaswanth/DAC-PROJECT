package com.Go.Controller;
import com.Go.Dao.LoginDao;
import com.Go.pojo.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/login")

public class logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("login.jsp");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Login log=new Login(email,password);
		LoginDao ldao=new LoginDao();
		HttpSession session=request.getSession(true);
		session.setAttribute("email", "log.getEmail()");
		if(ldao.login(log)) {
			session.setAttribute("auth","Login Successfull");
			response.sendRedirect("Shop.jsp");
//			RequestDispatcher rd=request.getRequestDispatcher("Shop.jsp");
//			rd.forward(request,response);
		}
		else {
			session.setAttribute("msg","Error!!");
			response.sendRedirect("login.jsp");
			
		}
		
	}
}
