package co.edureka.model;

public class Employee {
	
	public int eid;
	public String name;
	public int exp;
	public int salary;
	public String address;

	// Default Constructor
	public Employee() {
	
	}
	
	// Parameterized Constructor
	public Employee(int eid, String name, int exp, int salary, String address) {
		this.eid = eid;
		this.name = name;
		this.exp = exp;
		this.salary = salary;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", exp=" + exp + ", salary=" + salary + ", address="
				+ address + "]";
	}
	
}
