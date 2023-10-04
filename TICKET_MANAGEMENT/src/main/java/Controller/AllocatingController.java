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

public class AllocatingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String tid = request.getParameter("tid");
		String status = request.getParameter("allo");
		System.out.println(tid);
		String uid = request.getParameter("slct");
		if(TicketDAO.allocateSup(uid, tid, status)) {
			RequestDispatcher rd = request.getRequestDispatcher("ViewTicketController");
			rd.include(request, response);
			out.println("Successfully allocated supervisor..!");
		}
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

}
