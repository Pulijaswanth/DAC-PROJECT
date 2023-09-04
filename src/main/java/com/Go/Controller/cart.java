package com.Go.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.Go.Dao.CartDao;
import com.Go.pojo.Cart;
import com.Go.pojo.Reg;
@WebServlet("/cart")
public class cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("Shop.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		String size=request.getParameter("size");
		Cart c=new Cart(1, name,price,size);
		CartDao cdao=new CartDao();
		HttpSession session=request.getSession();
		if(cdao.cart(c)) {
			session.setAttribute("msg","one product added");
		}
		else {
			session.setAttribute("msg","Error!!");
		}
		
	}

}
