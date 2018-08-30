
public class StringFunctions {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE. They cannot be modified !!
		String str1 = "This is Awesome";
		// executing a method on string generates a new String
		String str2 = str1.toUpperCase(); // to convert the String to upper case
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);
		
		//String str3 = str1.concat(" !! Have a Great Day !!");
		String str3 = str1 + " !! Have a Great Day !!";
		System.out.println("str1 is: "+str1);
		System.out.println("str3 is: "+str3);

		
		// Length of a String
		int len = str3.length();
		System.out.println("str3 length is: "+len);
		char[] chArr = str3.toCharArray();
		for(char ch : chArr){
			System.out.print(ch+" ");
		}
		System.out.println();
		
		char ch1 = str3.charAt(0);
		char ch2 = str3.charAt(len-1);
		System.out.println("ch1 is: "+ch1);
		System.out.println("ch2 is: "+ch2);
		
		String names = "John, Jennie, Jim, Jack, Joe, John";
		String[] namesArr = names.split(",");
		for(String nm : namesArr){
			System.out.println(nm.trim());
		}
		
		//String subStr = names.substring(6);
		String subStr = names.substring(6,11); // 6 inclusive, 11 not inclusive
		System.out.println("subStr is: "+subStr);
		
		//int idx = names.indexOf('J');
		//int idx = names.indexOf("Jennie"); 
		int idx = names.lastIndexOf("John");
		System.out.println("idx is: "+idx);
		
		if(names.contains("John")){
			System.out.println("John is in the names");
		}
		
		String newNames = names.replace('J', 'K');
		System.out.println(newNames);
		
		String songName = "some_name.mp3";
		if(songName.endsWith(".mp3")){
			System.out.println(songName+" is an audio file");
		}
		
		// Use Cases for Strings:
		String email = "";
		String password = "pass1";
				
		// Validation for email
		if(!email.isEmpty()){
			if(email.contains("@") && email.contains(".")){
				System.out.println("Valid Email !!");
			}else{
				System.out.println("Please Enter a Valid Email !!");	
			}
		}else{
			System.out.println("Please Enter Email First !!");
		}
		
		if(!password.isEmpty() && password.length()>=6){
			System.out.println("Valid Password");
		}else{
			System.out.println("Invalid Password");
		}
	}

}
