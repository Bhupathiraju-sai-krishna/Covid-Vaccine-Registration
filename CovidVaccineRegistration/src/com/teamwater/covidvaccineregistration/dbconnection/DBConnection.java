package com.teamwater.covidvaccineregistration.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

import com.teamwater.covidvaccineregistratiom.constants.Constants;

public class DBConnection {



	//creating method for driver loading
	public void loadDriver() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
    //creating method for getting connection
	public static Connection getConnection() {
		
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USR_NAME, Constants.DB_PWD);

		} catch (Exception e) {
			
			e.printStackTrace();
		}

		return connection;
	}


}
