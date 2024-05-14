package feedbackentry;

public class feedback {

	private String ID;
	private String userID;
	private String name;
	private String msg;
	public feedback(String iD,String userID, String name, String msg) {
		
		this.ID = iD;
		this.userID = userID;
		this.name = name;
		this.msg = msg;
	}

	public feedback(String userID, String name, String msg) {
		this.userID = userID;
		this.name = name;
		this.msg = msg;
	}

	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
