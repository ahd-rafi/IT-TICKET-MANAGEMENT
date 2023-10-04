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
import Model.Ticket;

public class ViewTicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tstatus = request.getParameter("ticketstatus");
		ArrayList<Ticket> s = TicketDAO.getAllTickets(tstatus);
		request.setAttribute("data", s);
		RequestDispatcher rd = request.getRequestDispatcher("viewticket.jsp");
		rd.forward(request, response);
	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

}
