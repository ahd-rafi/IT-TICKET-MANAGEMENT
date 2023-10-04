package Model;

public class Ticket {
	private long ticketid;
	private String priority;
	private String subject;
	private String description;
	private String doer;
	private String reply;
	private String userid;
	private String sprvsrid;
	private String dotc;
	private String dotr;
	private String ticketstatus;
	public long getTicketid() {
		return ticketid;
	}
	public void setTicketid(long ticketid) {
		this.ticketid = ticketid;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDoer() {
		return doer;
	}
	public void setDoer(String doer) {
		this.doer = doer;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getSprvsrid() {
		return sprvsrid;
	}
	public void setSprvsrid(String sprvsrid) {
		this.sprvsrid = sprvsrid;
	}
	public String getDotc() {
		return dotc;
	}
	public void setDotc(String dotc) {
		this.dotc = dotc;
	}
	public String getDotr() {
		return dotr;
	}
	public void setDotr(String dotr) {
		this.dotr = dotr;
	}
	public String getTicketstatus() {
		return ticketstatus;
	}
	public void setTicketstatus(String ticketstatus) {
		this.ticketstatus = ticketstatus;
	}
	public Ticket() {
		super();
	}
	public Ticket(long ticketid, String priority, String subject, String description, String doer, String reply,
			String userid, String sprvsrid, String dotc, String dotr, String ticketstatus) {
		super();
		this.ticketid = ticketid;
		this.priority = priority;
		this.subject = subject;
		this.description = description;
		this.doer = doer;
		this.reply = reply;
		this.userid = userid;
		this.sprvsrid = sprvsrid;
		this.dotc = dotc;
		this.dotr = dotr;
		this.ticketstatus = ticketstatus;
	}
	public Ticket(long long1) {
		// TODO Auto-generated constructor stub
	}
	
	

}
