// Employee Class Contains Code which may be repetitive as per the requirements
class Employee{ // Generalization
	
	// Non Static Attributes : Belong to Object
	int eid;
	String name;
	String email;
	int experience;
	
	// Static Attributes : Belong to Class
	static String compName;
	
	// Default Constructor : Property of Object and is executed automatically when object is created
	Employee(){
		eid = 0;
		name = "NA";
		email = "info@example.com";
		experience = 1;
		System.out.println(">>Employee Object Constructed");
	}
	
	// Non Static Methods : Belong to Object
	void allocateSeat(){
		if(experience>=5){
			System.out.println("Seat Allocated on 2nd floor");
		}else{
			System.out.println("Seat Allocated on 5th floor");
		}
	}
	
	void showEmployeeDetails(){
		System.out.println(name+" with id: "+eid+" can be emailed at "+email);
	}
	
	// Static Methods : Belong to Class
	static void showCompanyDetails(){
		System.out.println(compName+" has 1000 Employees !!");
	}
}

// Inheritance -> IS-A Relationship
// SoftwareEningeer >>IS AN<< Employee
class SoftwareEngineer extends Employee{
	
	// All Attributes shall be inherited from the Parent
	String primaryProgLang; // Additional Attribute
	//...
	
	SoftwareEngineer(){
		System.out.println(">>SoftwareEngineer Object Constructed");
	}
	
	// to display primProgLang either create a separate method or just override i.e. redefine Parent's method
	
	// separate method
	void showSEDetails(){
		System.out.println(name+" with id: "+eid+" has competency in "+primaryProgLang+" and can be emailed at "+email);
	}
	
	// or re-define parent's method -> overriding
	void showEmployeeDetails(){
		System.out.println(name+" with id: "+eid+" has competency in "+primaryProgLang+" and can be emailed at "+email);
	}
}

class HRManager extends Employee{
	HRManager(){
		System.out.println(">>HRManager Object Constructed");
	}
}

class MarktingExecutive extends Employee{
	MarktingExecutive(){
		System.out.println(">>MarktingExecutive Object Constructed");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		// Employee Object Creation
		//Employee emp1 = new Employee(); // Default Constructor will be executed
		//emp1.showEmployeeDetails();
		//emp1.allocateSeat();
		
		// We are requesting for the object of SoftwareEngineer
		// Object to Object
		SoftwareEngineer se1 = new SoftwareEngineer();
		
		// Rule : Parent Object is constructed before the Child Object gets Constructed
		//        Thereafter properties are inherited into child object from parent object
		// Constructors and private properties are not inherited
		
		// Object to Object Inheritance
		se1.eid = 101;
		se1.name = "John";
		//se1.email = "john@example.com";
		se1.experience = 10;
		se1.primaryProgLang = "Java";
		
		se1.showEmployeeDetails();
		se1.allocateSeat();
		
		// Class to Class Inheritance
		SoftwareEngineer.compName = "ABC International";
		SoftwareEngineer.showCompanyDetails();
		
	}

}
