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

public class ReportController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int total_tickets = TicketDAO.getTicketInfo1();
		int new_tickets = TicketDAO.getTicketInfo2();
		int pending_tickets = TicketDAO.getTicketInfo3();
		int closed_tickets = TicketDAO.getTicketInfo4();
		int S_tickets = TicketDAO.getTicketInfo5();
		
		request.setAttribute("data1", total_tickets);
		request.setAttribute("data2", new_tickets);
		request.setAttribute("data3", pending_tickets);
		request.setAttribute("data4", closed_tickets);
		request.setAttribute("data5", S_tickets);
		RequestDispatcher rd = request.getRequestDispatcher("report.jsp");
		rd.include(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

}
