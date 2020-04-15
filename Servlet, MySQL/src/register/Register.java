package register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("Name");
		String phone = request.getParameter("Phone");
		String email = request.getParameter("email");
		String passw = request.getParameter("psw");
		
		String passw_repeat = request.getParameter("psw-repeat");
		String mailformat = "/^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/";
		int flag = -1;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pizza_user_database", "jayjanodia", "MYfriends1998");
			PreparedStatement ps = conn.prepareStatement("insert into customer(name, mob_no, email_add, passw)" + "values (?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, name);
			ps.setString(2, phone);
			ps.setString(3, email);
			ps.setString(4, passw);
			int i = ps.executeUpdate();
			if(i>0) {
				out.print("You are registered successfully...");
				RequestDispatcher rd = request.getRequestDispatcher("pizza_delivery.html");
				rd.include(request, response);
			}
			else {
				out.print("whoops, some error has occurred");
			}
		} catch (Exception e2) {
			System.out.println(e2);
		}
	}
}
