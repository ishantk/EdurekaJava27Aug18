package co.edureka.model;

import java.util.List;

// Bean
public class Student {

	int rollNum;
	String name;
	int age;
	String email;
	
	Address address; 			// Has-A Relationship |  1 to 1
	
	List<String> certificates; 	// Has-A Relationship |  1 to many
	
	public Student() {
	
	}

	public Student(int rollNum, String name, int age, String email, Address address) {
		this.rollNum = rollNum;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	// 1. Constructor Based Dependency Injection
	public Student(Address address) {
		this.address = address;
		System.out.println("==Constructor Based Dependency Injection==");
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	//2. Dependency Injection using Setter
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("==Setter Based Dependency Injection for Address==");
	}
	
	public List<String> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
		System.out.println("==Setter Based Dependency Injection for List==");
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", age=" + age + ", email=" + email + ", address="
				+ address + "]";
	}
	
}
