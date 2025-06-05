package com.techxyte;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@WebServlet("/RegisterForm")
public class RegistrationFormServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		//String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		
		
		try {
			Connection con = ConnectionDb.connection();
			String query = "INSERT INTO employee(firstname,lastname,username,password,address) VALUES(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,firstName);
			ps.setString(2,lastName);
			ps.setString(3,userName);
			ps.setString(4,passWord);
			//ps.setString(5,contact);
			ps.setString(5,address);
			
			int rowAffect = ps.executeUpdate();
			
			if(rowAffect > 0) {
				out.println("<h1 style='color:green;'>Registration 2.O Successful</h1>");
			}else {
				out.println("<h1 style='color:red;'>Registration 2.O UnSuccessful</h1>");
			}
		}catch(SQLException e) {
			out.println("<h1 style='color:red;'>Database Error:"+e.getMessage()+"</h1>");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
