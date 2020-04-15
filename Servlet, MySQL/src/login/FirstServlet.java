package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		String passw = request.getParameter("psw");
		if(LoginDao.validate(name, passw)) {
			RequestDispatcher rd = request.getRequestDispatcher("servlet2");
			rd.forward(request, response);
		}
		else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Invalid username, please try again');");
			out.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("pizza_delivery.html");
			rd.include(request, response);
		}
		out.close();
	}
}
