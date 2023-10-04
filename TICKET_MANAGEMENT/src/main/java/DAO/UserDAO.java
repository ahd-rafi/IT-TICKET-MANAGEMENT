package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.UserData;

public class UserDAO {
	static Connection con;
	static ResultSet rs;
	static PreparedStatement stmt;
	
	public static void connection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
	}
	
	public static boolean checkUser(String uid) {
		try {
			connection();
			stmt = con.prepareStatement("select count(*) from userdata where userid = ?");
			stmt.setString(1, uid);
			rs = stmt.executeQuery();
			while(rs.next()) {
				int xor = rs.getInt(1);
				if(xor>0) {
					return true;
				}
				else {
					return false;
				}
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean checkEmail(String mail) {
		try {
			connection();
			stmt = con.prepareStatement("select count(*) from userdata where email = ?");
			stmt.setString(1, mail);
			rs = stmt.executeQuery();
			while(rs.next()) {
				int xor = rs.getInt(1);
				if(xor>0) {
					return true;
				}
				else {
					return false;
				}
			}
			con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean addUser(String uid,String uname, String pass,String dept, String email,String phone,String sq,String sa,String utype, String status,String exp) {
		try {
			connection();
			stmt = con.prepareStatement("insert into userdata(userid,username,password,department,email,phone,squestion,sanswer,utype,status,expertise) values(?,?,?,?,?,?,?,?,?,?,?)");
			stmt.setString(1,uid);
			stmt.setString(2,uname);
			stmt.setString(3,pass);
			stmt.setString(4, dept);
			stmt.setString(5,email);
			stmt.setString(6, phone);
			stmt.setString(7, sq);
			stmt.setString(8, sa);
			stmt.setString(9, utype);
			stmt.setString(10,status);
			stmt.setString(11, exp);
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
	
	public static UserData login(String uid) {
		try {
			connection();
			stmt = con.prepareStatement("select userid,username,password, utype from userdata where userid = ?");
			stmt.setString(1, uid);
			rs = stmt.executeQuery();
			rs.next();
			UserData u = new UserData(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			con.close();
			return u;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static UserData forgotPassword(String email){
		try {
			connection();
			stmt=con.prepareStatement("select userid,password,email,squestion,sanswer from userdata where email=?");
			stmt.setString(1, email);
			rs = stmt.executeQuery();
			rs.next();
			UserData u = new UserData(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			con.close();
			return u;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static ArrayList<UserData> getAllData(String status){
		try {
			connection();
			if(status==null) {
				stmt = con.prepareStatement("select userid, username, department, email, utype, status, expertise from userdata where utype='supervisor'");

			}
			else if(status == "") {
				stmt = con.prepareStatement("select userid, username, department, email, utype, status, expertise from userdata");
			}
			else {
				stmt = con.prepareStatement("select userid, username, department, email, utype, status, expertise from userdata where status=?");
				stmt.setString(1, status);
			}
			rs = stmt.executeQuery();
			ArrayList<UserData> data = new ArrayList<UserData>();
			while(rs.next()) {
				UserData u = new UserData(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
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
	
	public static boolean update(String utype, String uid,String exp, String val) {
		try {
			connection();
			stmt = con.prepareStatement("update userdata set utype = ? ,expertise = ?,status = ?  where userid = ?");
			stmt.setString(1, utype);
			stmt.setString(4, uid);
			stmt.setString(2, exp);
			stmt.setString(3, val);
			int xor =stmt.executeUpdate();
			con.close();
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
	
	public static int deleteAccount(String uid) {
		try {
			connection();
			stmt = con.prepareStatement("delete from userdata where userid = ?");
			stmt.setString(1, uid);
			int status=stmt.executeUpdate();
			return status;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static String getStatus(String uid) {
		try {
			connection();
			stmt = con.prepareStatement("select status from userdata where userid = ? ");
			stmt.setString(1, uid);
			rs = stmt.executeQuery();
			while(rs.next()) {
				String status = rs.getString(1);
				return status;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static ArrayList<UserData> getUserData(String uid){
		try {
			connection();
			stmt = con.prepareStatement("select userid, username, email, phone, utype, status from userdata where userid=?");
			stmt.setString(1, uid);
		
			rs = stmt.executeQuery();
			ArrayList<UserData> data = new ArrayList<UserData>();
			while(rs.next()) {
				UserData u = new UserData(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
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
	
}
