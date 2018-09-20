package co.edureka;

public class Connection {
	
	private static Connection con = new Connection();
	
	private Connection() {
		System.out.println("==Object Conctructed==");
	}
	
	public static Connection getConnection(){
		return con;
	}

}
