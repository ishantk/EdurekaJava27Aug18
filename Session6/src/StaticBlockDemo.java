
class Point{
	
	// Object
	int x;
	int y;
	
	// Class
	static int z;
	
	Point(){
		System.out.println("Point Object Constructed");
		x = 10;
		y = 20;
	}
	
	// static block or static initializer : which is kind of constructor for class
	// is executed when class is loaded
	static{
		System.out.println("Point Class Constructed");
		z = 30;
	}
	
	void showPoint(){
		System.out.println("Point is: "+x+":"+y);
	}
	
	static void showZOfPoint(){
		System.out.println("z cordinate is: "+z);
	}
}

public class StaticBlockDemo {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.showPoint();
		p2.showPoint();
		
		Point.showZOfPoint();

	}

}
