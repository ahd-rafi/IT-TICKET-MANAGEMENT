package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import DAO.UserDAO;


public class AdminAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("edit")!=null) {
			String uid=request.getParameter("edit");
			System.out.println("Admin action: Edit "+uid);
			request.setAttribute("edit", uid);
			RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
			rd.forward(request, response);
		}
		else if(request.getParameter("delete")!=null){
			String uid=request.getParameter("delete");
			System.out.println("Admin action: Delete "+uid);
			UserDAO dao=new UserDAO();
			int Success=dao.deleteAccount(uid);
			if(Success>0) {
				request.setAttribute("msg", "Successfully Deleted");
				RequestDispatcher rd=request.getRequestDispatcher("ViewUserController");
				rd.forward(request, response);
			} else {
				request.setAttribute("msg", "Failed Deletion");
				RequestDispatcher rd=request.getRequestDispatcher("ViewUserController");
				rd.forward(request, response);
			}
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
