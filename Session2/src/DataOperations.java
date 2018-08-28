
public class DataOperations {

	// Its just like main gate to the home
	public static void main(String[] args) {
		// whatever we write in here that gets executed sequentially i.e. line by line one after the other

		
		// Arithmetic Operations: 
		int num1 = 10;
		int num2 = 20;
		
		int num3 = num1+num2;
		System.out.println(num1+" and "+num2+" sums to result "+num3);
		System.out.println(num1+" and "+num2+" sums to result "+(num1+num2));
		
		System.out.println(num1+" and "+num2+" multiplication results into "+(num1*num2));
		
		num3 = (num1*num1)+(num2*num2)+(2*num1*num2);
		System.out.println("num3 is: "+num3);
		
		int a = 10;
		int b = 3;
		int c = a%b; // 10 % 3 -> Remainder is 1
		System.out.println("c is: "+c);
		
		// Unary Operations: ++ and --
		int i = 10;
		i++; // i = i+1; // 11 (Post-fix)
		++i; // i = i+1; // 12 (Pre-fix)
		System.out.println("i now is: "+i);
		
		// Relational Operators: They result in true or false after comparison
		int x = 20;
		int y = 20;
		System.out.println("X > Y ? What is Result -> "+(x>y));
		System.out.println("X < Y ? What is Result -> "+!(x<y));
		System.out.println("X == Y ? What is Result -> "+(x==y));
		
		// Logical Operators
		int p = 10;
		int q = 200;
		int r = 100;
		System.out.println((r>p) && (r>q)); // both of the statements should be true
		System.out.println((r>p) || (r>q)); // either one of the statements should be true
		
	}

}
