package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

import DAO.TicketDAO;
import Model.Ticket;


public class SupervisorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String uid = (String)session.getAttribute("uid");
		String tstatus =request.getParameter("ticketstatus");
//		String uid1 = request.getParameter("sprvsrid");
		if(tstatus==null) {
			ArrayList<Ticket> s = TicketDAO.getAllSupTickets(uid);
			request.setAttribute("uid", uid);
			request.setAttribute("data", s);
			RequestDispatcher rd = request.getRequestDispatcher("supervisor.jsp");
			rd.forward(request, response);
		}
		else {
			if(tstatus.equals("Q")) {
				ArrayList<Ticket> s = TicketDAO.getAllSupTickets(uid);
				request.setAttribute("uid", uid);
				request.setAttribute("data", s);
				RequestDispatcher rd = request.getRequestDispatcher("supervisor.jsp");
				rd.forward(request, response);	
			}
			else if(tstatus.equals("N")) {
				ArrayList<Ticket> s = TicketDAO.getAllSupsTickets(uid,tstatus);
				request.setAttribute("uid", uid);
				request.setAttribute("data", s);
				RequestDispatcher rd = request.getRequestDispatcher("supervisor.jsp");
				rd.forward(request, response);	
			}
			else if(tstatus.equals("pending")) {
				ArrayList<Ticket> s = TicketDAO.getAllSupsTickets(uid,tstatus);
				request.setAttribute("uid", uid);
				request.setAttribute("data", s);
				RequestDispatcher rd = request.getRequestDispatcher("supervisor.jsp");
				rd.forward(request, response);	
			}
			else if(tstatus.equals("closed")) {
				ArrayList<Ticket> s = TicketDAO.getAllSupsTickets(uid,tstatus);
				request.setAttribute("uid", uid);
				request.setAttribute("data", s);
				RequestDispatcher rd = request.getRequestDispatcher("supervisor.jsp");
				rd.forward(request, response);	
			}
		}

		
		
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

}
