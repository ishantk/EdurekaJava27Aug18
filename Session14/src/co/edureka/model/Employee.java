package co.edureka.model;

public class Employee { // Bean or Model or POJO
	
	// Attributes
	Integer eid;
	String name;
	Integer salry;
	String email;
	String address;

	public Employee() {
	
	}

	public Employee(Integer eid, String name, Integer salry, String email, String address) {
		this.eid = eid;
		this.name = name;
		this.salry = salry;
		this.email = email;
		this.address = address;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalry() {
		return salry;
	}

	public void setSalry(Integer salry) {
		this.salry = salry;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salry=" + salry + ", email=" + email + ", address="
				+ address + "]";
	}
	
}
