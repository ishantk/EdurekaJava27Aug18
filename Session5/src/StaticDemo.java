import java.util.concurrent.ScheduledExecutorService;

class Student{
	
	// non static attributes
	// Property of Object
	int roll;
	String name;
	String address;
	
	// static attribute
	// Property of Class
	// Not the Property of Object
	static String schoolName;
	
	// non static methods
	// Property of Object
	void showStudent(){
		System.out.println("School Name is: "+schoolName); // class property can be accessed in object's property !!
		System.out.println(roll+" belongs to "+name+" and lives in "+address);
	}
	
	// static method
	// Property of Class
	static void showSchool(){
		//System.out.println("name is: "+name); // error property of object cannot be accessd in class's property !!
		System.out.println(schoolName+" School !!");
	}
}


public class StaticDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.roll = 101;
		s1.name = "John";
		s1.address = "Redwood Shores";
		
		s2.roll = 201;
		s2.name = "Jennie";
		s2.address = "Country Homes";
		
		Student.schoolName = "ABC International";
		
		// Reference Variables of Objects can access the property of class !!
		// Class cannot access the property of Object
		
		// Accessing own property !!
		s1.showStudent();
		s2.showStudent();
		
		Student.showSchool();
		
		// Ref Vars accessing class's property i.e. methods -> Allowed
		s1.showSchool();
		s2.showSchool();

		// Ref Var accessing attribute of Class -> Allowed
		s1.schoolName = "XYZ Global"; // s1 wrote the data in class container
		
		// After s1 modified the data in class, we are reading the data
		
		Student.showSchool();
		s1.showSchool();
		s2.showSchool();
		
	}

}
