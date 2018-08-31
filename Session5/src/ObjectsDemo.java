// Textual Description of how User Object will look like in the memory !!
// Representation of Object
class User{
	// Attributes of Object
	// they do not belong to class, they belong to object !!
	// Attributes declared have different types, i.e. how object is hetrogeneous in nature
	String name;
	private String phone;
	String email;
	char gender;
	private int age;
	String address;
	
	// private as an attribute cannot be accessed outside the object's boundary
	// non private attribute is accessible outside the object's boundary
	// private -> Security : We are restricting not to write the data directly !! 
	// We must have some rules to write the data thats why we are making it private !!
	
	
	// Method : which will indirectly write the data in object
	// Method : property of object and not of class
	void setPhone(String ph){ // SETTER METHOD
		if(ph.length()>10 && ph.length()<=13){
			phone = ph; // writing the data based on some rules
		}else{
			phone = "NA";
			System.out.println("Please Enter Correct Phone Number");
		}
	}
	
	String getPhone(){ // GETTER METHOD
		return phone; // read operation
	}
	
	void setAge(int a){
		if(a>=18){
			age = a;
		}else{
			age = 0;
			System.out.println("Invalid Age !!");
		}
	}
	
	int getAge(){
		return age;
	}
}


// class contains main method from where execution shall begin !!
// We will just code in the main method
public class ObjectsDemo {

	public static void main(String[] args) {

		// Create Objects Here
		User user1 = new User(); // Object Construction Statement
		// user1 is not object, its a ref variable which holds the address for object
		// new creates objects dynamically i.e. at run time in the heap area
		User user2 = new User();
		
		User user3 = user1; 	// Reference Copy
		
		System.out.println("user1 is: "+user1);
		System.out.println("user2 is: "+user2);
		System.out.println("user3 is: "+user3);

		// Write Operation : Writing data in object
		user1.name = "John Watson";
		//user3.phone = "+91 99999 88888";
		user3.setPhone("+919999988888");
		user1.email = "john@example.com";
		user3.gender = 'M';
		//user1.age = 30;
		user1.setAge(30);
		user1.address = "Redwood Shores";
		
		user2.name = "Jennie Flynn";
		//user2.phone = "+91 99999 77777";
		user2.setPhone("+919999977777");
		user2.email = "jennie@example.com";
		user2.gender = 'F';
		//user2.age = 33;
		user2.setAge(33);
		user2.address = "Country Homes";
		
		// Update Operation: Update the data in object
		//user3.age = 35;
		//user2.age = 40;
		
		// Read Operation : Reading the data from Object
		//System.out.println(user1.name+" is "+user1.age+" yrs old. Can be called at "+user3.phone+". Lives in "+user1.address);
		//System.out.println(user2.name+" is "+user2.age+" yrs old. Can be called at "+user2.phone+". Lives in "+user2.address);
		
		System.out.println(user1.name+" is "+user1.getAge()+" yrs old. Can be called at "+user3.getPhone()+". Lives in "+user1.address);
		System.out.println(user2.name+" is "+user2.getAge()+" yrs old. Can be called at "+user2.getPhone()+". Lives in "+user2.address);
		
		// Deleting the object from the memory will be taken care by Garbage Collector !!
		// Explicitly if you wish to execute GC
		// System.gc(); //-> Explicitly executing GC to clean the memory resources
	}

}
