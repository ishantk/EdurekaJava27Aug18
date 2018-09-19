package co.edureka.model;

public class Employee {

	int eid;
	String name;
	int exp;
	String competency;
	String email;
	
	public Employee() {
	
	}

	public Employee(int eid, String name, int exp, String competency, String email) {
		this.eid = eid;
		this.name = name;
		this.exp = exp;
		this.competency = competency;
		this.email = email;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getCompetency() {
		return competency;
	}

	public void setCompetency(String competency) {
		this.competency = competency;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Business Method with Core Business Logic
	// AOP Advices Before and After will be executed for every method in Employee Object
	public void allocateSeatAndDepartment(String progLanguage, String gender){
		
		if(exp >=5 && progLanguage.equals("Java") && gender.equals("Female")){
			System.out.println(name+" is allocated seat on Floor 3 with R&D Department");
		}else if(exp >=5 && progLanguage.equals("Java") && gender.equals("Male")){
			System.out.println(name+" is allocated seat on Floor 5 with R&D Department");
		}else if(exp >=10 && progLanguage.equals("Java") && gender.equals("Female")){
			System.out.println(name+" is allocated seat on Ground Floor with R&D Department as Manager");
		}else if(exp >=10 && progLanguage.equals("Java") && gender.equals("Male")){
			System.out.println(name+" is allocated seat on Ground Floor with R&D Department as Manager");
		}
		
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", exp=" + exp + ", competency=" + competency + ", email="
				+ email + "]";
	}
	
	
	
}
