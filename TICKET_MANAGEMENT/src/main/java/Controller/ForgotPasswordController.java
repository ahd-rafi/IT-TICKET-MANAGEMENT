package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import DAO.UserDAO;
import Model.UserData;


public class ForgotPasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String sq = request.getParameter("sq");
		String sa = request.getParameter("sa");
		if(UserDAO.checkEmail(email)){
			UserData u = UserDAO.forgotPassword(email);
			if(u!=null) {
				String sq1 = u.getSquestion();
				String sa1 = u.getSanswer();
				String uid = u.getUserid();
				String pwd = u.getPassword();
				if(sq.equals(sq1)&&sa.equals(sa1)) {
					request.setAttribute("msg","USER ID - "+uid);
					request.setAttribute("msg1","PASSWORD - "+pwd);
					RequestDispatcher rd = request.getRequestDispatcher("solution.jsp");
					rd.include(request, response);
					
					}
				else {
					RequestDispatcher rd = request.getRequestDispatcher("forgotpassword.jsp");
					rd.include(request, response);
					out.println("<h2 style='text-align: center;color: red;'>Incorrect Combination...!</h2>");
				}
			}
		}
			
		else {
			RequestDispatcher rd = request.getRequestDispatcher("forgotpassword.jsp");
			rd.include(request, response);
			out.println("<h2 style='text-align: center;color: red;'>email is not registered...!</h2>");
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
