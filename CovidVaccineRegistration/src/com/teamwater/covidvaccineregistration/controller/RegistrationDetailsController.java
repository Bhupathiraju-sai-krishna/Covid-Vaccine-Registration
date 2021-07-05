package com.teamwater.covidvaccineregistration.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teamwater.covidvaccineregistration.dbconnection.DBConnection;

public class RegistrationDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegistrationDetailsController() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Statement stmt=null;
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
			
	    //declaring the variables
		String registeredName         = request.getParameter("name");
		String registeredPhoneNumber  = request.getParameter("phonenumber");
		String registeredPassword     = request.getParameter("password");
		String registeredAadharnumber = request.getParameter("aadharnumber");
		String registeredAge          = request.getParameter("age");
		String registeredVaccine      = request.getParameter("vaccine");
		String registeredDate         = request.getParameter("date");
		String registeredTimeslot     = request.getParameter("timeslot");
		
	    try {
	    	//creating object for DBconnection
			DBConnection dbconnection = new DBConnection();
			
		   // load the driver
			dbconnection.loadDriver();
			
			//establishing the connection
			Connection connection = DBConnection.getConnection();
	    	
			//create a statement 
			stmt=connection.createStatement();
			
			//sql query to insert data into database table
		    stmt.executeUpdate("insert into vaccine_registration_details(Name,Phone_number,Password,Aadhar_number,Age,Vaccine_type,Date,Time_slot)values"
					+ "('"+registeredName+"','"+registeredPhoneNumber+"','"+registeredPassword+"','"+registeredAadharnumber+"','"
		    		+registeredAge+"','"+registeredVaccine+"',"+ " '"+registeredDate+"','"+registeredTimeslot+"')");
		    
		    //Display success message after data entered successfully
		    //RequestDispatcher dispatcher = request.getRequestDispatcher("registrationForm.jsp");
		    //dispatcher.include(request, response);
			writer.println("<center>");
		    writer.println("<font color=Brown> Your Vaccine Registration is Successfull<br> ");
		    writer.println("Your vaccination is on "+registeredDate+" Time "+registeredTimeslot+"<br>");
		    writer.println("Please Visit Your Nearest Vaccination Centre<br></font>");
		    
		    //closing statement
		    stmt.close();
		    //closing connection
		    connection.close();
	    } 
	    catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
