package feedbackentry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class feedbackDBUtil {
	
	private static boolean success;
	private static Connection con = null;
	private static Statement state = null;
	private static ResultSet result = null;
	
	
	public static boolean insertfeedback(String i,String n,String c) {
		
		 success = false;
		
		try {
			
			con =DBconnect.getconnection();
			state=con.createStatement();
			String sql = "insert into feedback values (0,'"+i+"','"+n+"','"+c+"')";
			int result = state.executeUpdate(sql);
			
			if(result>0) {
				success = true;
			}else {
				
				success = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return success;
	}
	
	public static List<feedback> getfeedbackdetails(String ID) {
	    ArrayList<feedback> feed = new ArrayList<>();
	    
	    // Check if the ID is not empty and is a valid integer
	    if (ID != null && !ID.isEmpty()) {
	        try {
	            int convertID = Integer.parseInt(ID);
	            
	            con = DBconnect.getconnection();
	            state = con.createStatement();
	            String sql = "SELECT * FROM feedback WHERE userid = '" + convertID + "'";
	            result = state.executeQuery(sql);

	            while (result.next()) {
	            	String fid = result.getString(1);
	                String uid = result.getString(2);
	                String uname = result.getString(3);
	                String msg = result.getString(4);

	                feedback f = new feedback(fid, uid, uname, msg);

	                feed.add(f);
	            }
	        } catch (NumberFormatException e) {
	            e.printStackTrace(); // Handle the invalid ID input, e.g., log an error or return an error response.
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    return feed;
	}

	
	
	public static boolean updatefeedback(String fid,String uid,String name,String msg) {
		
	
		try {
			
			con = DBconnect.getconnection();
            state = con.createStatement();
            String sql = "UPDATE feedback set userid = '"+uid+"', username = '"+name+"', Feedbackmsg ='"+msg+"' WHERE Feedbackid ='"+fid+"'";
            int result = state.executeUpdate(sql);
            
            if(result>0) {
            	
            	success = true;
            }
            else {
            	success = false;
            }
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
			 return success;
		
	}
	
	public static boolean deletefeedback(int id) {
		
		boolean success = false;
		
		try {
			
			con = DBconnect.getconnection();
            state = con.createStatement();
            String sql = "DELETE FROM feedback WHERE Feedbackid ='"+id+"'";
            int result = state.executeUpdate(sql);
            if(result>0) {
            	
            	success = true;
            }
            else {
            	success = false;
            }
		}
		catch(NumberFormatException e) {
            e.printStackTrace(); // Handle the invalid ID input, e.g., log an error or return an error response.
        }
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return success;
	}

	public static List<feedback> validate(String id, String name) {
	    ArrayList<feedback> feed = new ArrayList<>();
	    
	    // Check if the ID is not empty and is a valid integer
	        try {	            
	            con = DBconnect.getconnection();
	            state = con.createStatement();
	            String sql = "select * from feedback where username = '" + name + "' and userid = '"+id+"' ";
	            result = state.executeQuery(sql);

	            while (result.next()) {
	            	String fid = result.getString(1);
	                String uid = result.getString(2);
	                String uname = result.getString(3);
	                String msg = result.getString(4);

	                feedback f = new feedback(fid, uid, uname, msg);

	                feed.add(f);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    
	    
	    return feed;
	}
	

}
