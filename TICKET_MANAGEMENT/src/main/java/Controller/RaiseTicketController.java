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
import DAO.UserDAO;

public class RaiseTicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int ticketid = TicketDAO.ticketnum();
		String priority = request.getParameter("priority");
		String subject = request.getParameter("sub");
		String description = request.getParameter("desc");
		String doer = request.getParameter("date");
		String reply = "NA";
		String uid = (String) request.getParameter("uid");
		String sprvsrid = "NA";
		String dotc = TicketDAO.todaydate();
		String dotr = "NA";
		String status = UserDAO.getStatus(uid);
		String tstatus = "N";
		if(status.equals("V")) {
			if(TicketDAO.raiseTicket(ticketid, priority, subject, description, doer, reply, uid, sprvsrid, dotc, dotr, tstatus)) {
				RequestDispatcher rd=request.getRequestDispatcher("raiseticket.jsp");
				rd.include(request, response);
				out.println("<h2 style='text-align: center;color: red;'>Successfully ticket raised!</h2> ");
			}
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("raiseticket.jsp");
			rd.include(request, response);
			out.println("<h2 style='text-align: center;color: red;'>Please wait until the admin verifies you</h2>");
		}
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
