package com.bridgelabz;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class MailSendServlet
 */
@SuppressWarnings("serial")
@WebServlet("/MailSendServlet")
public class MailSendServlet extends HttpServlet {
    static Mailer mailer = new Mailer();
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
   	{
   		String Email = request.getParameter("emailid");
   		//String submitType = request.getParameter("submit");
   		System.out.println(Email);
   	
   			
   		//	request.setAttribute("Successmessage", "Registration done please continue with login");
   		boolean check = checkEmail(Email);
   		if(check == true)
   		{
   			System.out.println("Email verified");
   		}
   		else
   		{
   			System.out.println("not verified");
   		}
   			request.getRequestDispatcher("ReadyToReset.jsp").forward(request, response);
   			System.out.println("reg successfully");
   		
   	}
   	
   	public static boolean checkEmail(String email) {
   		Connection conn = null;
   		PreparedStatement ps = null;
   		ResultSet rs = null;
   		try {
   			conn = MyConnectionProvider.getCon();
   			ps = conn.prepareStatement("select * from SignUpDetails  where emailId=?");
   			ps.setString(1, email);
   			rs = ps.executeQuery();
   			if(rs.next()) {
   				return true;
   			}
   		}catch(Exception e) {
   			e.printStackTrace();
   		}finally {
   			try {
   				 Mailer.send("kvd963kalyani@gmail.com","kalyani123",email,"Reset link","http://localhost:8080/WebAppWeek4/ResetP.jsp");
   				rs.close();
   				ps.close();
   				conn.close();
   			}catch(SQLException e){
   				e.printStackTrace();
   			}
   		}
   		return false;
   	}
   	
   	
   }

