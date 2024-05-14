package feedbackentry;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

	private static String db = "jdbc:mysql://localhost:3306/bidding nest";
	private static String user ="root";
	private static String pw ="Nihinsa1234"; 
	private static Connection con;
	
    private DBconnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(db, user, pw);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection Unsuccessful");
        }
    }

    public static Connection getconnection() {
        if (con == null) {
            synchronized (DBconnect.class) {
                if (con == null) {
                    new DBconnect();
                }
            }
        }
        return con;
    }

    // Additional methods to work with the connection
}