package feedbackentry;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteFeedback
 */

public class DeleteFeedback extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in servlet");
		int fedID = Integer.parseInt(request.getParameter("fid"));
		
		feedbackDBUtil.deletefeedback(fedID);
		
		response.sendRedirect("Feedback.jsp");
	}

}
