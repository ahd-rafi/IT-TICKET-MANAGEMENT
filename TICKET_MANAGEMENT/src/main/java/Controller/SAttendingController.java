package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import DAO.TicketDAO;


public class SAttendingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String tid = request.getParameter("tid");
		String reply = request.getParameter("reply");
		String tstatus = request.getParameter("slt");
		String dotr2 = "NA";
		if(tstatus.equals("closed")) {
			String dotr = TicketDAO.todaydate();
			if(TicketDAO.attendTicket(tid, reply, dotr, tstatus)) {
				RequestDispatcher rd=request.getRequestDispatcher("SupervisorController"); 
		 	    rd.include(request, response);
		 	    out.println("Ticket attended");
			}
		}
		else {
			if(TicketDAO.attendTicket(tid, reply, dotr2, tstatus)) {
				RequestDispatcher rd=request.getRequestDispatcher("SupervisorController"); 
		 	    rd.include(request, response);
		 	    out.println("Ticket attended");
			}
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}

