package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


import DAO.UserDAO;
import Model.UserData;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String uid = request.getParameter("uid").toUpperCase();
		String pwd = request.getParameter("pwd");
		UserData u = UserDAO.login(uid);
		if(UserDAO.checkUser(uid)) {
			if(u!=null) {
				String uid1=u.getUserid();
				String uname = u.getUsername();
				String pwd1=u.getPassword();
				String type=u.getUtype();
						if(uid.equals(uid1) && pwd.equals(pwd1)&& type.equals("admin")) {
							session.setAttribute("uid", uid);
							RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
							rd.include(request, response);
							out.println("<h2 style='text-align: center;color: red;'>Welcome "+uname+"</h2>");
						}
						else if(uid.equals(uid1) && pwd.equals(pwd1)&& type.equals("supervisor")) {
							session.setAttribute("uid", uid);
							RequestDispatcher rd = request.getRequestDispatcher("SupervisorController");
							rd.include(request, response);
							out.println("<h2 style='text-align: center;color: red;'>Welcome "+uname+"</h2>");
						}
						else if(uid.equals(uid1) && pwd.equals(pwd1)&& type.equals("user")) {
							session.setAttribute("uid", uid);
							session.setAttribute("uname", uname);
							RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
							rd.forward(request, response);
						}
						else {	
							RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
							rd.include(request, response);
							out.println("<h2 style='text-align: center;color: red;'>Invalid userid or password...!</h2>");
						}
			}
				
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
			out.println("<h2 style='text-align: center;color: red;'>User doesnt exist..Please register!</h2>");
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

}
