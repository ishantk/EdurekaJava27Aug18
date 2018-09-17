package co.edureka.model;

import java.util.List;

public class Manager {
	
	// Attributes
	Integer mid;
	String name;
	Integer exp;
	Integer salary;
	String email;
	
	List certificates; // Has A Relation : One to Many
	
	public Manager() {
	
	}

	public Manager(Integer mid, String name, Integer exp, Integer salary, String email, List certificates) {
		this.mid = mid;
		this.name = name;
		this.exp = exp;
		this.salary = salary;
		this.email = email;
		this.certificates = certificates;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getExp() {
		return exp;
	}

	public void setExp(Integer exp) {
		this.exp = exp;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List getCertificates() {
		return certificates;
	}

	public void setCertificates(List certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", exp=" + exp + ", salary=" + salary + ", email=" + email
				+ ", certificates=" + certificates + "]";
	}
	
}
