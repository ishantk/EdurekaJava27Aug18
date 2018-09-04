package co.edureka.exceptions;

import java.io.IOException;

// User-Defined UNCHECKED Exception
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message);
	}
}

//User-Defined CHECKED Exception
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);
	}
}

class Banking{
	
	int balance = 10000;
	int minBalance = 3000;
	
	int attempts = 0;
	
	void withdraw(int amt){
		
		balance = balance - amt;
		
		if(balance<=minBalance){
			balance = balance + amt;
			System.out.println("Withdrawl Failure!! Balance is LOW\u20b9"+balance);
			attempts++;
		}else{
			System.out.println("Withdrawl Successful!! New Balance is \u20b9"+balance);
		}
		
		if(attempts == 3){
			// Create an Exception Object
			// UNCHECKED EXCEPTION OBJECT
			ArithmeticException aRef = new ArithmeticException("Illegal Attempts "+attempts);
			throw aRef; // we are throwing an UNCHECKED Exception explicitly !!
		}
	}
	
	// If a method is throwing a checked exception compiler will check it and raise a compile time error
	// we need to involve that exception in the method's signature using throws keyword
	void withdrawAgain(int amt) throws IOException, YourBankingException{
		
		balance = balance - amt;
		
		if(balance<=minBalance){
			balance = balance + amt;
			System.out.println("Withdrawl Failure!! Balance is LOW\u20b9"+balance);
			attempts++;
		}else{
			System.out.println("Withdrawl Successful!! New Balance is \u20b9"+balance);
		}
		
		if(attempts == 3){
			// Create an Exception Object
			// CHECKED EXCEPTION OBJECT
			//IOException iRef = new IOException("Illegal Attempts "+attempts);
			//throw iRef; // we are throwing a CHECKED Exception explicitly !!
			YourBankingException yRef = new YourBankingException("Illegal Attempts "+attempts);
			throw yRef;
		}
	}
	
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		
		System.out.println("==Banking Started==");
		
		Banking bRef = new Banking();
		
		//for(int i=1;i<=500;i++){
		//	bRef.withdraw(3000);
		//}
		
		// Compiler generates an error to surround the method call with try catch
		try{
			for(int i=1;i<=500;i++){
				bRef.withdrawAgain(3000);
			}
		}catch(Exception e){
			System.out.println("OOPS!! Some Error !"+e); // end user
			
			//e.printStackTrace(); // line numbers     // debugging purpose
			//System.out.println("Exception: "+e);
		}

		System.out.println("==Banking Finished==");
	}

}
