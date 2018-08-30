
public class StringsDemo {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		// Strings are Reference Types. They are Reference Variables which will hold the address !!
		
		// Interned Way
		String str1 = "Hello"; // Hello as a literal will be created in constant pool
		String str2 = "Hello";
		
		// Object Way
		String str3 = new String("HEllo"); // new creates object in the heap
		String str4 = new String("Hello");
		
		// Printing a ref should show the address, but magic will happen here
		// we will be able to see the data instead of address
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);
		System.out.println(">>>>>>with toString method<<<<<<");
		// Compiler will execute a method called toString on these ref variables automatically
		System.out.println("str1 is: "+str1.toString());
		System.out.println("str2 is: "+str2.toString());
		System.out.println("str3 is: "+str3.toString());
		System.out.println("str4 is: "+str4.toString());
		
		// Conclusion : Use toString or do not use it output is same it means compiler shall execute toString() if you do not !!
		
		// What is the proof that Strings are reference variables ?
		
		// Comparing Interned Strings : As in Reference Variables. Address is compared
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}

		// Comparing Object Strings : As in Reference Variables. Address is compared
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		// We can check for the String equality using == operator for Interned Strings but not for object strings !!
		
		// equals method compares data in the objects and gives true or false
		//if(str3.equals(str4)){
		if(str3.equalsIgnoreCase(str4)){
			System.out.println("str3 is equal to str4");
		}else{
			System.out.println("str3 is not equal to str4");
		}
		
		//if(str3.compareTo(str4) == 0){
		if(str3.compareToIgnoreCase(str4) == 0){
			System.out.println("str3 is compared to str4");
		}else{
			System.out.println("str3 is not compared to str4");
		}
		
	}

}
