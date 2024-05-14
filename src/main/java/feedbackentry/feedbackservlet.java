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
 * Servlet implementation class feedbackservlet
 */
@WebServlet("/feedbackservlet")
public class feedbackservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid =request.getParameter("userid");
		List<feedback> fblist = feedbackDBUtil.getfeedbackdetails(uid);
		 request.setAttribute("feedDetails", fblist);
		 
		 RequestDispatcher d1 = request.getRequestDispatcher("feedbackreview.jsp");
		 d1.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String uid =request.getParameter("userid");
		 String name = request.getParameter("username");
		 String comment = request.getParameter("comment");
		 
		 boolean correct;
		 correct = feedbackDBUtil.insertfeedback(uid,name,comment);
		 
		 if(correct == true) {
			 
			 List<feedback> fblist = feedbackDBUtil.getfeedbackdetails(uid);
			 request.setAttribute("feedDetails", fblist);
			 
			 RequestDispatcher d1 = request.getRequestDispatcher("feedbackreview.jsp");
			 d1.forward(request, response);
			 
		 }
		 else {
			 RequestDispatcher d2 = request.getRequestDispatcher("unsuccess.jsp");
			 d2.forward(request, response);
		 }
		 
	}

}
