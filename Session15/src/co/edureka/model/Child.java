package co.edureka.model;

public class Child extends Father{

	String companyName;
	int vehicles;
	
	public Child() {
	
	}
	
	public Child(String companyName, int vehicles) {
		this.companyName = companyName;
		this.vehicles = vehicles;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		// this is a reference variable which points to current object !!
	}

	public int getVehicles() {
		return vehicles;
	}

	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "Child [companyName=" + companyName + ", vehicles=" + vehicles + ", fname=" + fname + ", lname=" + lname
				+ ", welath=" + wealth + "]";
	}
	
	
}
