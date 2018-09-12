package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.User;

public class JDBCHelper {
	
	Connection con;
	
	Statement stmt;
	PreparedStatement pStmt;
	CallableStatement cStmt;
	
	public JDBCHelper() {
		try {
			//1. Load the Driver !!
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(">>Driver Loaded");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void createConnection(){
		try {
			//2. Create Connection with DB !!
			String user = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/edureka"; // LastPathSegment is DB Name i.e. edureka in our case
			
			con = DriverManager.getConnection(url, user, password);
			
			System.out.println(">>Connection Created");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public int registerUser(User user){
		
		int i = 0;
		
		try {
						            // indexing starts from 1  2  3  4
			String sql = "insert into User values(null, ?, ?, ?)"; // ? is a wild card
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.name);
			pStmt.setString(2, user.email);
			pStmt.setString(3, user.password);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return i;
	}
	
	public boolean loginUser(User user){
		
		boolean flag = true;
		
		try {
						            // indexing starts from 1  2  3  4
			String sql = "select * from User where email = ? and password = ?"; // ? is a wild card
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.email);
			pStmt.setString(2, user.password);
			
			ResultSet rs = pStmt.executeQuery();
			
			flag = rs.next(); // if record is retrieved -> rs.next() will return true else false
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return flag;
	}
	
	
	
	public void closeConnection(){
		try {
			con.close();
			System.out.println(">>Connection Closed");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
}

