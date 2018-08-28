
public class DataTypes {

	public static void main(String[] args) {
	
		// Single Value Containers: Primitive Types. What memory should be allocated to them is calculated on compilation time !!
		// Deletion of Primitives is automatic.
		
		// Multi Value Containers: Reference Types.
		// We got storage containers for whom memory allocation happens during run time. GC takes care of such Boxes !!
		
		// Integral Data Storage Containers
		byte age = 10; // writing the data in container called age whose size is 1 byte i.e. 8 bits
		short s = 100;
		int i = 10000000;
		long l = 1000000000000l;
		
		// How to get what can be the max value or the min value which cab be stored in the BOX ?
		// byte is 8 bits -> 2pow8 ??? -> 256 -> -128 to 0 to 127 (Range for byte storage container)
		
		// Write Operation
		byte num = -128; // last value
		
		// Read Operation
		System.out.println("num is: "+num);
		
		// Update Operation
		num = 100; // overwriting the old value, new data is 100. 100 i.e. constant i.e. data is also known as literal
		
		// marks is a SVC, it cannot contain more than 1 value
		// int marks = 98,78,69,78,80; // error
		
		// Floating Points      | exponents and mantissa 
		float pi = 3.14f; 		// 4 bytes
		double piAgain = 3.14;  // piAgain is the name of the Box with size as 8 bytes and 3.14 is literal or value or data in the box

		// Character
		char ch = 'A';
		System.out.println("ch is: "+ch);
		
		ch = 66; // update operation ?? 66 is the ASCII Code for character B
		System.out.println("ch is: "+ch);
		
		//ch = '\u20b9'; // update operation ?? Unicode Character
		ch = '\u0915';
		System.out.println("ch is: "+ch);
		
		// Boolean i.e. a Logical
		boolean isInternetConnected = true;
		isInternetConnected = false;
		
		// Writing the data
		int num1 = 100;
		
		// Updating the Data
		num1 = 200;
		
		// Reading the data
		System.out.println("num1 is: "+num1);
		
		// Delete Operation : Happens Automatically when the program finishes
	}

}
