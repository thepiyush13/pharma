package edu.isys.assign3.util;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	public Connection getConnectionToMercyWestEHR() {
		Connection con=null;
		//Loading JDBC Driver Class
		try{
			Class.forName("com.java.jdbc.driver");
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		//Connecting to Mercy's West Database
		try{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mercy_west_ehr","isys622","p@ssw0rd");
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return con;
	}
	
	public static Connection CreateConnection(){
		Connection con=null;
		try {
			Class.forName("com.java.jdbc.driver");	
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
		//Connect to the Ashley's Database}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mercy_west_ehr","isys622","p@ssw0rd");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public Connection getConnectionToPharmacy() {
		Connection con=null;
		//Loading JDBC Driver Class
		try{
			Class.forName("com.java.jdbc.driver");
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		//Connecting to Mercy's West Database
		try{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mercy_pharm","isys622","p@ssw0rd");
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return con;
	}
	
	public void CloseConnection(Connection con) throws SQLException{
		try{
			if(!con.isClosed()){
				con.close();
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
}
