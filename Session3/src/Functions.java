
public class Functions {

	// Methods or Functions
	// 1. Non static
	
	// void -> Ack i.e. return nothing
	// sayHello -> method name
	// () -> Inputs : no input here
	// { //...  } -> Body which contains instructions to be executed in a Sequence
	void sayHello(){
		System.out.println("Hello, Hope you are doing Good !!");
	}
	
	// Having inputs -> only 1 input i.e. num
	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
	
	// Ack is int -> function must return some integer in the end !!
	int addNumbers(int num1, int num2){ // Value as Inputs
		int num3 = num1 + num2;
		return num3;
	}
	
	// Array as Input !! i.e. a Multi Value Container
	void printArray(int[] arr){ // Reference as Input
		for(int elm : arr){
			System.out.print(elm+"  ");
		}
		System.out.println();
	}
	
	// 2. Static Methods:
	static int multiplyNumbers(int num1, int num2){
		int num3 = num1*num2;
		return num3;
	}
	
	// What is static and what is non static that we will see later !!
	// But non static has no static keyword in beginning but a static method will have a static keyword in the beginning
	
	// for the below function: name main is fixed. we cannot change it !!
	// We shall discuss main very soon !! When we understand what is public, static and String !!
	public static void main(String[] args) {
		
		// Execution of Non Static Methods:
		// We need to create an Object of Functions Class
		
		Functions fRef = new Functions(); // Object Creation Statement | fRef can be any name of your choice
		// We are not discussing what is an object !!
		
		fRef.sayHello(); // . has something to do with object !!
		fRef.sayHello();
		
		fRef.printTable(5);
		System.out.println("*************");
		fRef.printTable(7);

		int x = 10;
		int y = 20;
		
		int result = fRef.addNumbers(x, y); // Passing the Value
		System.out.println("Result is: "+result);
		System.out.println("Result is: "+fRef.addNumbers(123, 456));
		
		int[] a1 = {10, 20, 30, 40, 50};
		int[] a2 = {12,13,18,20,19};
		fRef.printArray(a1); // Passing the Reference. Because a1 is a ref variable which holds the address value
		fRef.printArray(a2);
		
		// Execution of Static Methods:
		// We need not to have object. We will directly execute it using the Class Name
		int mul = Functions.multiplyNumbers(12, 12);
		System.out.println("Multiplication Result is: "+mul);
		System.out.println("Multiplication Result is: "+Functions.multiplyNumbers(13, 16));
	}

}
