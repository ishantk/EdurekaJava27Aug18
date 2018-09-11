package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.Employee;

/*
 JDBC Procdure:
	1. Load the Driver
		1.1 Download Type4 Driver from DB Vendor Website which is a .jar file
		    .jar file is a zipped file which contains lot of .class files
		1.2 Link .jar file with your project in Eclipse
		1.3 Use Class.forname API to load the Driver

	2. Create the Connection with DB
		2.1 Username and password : root | ""
		2.2 URL : jdbc:mysql://localhost/dbname	| Diff for diff db's
		2.3 Use Connection and DriverManager APIs

	3. Write SQL Statement
		String sql  = "insert into Employee values(null,.......)";	

	4. Execute SQL Statement
		Use Statement or PreparedStatement API

	5. Close the Connection
		Use method close() to close the connection for releasing memory resources
*/

// DAO - Data Access Object
// JDBCHelper Object will be used to access database
// We are coding in OOPS !!

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
	
	public void saveEmployee(Employee emp){
		try {
			
			//3. Create SQL Statement
			//String sql = "insert into Employee values(null,'George',6,54500,'Redwood Shores')";
			
			//String sql = "insert into Employee values(null,'"+emp.name+"',"+emp.exp+","+emp.salary+",'"+emp.address+"')";
			
			//4. Execute SQL Statement
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql);
			
						            // indexing starts from 1  2  3  4
			String sql = "insert into Employee values(null, ?, ?, ?, ?)"; // ? is a wild card
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, emp.name);
			pStmt.setInt(2, emp.exp);
			pStmt.setInt(3, emp.salary);
			pStmt.setString(4, emp.address);
			
			int i = pStmt.executeUpdate();
			
			//System.out.println("PreparedStatemnt: "+pStmt.toString());
			
			if(i>0){
				System.out.println(">>"+emp.name+" Saved "+i);
			}else{
				System.out.println(">>Record Not Saved "+i);
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void updateEmployee(Employee emp){
		try {
			
			String sql = "update Employee set name = ?, exp = ?, salary = ?, address = ? where eid = ?"; // ? is a wild card
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, emp.name);
			pStmt.setInt(2, emp.exp);
			pStmt.setInt(3, emp.salary);
			pStmt.setString(4, emp.address);
			pStmt.setInt(5, emp.eid);
			
			int i = pStmt.executeUpdate();
			
			//System.out.println("PreparedStatemnt: "+pStmt.toString());
			
			if(i>0){
				System.out.println(">>"+emp.name+" Updated "+i);
			}else{
				System.out.println(">>Record Not Updated "+i);
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void deleteEmployee(int eid){
		try {
			
			String sql = "delete from Employee where eid = ?"; // ? is a wild card
			
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, eid);
			
			int i = pStmt.executeUpdate();
			
			//System.out.println("PreparedStatemnt: "+pStmt.toString());
			
			if(i>0){
				System.out.println(">>"+eid+" Deleted "+i);
			}else{
				System.out.println(">>Record Not Deleted "+i);
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public ArrayList<Employee> getEmployees(){
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		try {
			
			String sql = "select * from Employee";		
			//String sql = "select * from Employee where salary > ?";
			pStmt = con.prepareStatement(sql);
			
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				
				Employee emp = new Employee();
				emp.eid = rs.getInt(1);
				emp.name = rs.getString(2);
				emp.exp = rs.getInt(3);
				emp.salary = rs.getInt(4);
				emp.address = rs.getString(5);
				
				//System.out.println(emp);
				//System.out.println(">>>>>>>>>>>><<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>><<<<<<<<<<<<");
				
				empList.add(emp);
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		return empList;
	}
	
	public void executeProcedure(Employee emp){
		try {
			
			String sql = "{ call insertEmployee(?,?,?,?) }";
			
			cStmt = con.prepareCall(sql);
			
			cStmt.setString(1, emp.name);
			cStmt.setInt(2, emp.exp);
			cStmt.setInt(3, emp.salary);
			cStmt.setString(4, emp.address);
			
			cStmt.execute();
			
			System.out.println(">>Procedure Executed");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void executeBatch(){
		try {
			
			String sql1 = "update Employee set name = 'Leonardo', salary = 77600 where eid = 6";
			String sql2 = "delete from Employee where empId = 8";
			
			stmt = con.createStatement();
			
			con.setAutoCommit(false); // We wish to manage transaction
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			stmt.executeBatch();
			
			con.commit(); // Commit means execute batch as a transaction
			
			System.out.println("==Transaction Done==");
			
		} catch (Exception e) {
			
			try {
				con.rollback();
				System.out.println("==Transaction Rollbacked==");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			System.out.println("Some Exception: "+e);
		}
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











