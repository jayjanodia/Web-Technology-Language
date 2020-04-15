package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	public static boolean validate(String name,String pass){  
		boolean status=false;  
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost/pizza_user_database","jayjanodia","MYfriends1998");  
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from customer where email_add=? and passw=?");  
		ps.setString(1,name);  
		ps.setString(2,pass);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		}  
}
