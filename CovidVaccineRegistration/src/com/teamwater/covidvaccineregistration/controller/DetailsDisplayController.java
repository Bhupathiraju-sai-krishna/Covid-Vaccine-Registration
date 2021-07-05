package com.teamwater.covidvaccineregistration.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teamwater.covidvaccineregistration.dbconnection.DBConnection;


public class DetailsDisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DetailsDisplayController() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		boolean status = true;

		PreparedStatement pstmt = null;
		ResultSet result = null;

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
       //declaring the variables
		String registeredPhonenumber = request.getParameter("phonenumber");
		String registeredPassword  = request.getParameter("password");
		
		try {
			
            //creating object for DBconnection
			DBConnection dbconnection = new DBConnection();
			
		   // load the driver
			dbconnection.loadDriver();
			
			//establishing the connection
			Connection connection = DBConnection.getConnection();
			
			//creating the statement
			pstmt = connection.prepareStatement("select * from  vaccine_registration_details where Phone_number = ? and Password = ?");
			
			//passing parameters
			pstmt.setString(1, registeredPhonenumber); 
			pstmt.setString(2, registeredPassword);
			
			// executing the query
			result = pstmt.executeQuery(); 

			writer.println("<center>");
			status = result.next();

			if (status == true) {

				writer.println("<h2>Covid Vaccination Details</h2>");
				
				//printing column names
				writer.println(
						"<table border ='1'>"
						+ "<tr>"
						+ "<td>Name</td>"
						+ "<td>Aadhar_number</td>"
						+ "<td>Age</td>"
						+ "<td>Vaccine_type</td>"
						+ "<td>Date</td>"
						+ "<td>Time_slot</td>");
				
				//printing data of corresponding column names
				writer.println
				("<tr>"
						+ "<td>" + result.getString(1) + "</td>"
						+ "<td>" + result.getLong(4) + "</td>"
						+ "<td>" + result.getInt(5) +"</td>"
						+ "<td>" + result.getString(6) +"</td>"
						+ "<td>" + result.getString(7) +"</td>"
						+ "<td>" + result.getString(8) +"</td>"

				+ "</tr></table>");
             
			} 
			//for invalid credentials
			else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
				dispatcher.include(request, response);
				writer.println("<font color=red>Invalid details, Please enter valid details</font><br>");
				writer.println("<font color=red>Incase of new user register above</font>");
			}  
			//closing statement
			pstmt.close();
			//closing connection
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
 