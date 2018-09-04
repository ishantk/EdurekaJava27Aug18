interface Inf1{
	// Attributes are by default static and final (final is the one whose value cannot be modified)
	int i=10; 		// -> public static final int i = 10;
	
	// methods are by default public and abstract
	void show();    // -> public void show();
	void fun();     // -> public void fun();
}

interface Inf2{
	
	int j = 20;
	//int i = 100; -> give an error when CA will access i
	
	void hello();
	void fun();
}

interface Inf3 extends Inf1, Inf2{ // Multiple Inheritance which is NOT Class to Class, NOT Object to Object, IT IS Interface to Interface
	
}

//class CA implements Inf1{
//class CA implements Inf1, Inf2{ // Multiple Implementation, NOT Multiple Inheritance
class CA implements Inf3{	
	public void show(){
		System.out.println("This is show !!");
	}
	
	public void fun(){
		System.out.println("This is fun !!");
	}
	
	public void hello(){
		System.out.println("This is hello !!");
	}
}

public class InfDemo {

	public static void main(String[] args) {
		
		Inf1 i1 = new CA();
		i1.show();
		i1.fun();
		//i1.hello(); // error
		System.out.println("i is "+Inf1.i);
		System.out.println("i is "+CA.i);
		
		System.out.println("*****************");
		
		Inf2 i2 = new CA(); // Polymorphic Statement
		i2.fun();
		i2.hello();
		//i2.show(); // Error
		System.out.println("j is: "+Inf2.j);
		System.out.println("j is: "+CA.j);

		System.out.println("*****************");
		
		CA ca = new CA();
		ca.show();
		ca.fun();
		ca.hello();
		
		System.out.println("*****************");
		
		Inf3 i3 = new CA();
		i3.show();
		i3.fun();
		i3.hello();
		//Inf3.i = 100; // error -> Cannot modify the value of i as it is final i.e. constant
		System.out.println("i is: "+Inf3.i);
		System.out.println("j is: "+Inf3.j);
		
	}

}
