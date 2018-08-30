// Overloading is to have the same method name but different inputs
// Rules to Overloading
// 1. Method Name should be same
// 2. Inputs should be unique i.e. different
//    2.1 Number of Inputs
//    2.2 Type of Inputs
//    2.3 Sequence of Inputs
// 3. Return Type has no significance
public class Overloading {

	// Dos
	void add(int num1, int num2){
		int num3 = num1+num2;
		System.out.println("num3 is: "+num3);
	}
	
	void add(int num1, int num2, int num3){
		int num4 = num1+num2+num3;
		System.out.println("num4 is: "+num4);
	}
	
	void add(double num1, double num2){
		double num3 = num1+num2;
		System.out.println("num3 is: "+num3);
	}
	
	void add(int num1, double num2){
		double num3 = num1+num2;
		System.out.println("num3 is: "+num3);
	}
	
	void add(double num1, int num2){
		double num3 = num1+num2;
		System.out.println("num3 is: "+num3);
	}
	
	static void add1(int num1, double num2){
		double num3 = num1+num2;
		System.out.println("num3 is: "+num3);
	}
	
	static void add1(double num1, int num2){
		double num3 = num1+num2;
		System.out.println("num3 is: "+num3);
	}
	
	// Donts
	/*void add(int a, int b){ // having names of the inputs changed will not overload a method
		int c = a+b;
		System.out.println("c is: "+c);
	}*/
	
	/*int add(int num1, int num2){ // having a different return will not overload a method, as its not playing any role in overloading
		return num1+num2;
	}*/
	
	// Thumb Rule -> Make Sure your inputs are always unique !!
	
	public static void main(String[] args) {
		
		Overloading oRef = new Overloading();
		oRef.add(10, 20);
		oRef.add(2.2, 3.3);
		oRef.add(10, 20, 30);
		oRef.add(2.2, 200);
		oRef.add(100, 10.23);
		oRef.add(12.12, 10.23);
		oRef.add(123, 10.23);
		oRef.add(100, 12.134);
		
		Overloading.add1(12.12, 130);
		Overloading.add1(12, 13.12);
	}

}
