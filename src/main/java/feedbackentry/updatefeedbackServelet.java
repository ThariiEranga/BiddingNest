package feedbackentry;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updatefeedbackServelet
 */
@WebServlet("/updatefeedbackServelet")
public class updatefeedbackServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String fid =request.getParameter("fid");
		String uid =request.getParameter("uid");
		String name = request.getParameter("uname");
		String comment = request.getParameter("cnt");
		System.out.println(fid);
		boolean istrue ;
		istrue = feedbackDBUtil.updatefeedback(fid,uid, name, comment);
		System.out.println("##########################################################");
		
		 
		
		// ##########################################
		//if(istrue == true) {
			
			List<feedback> fblist = feedbackDBUtil.getfeedbackdetails(uid);
			 request.setAttribute("feedDetails", fblist);
			 
			RequestDispatcher d1 = request.getRequestDispatcher("updatedFeedback.jsp");
			 d1.forward(request, response);
//		}
//		else {
//			
//			RequestDispatcher d2 = request.getRequestDispatcher("unsuccess.jsp");
//			 d2.forward(request, response);
//		}
		
	}

}
