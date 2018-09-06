package co.edureka;


public class WrapperDemo {

	public static void main(String[] args) {
		
		// Single Value Container
		// Primitive Type : Which contains Value
		int i = 10;
		
		// Single Value Container
		// Reference Type : Which contains Address
		// Wrapper Class : Used to convert Primitive to an object
		
		// Explicit Way
		Integer iRef = new Integer(i); 		// BOXING
		// Implicit Way
		Integer jRef = i; 					// AUTO-BOXING -> Integer jRef = i -> Translated to Integer jRef = new Integer(i);
		
		// Opposite of Boxing is UnBoxing
		
		// Explicit Way
		int x = iRef.intValue(); 			// UNBOXING
		// Implicit Way
		int y = jRef;						// AUTO-UNBOXING -> int y = jRef -> int y = jRef.intValue(); 
		
		char ch = 'A';
		double d = 2.2;
		
		Character cRef = new Character(ch); // Boxing
		Character dRef = ch; 				// AutoBoxing
		
		char p = cRef.charValue();			// UnBoxing
		char q = dRef;						// AutoUnBoxing
		
		Double dRef1 = new Double(d);  		// Boxing
		Double dRef2 = d;					// AutoBoxing
		
		double u = dRef1.doubleValue();		// UnBoxing
		double v = dRef2;					// AutoUnBoxing
		
		// USAGE : To work in purely Object Oriented Approach
		
		Double d1 = 2.2; // Double d1 = new Double(2.2);

	}

}
