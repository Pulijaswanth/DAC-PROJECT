package com.Go.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.Go.Dao.RegDao;
import com.Go.pojo.Reg;

@WebServlet("/addUser") 
public class Adduser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("reguser.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Firstname=request.getParameter("Firstname");
		String Lastname=request.getParameter("Lastname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String area=request.getParameter("area");
		String landmark=request.getParameter("landmark");
		String pincode=request.getParameter("pincode");
		String password=request.getParameter("password");
		Reg use=new Reg(Firstname,Lastname,email,mobile,area,landmark,pincode,password);
		RegDao dao=new RegDao();
		HttpSession session=request.getSession();
		if(dao.addUser(use)) {
			session.setAttribute("msg","User added");
		}
		else {
			session.setAttribute("msg","Error!!");
		}
		response.sendRedirect("reguser.jsp");
	}

}
