class Father{
	// non static method -> belongs to object and shall be inherited into object and not into class
	void purchaseBike(){
		System.out.println("==Lets Buy Bajaj Pulsar==");
	}
	
	// static method
	static void purchaseCar(){
		System.out.println("==Lets Buy Maruti Suzuki Swift==");
	}
}

class Son extends Father{
	
	// Overriding
	// Re-Define the same method from the parent object into the child object
	void purchaseBike(){
		super.purchaseBike(); // super as a ref variable can access the properties of the parent object 
		System.out.println("==Lets Buy Royal Enfield==");
	}
	
	void fun(){
		super.purchaseBike(); // Parent's purchaseBike
	}
	
	// Hiding
	// static method
	// Re-Define the same method from the parent class into the child class will hide the parent's definition
	static void purchaseCar(){
		System.out.println("**Lets Buy Honda City**");
	}
}

class CA{
	void fun(){
		
	}
}

class CB extends CA{
	void fun(){
		
	}
}
class CC extends CB{
	void fun(){
		
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		Son sRef = new Son();
		sRef.purchaseBike(); // overriding Parent's purchaseBike and executing Child's purchseBike

		Son.purchaseCar();
	}

}
