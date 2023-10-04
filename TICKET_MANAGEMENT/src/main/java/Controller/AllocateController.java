package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import DAO.TicketDAO;
import Model.UserData;


public class AllocateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<UserData> s = TicketDAO.getAllSupervisors();
		String tid = request.getParameter("allocate");
		String stid = request.getParameter("attend");
		System.out.println(tid);
		if(tid!=null) {
			request.setAttribute("data", s);
			request.setAttribute("tid", tid);
			RequestDispatcher rd = request.getRequestDispatcher("allocatesup.jsp");
			rd.forward(request, response);
		}
		else if(stid!=null) {
			request.setAttribute("data", s);
			request.setAttribute("tid", stid);
			RequestDispatcher rd = request.getRequestDispatcher("attendticket.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
