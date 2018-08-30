import java.util.Scanner;

class Area{
	
	void calculateAreaOfCircle(double radius){
		System.out.println(">>>calculateAreaOfCircle Started<<<<");
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle with radius "+radius+" is "+area);
		System.out.println(">>>calculateAreaOfCircle Finished<<<<");
	}
	
}


public class CallStack {

	public static void main(String[] args) {
		
		System.out.println("==Main Started==");
		
		int a = 10;
		int b = 20;
		
		//int c = a+b;
		
		// API : Application Programming Interfaces
		// Built In Code which will reduce our effort
		
		Scanner scanner = new Scanner(System.in); // System.in reads from console | System.out writes on Concole
		System.out.println("Please Enter Radius:");
		double r = scanner.nextDouble();
		
		// -> all other api's similarly scanner.nextInt(); scanner.nextFloat();
		
		System.out.println("Enter A:");
		a = scanner.nextInt();
		
		System.out.println("Enter B:");
		b = scanner.nextInt();
		
		Area aRef = new Area();
		aRef.calculateAreaOfCircle(r);
		
		int c = a+b;
		
		System.out.println("c is: "+c);
		
		//scanner.next(); // next will give us the String (String e shall discuss soon)
		
		scanner.close(); // releases the memory resources
		
		System.out.println("==Main Finished==");
		

	}

}
