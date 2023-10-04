package Model;

public class UserData {
	private String userid;
	private String username;
	private String password;
	private String department;
	private String email;
	private String phone;
	private String squestion;
	private String sanswer;
	private String utype;
	private String status;
	private String expertise;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSquestion() {
		return squestion;
	}
	public void setSquestion(String squestion) {
		this.squestion = squestion;
	}
	public String getSanswer() {
		return sanswer;
	}
	public void setSanswer(String sanswer) {
		this.sanswer = sanswer;
	}
	public String getUtype() {
		return utype;
	}
	public void setUtype(String utype) {
		this.utype = utype;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	public UserData() {
		super();
	}
	public UserData(String userid, String username, String password, String department, String email, String phone,
			String squestion, String sanswer, String utype, String status, String expertise) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.department = department;
		this.email = email;
		this.phone = phone;
		this.squestion = squestion;
		this.sanswer = sanswer;
		this.utype = utype;
		this.status = status;
		this.expertise = expertise;
	}
	public UserData(String userid,String username, String password, String utype) {
		super();
		this.userid = userid;
		this.username=username;
		this.password = password;
		this.utype = utype;
	}
	public UserData(String userid, String password, String email, String squestion, String sanswer) {
		super();
		this.userid = userid;
		this.password = password;
		this.email = email;
		this.squestion = squestion;
		this.sanswer = sanswer;
	}
	public UserData(String userid, String username, String department, String email, String utype, String status,
			String expertise) {
		super();
		this.userid = userid;
		this.username = username;
		this.department = department;
		this.email = email;
		this.utype = utype;
		this.status = status;
		this.expertise = expertise;
	}
	public UserData(String userid, String username, String expertise) {
		super();
		this.userid = userid;
		this.username = username;
		this.expertise = expertise;
	}
	public UserData(String userid, String username, String email, String phone, String utype, String status) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.utype = utype;
		this.status = status;
	}
	
	

}
