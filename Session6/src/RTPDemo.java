
// Generalized Use Case:

 // Parent
class Cab{
	
	Cab(){
		System.out.println(">>Cab Object Constructed<<");
	}
	
	void bookCab(){
		System.out.println("Cab Booked !! Its on thw Way !!");
	}
}

// Child of Cab
class UberGo extends Cab{
	
	UberGo(){
		System.out.println(">>UberGo Object Constructed<<");
	}
	
	// Re-Defining i.e. overriding
	void bookCab(){
		System.out.println("UberGo Booked !! Its on thw Way !!");
	}
}

//Child of Cab
class UberX extends Cab{
	
	UberX(){
		System.out.println(">>UberX Object Constructed<<");
	}
	
	// Re-Defining i.e. overriding
	void bookCab(){
		System.out.println("UberX Booked !! Its on thw Way !!");
	}
}

//Child of Cab
class UberMoto extends Cab{
	
	UberMoto(){
		System.out.println(">>UberMoto Object Constructed<<");
	}
	
	// Re-Defining i.e. overriding
	void bookCab(){
		System.out.println("UberMoto Booked !! Its on thw Way !!");
	}
}

public class RTPDemo {

	public static void main(String[] args) {
		
		/*Cab c;
		c = new Cab();
		c.bookCab();*/
		
		// Polymorphic Statement : Ref Variable of the Parent can point to the object of Child
		Cab c;
		c = new UberGo(); // -> As per rule of Inheritance Cab Object will be constructed and then the UberGo Object
		// c is ref variable of Cab
		// new UberGo() -> Construction of UberGo Object which is Child of Cab
		
		// Vice Versa isnt allowed
		// UberGo u = new Cab(); // Error
		// UberGo u = (UberGo)c; // DownCasting : Do it only when you know that c is pointing to UberGo Object

		// Answer the Following :
		c.bookCab(); // overriding in action !!
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
		
		c = new UberX();
		c.bookCab();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
		
		c = new UberMoto();
		c.bookCab();
		
		// same ref variable c can point to any child object : Polymorphism
		// same bookCab method is booking UberGo/UberX/UberMoto for us... Polymorphism exhibited by bookCab Method (Run-Time)
		// Since we have bookCab from the Parent as well in the Child. 
		// Which method should be executed that decision is taken dynamically i.e. at run time		
		
	}

}
