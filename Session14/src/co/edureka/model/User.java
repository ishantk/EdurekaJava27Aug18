package co.edureka.model;

// Bean or Model or POJO : Structure of an Object
public class User {

	// Attributes
	Integer uid;
	String name;
	String email;
	
	Address address; // Has-A Relation : One to One
	
	public User() {
	
	}

	public User(Integer uid, String name, String email, Address address) {
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
}
