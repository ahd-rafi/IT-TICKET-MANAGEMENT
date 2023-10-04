package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import DAO.UserDAO;

public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String uid = request.getParameter("uid").toUpperCase();
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		String cpwd = request.getParameter("cpwd");
		String dept = request.getParameter("dept");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String sq = request.getParameter("sq");
		String sa = request.getParameter("sa");
		String type = "";
		String status = "N";
		String expertise = "NA";
			if(!UserDAO.checkUser(uid)) {
				if(!UserDAO.checkEmail(email)) {
					if(uid.contains("USR")) {
						type = "user";
						if(pwd.equals(cpwd)) {
							if(UserDAO.addUser(uid, uname, pwd, dept, email, phone, sq, sa, type ,status,expertise)) {
								RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
								rd.include(request, response);
								out.println("<h2 style='text-align: center;color: red;'>Succesfully registered. Please login to continue...!</h2>");
							}
						}
						else {
							RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
							rd.include(request, response);
							out.println("<h2 style='text-align: center;color: red;'>Password doesn't match...!</h2>");
						}
					}
					
					else {
						RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
						rd.include(request, response);
						out.println("<h2 style='text-align: center;color: red;'>INVALID USER ID...!</h2>");
					}
				}
				else {
					RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
					rd.include(request, response);
					out.println("<h2 style='text-align: center;color: red;'>E-mail id already exists...!</h2>");
				}
				
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
				rd.include(request, response);
				out.println("<h2 style='text-align: center;color: red;'>User ID exists...!</h2>");
	 	}
		
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
