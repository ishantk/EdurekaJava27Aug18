package co.edureka.model;

// Bean : Is an Object
public class DBSource {

	// Attributes Required to have a DB Connection
	String url;
	String user;
	String password;
	
	public DBSource() {
		System.out.println("==DBSource Object Constructed==");
	}

	public DBSource(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	// User Defined: Can be any name of your choice
	public void init(){
		System.out.println("==init Executed==");
	}
	
	public void destroy(){
		System.out.println("==destroy Executed==");
	}

	@Override
	public String toString() {
		return "DBSource [url=" + url + ", user=" + user + ", password=" + password + "] Address: "+super.toString();
	}
}
