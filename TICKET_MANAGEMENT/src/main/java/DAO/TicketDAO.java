package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Ticket;
import Model.UserData;

public class TicketDAO {
	
	static Connection con;
	static ResultSet rs;
	static PreparedStatement stmt;
	
	public static void connection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
	}
	
	public static int ticketnum() {
		try {
			connection();
			stmt=con.prepareStatement("SELECT MAX(ticketid) FROM TICKET");
			rs=stmt.executeQuery();
			rs.next();
			int oldid=rs.getInt(1);
			int id;
			if(oldid==0) {
				id=1000;
				return id;
			} else {
				id=oldid+1;
				int tid=id;
				return tid;
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static boolean raiseTicket(long tid, String priority, String subject, String desc, String doer, String reply, String userid, String sprvsrid, String dotc, String dotr, String ts) {
		try {
			connection();
			stmt = con.prepareStatement("insert into ticket (ticketid, priority, subject, description, doer, reply, userid, sprvsrid, dotc, dotr, ticketstatus) values(?,?,?,?,?,?,?,?,?,?,?)");
			stmt.setLong(1,tid);
			stmt.setString(2, priority);
			stmt.setString(3, subject);
			stmt.setString(4, desc);
			stmt.setString(5, doer);
			stmt.setString(6, reply);
			stmt.setString(7, userid);
			stmt.setString(8, sprvsrid);
			stmt.setString(9, dotc);
			stmt.setString(10, dotr);
			stmt.setString(11, ts);
			int xor = stmt.executeUpdate();
			if(xor>0) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static String todaydate() {
		try {
			connection();
			stmt = con.prepareStatement("select sysdate from dual");
			rs = stmt.executeQuery();
			rs.next();
			String date = rs.getString(1);
			return date;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static ArrayList<Ticket> getAllTickets(String tstatus){
		try {
			connection();
			if(tstatus==null) {
				stmt = con.prepareStatement("select * from ticket");

			} else {
				stmt = con.prepareStatement("select * from ticket where ticketstatus=?");
				stmt.setString(1, tstatus);
			}
			rs = stmt.executeQuery();
			ArrayList<Ticket> data = new ArrayList<Ticket>();
			while(rs.next()) {
				Ticket u = new Ticket(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
				data.add(u);
			}
			con.close();
			return data;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static ArrayList<UserData> getAllSupervisors(){
		try {
			connection();
			stmt = con.prepareStatement("select userid, username, expertise from userdata where utype = 'supervisor'");
			rs = stmt.executeQuery();
			ArrayList<UserData> arr = new ArrayList<UserData>();
			while(rs.next()) {
				UserData u = new UserData(rs.getString(1), rs.getString(2), rs.getString(3));
				arr.add(u);
				
			}
			con.close();
			return arr;
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static boolean allocateSup(String uid , String tid, String status) {
		try {
			connection();
			stmt = con.prepareStatement("update ticket set sprvsrid =?, ticketstatus = ? where ticketid = ?");
			stmt.setString(1, uid);
			stmt.setString(2, status);
			stmt.setString(3, tid);
			int xor = stmt.executeUpdate();
			if(xor>0) {
				return true;
			}
			else {
				return false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean attendTicket( String tid,String reply,String dotr, String status) {
		try {
			connection();
			stmt = con.prepareStatement("update ticket set reply =?,dotr = ?, ticketstatus = ? where ticketid = ?");
			stmt.setString(1, reply);
			stmt.setString(2, dotr);
			stmt.setString(3, status);
			stmt.setString(4, tid);
			int xor = stmt.executeUpdate();
			if(xor>0) {
				return true;
			}
			else {
				return false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static ArrayList<Ticket> getAllSupTickets(String uid){
		try {
			connection();
			
			stmt = con.prepareStatement("select * from ticket where sprvsrid =?");
			stmt.setString(1, uid);
			rs = stmt.executeQuery();
			ArrayList<Ticket> data = new ArrayList<Ticket>();
			while(rs.next()) {
				Ticket u = new Ticket(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
				data.add(u);
			}
			con.close();
			return data;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static ArrayList<Ticket> getAllSupsTickets(String uid, String status){
		try {
			connection();
			
			stmt = con.prepareStatement("select * from ticket where sprvsrid =? and ticketstatus =?");
			stmt.setString(1, uid);
			stmt.setString(2, status);
			rs = stmt.executeQuery();
			ArrayList<Ticket> data = new ArrayList<Ticket>();
			while(rs.next()) {
				Ticket u = new Ticket(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
				data.add(u);
			}
			con.close();
			return data;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static ArrayList<Ticket> getAllUsTickets(String uid){
		try {
			connection();
			
			stmt = con.prepareStatement("select * from ticket where userid =?");
			stmt.setString(1, uid);
			rs = stmt.executeQuery();
			ArrayList<Ticket> data = new ArrayList<Ticket>();
			while(rs.next()) {
				Ticket u = new Ticket(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
				data.add(u);
			}
			con.close();
			return data;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static ArrayList<Ticket> getAllUssTickets(String uid, String status){
		try {
			connection();
			
			stmt = con.prepareStatement("select * from ticket where userid =? and ticketstatus =?");
			stmt.setString(1, uid);
			stmt.setString(2, status);
			rs = stmt.executeQuery();
			ArrayList<Ticket> data = new ArrayList<Ticket>();
			while(rs.next()) {
				Ticket u = new Ticket(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
				data.add(u);
			}
			con.close();
			return data;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static int getTicketInfo1() {
	    int count = 0;
	    
	    try {
	        connection();
	        
	        stmt = con.prepareStatement("SELECT COUNT(*) FROM ticket");
	       
	        
	        rs = stmt.executeQuery();
	        
	        if (rs.next()) {
	            count = rs.getInt(1);
	        }
	        
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    return count;
	}
	public static int getTicketInfo2() {
	    int count = 0;
	    
	    try {
	        connection();
	        
	        stmt = con.prepareStatement("SELECT COUNT(*) FROM ticket WHERE ticketstatus = 'N'");
	       
	        
	        rs = stmt.executeQuery();
	        
	        if (rs.next()) {
	            count = rs.getInt(1);
	        }
	        
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    return count;
	}
	public static int getTicketInfo3() {
	    int count = 0;
	    
	    try {
	        connection();
	        
	        stmt = con.prepareStatement("SELECT COUNT(*) FROM ticket WHERE ticketstatus = 'pending'");
	       
	        
	        rs = stmt.executeQuery();
	        
	        if (rs.next()) {
	            count = rs.getInt(1);
	        }
	        
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    return count;
	}
	public static int getTicketInfo4() {
	    int count = 0;
	    
	    try {
	        connection();
	        
	        stmt = con.prepareStatement("SELECT COUNT(*) FROM ticket WHERE ticketstatus = 'closed'");
	       
	        
	        rs = stmt.executeQuery();
	        
	        if (rs.next()) {
	            count = rs.getInt(1);
	        }
	        
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    return count;
	}
	public static int getTicketInfo5() {
	    int count = 0;
	    
	    try {
	        connection();
	        
	        stmt = con.prepareStatement("SELECT COUNT(*) FROM ticket WHERE ticketstatus = 'Supervisor_Allocated'");
	       
	        
	        rs = stmt.executeQuery();
	        
	        if (rs.next()) {
	            count = rs.getInt(1);
	        }
	        
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    return count;
	}

	

}

