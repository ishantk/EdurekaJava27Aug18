class PaintWindow{
	
	// Attributes : Belong to Object
	int width;
	int height;
	
	// Special Method : Property of Object
	// Constructor : No Return Type and same name as that of class name
	// default constructor -> as it has no inputs | is created by compiler if we do not create it, and all the values are set to 0's
	// default values will be 0's(primitives) and nulls (references) 
	PaintWindow() { 
		width = 30;
		height = 40;
	}
	
	// Parameterized Constructor
	PaintWindow(int w, int h) { 
		width = w;
		height = h;
	}
	// Overloading a constructor is to have unique inputs always !!
	
	// Benefit of constructor is to have a default/initial value for attributes in an object!!
	
	// Methods : Property of Object
	// Setter Method -> Performs write operation on all the attributes
	void setWidthAndHeight(int w, int h){
		width = w;
		height = h;
	}
	
	// display method to show the contents
	void showWidthAndHeight(){
		System.out.println("Window's width is "+width+" and height is: "+height);
	}
	
}
public class ConstructorDemo {

	public static void main(String[] args) {
	
		PaintWindow pw1 = new PaintWindow(); // PaintWindow(); -> execution of default constructor
		PaintWindow pw2 = new PaintWindow();
		
		// When object is constructed, constructor is executed as a first method call
		// We are not explicitly executing it	
		PaintWindow pw3 = new PaintWindow(1200,1400); //  PaintWindow(1200,1400); -> execution of parameterized constructor
		
		// We are explicitly executing it
		// We can use setter to manipulate i.e. change data in object anytime later
		pw1.setWidthAndHeight(100, 80);
		
		pw1.showWidthAndHeight();
		pw2.showWidthAndHeight(); // width and height is 0 as we didnt write the data
		pw3.showWidthAndHeight();

		// Settings app -> Sound Volume will have a default level as 5 on a scale of 1 to 10
		// Value 5 is set in the constructor
		// setter method can be used to increase or decrease the value later
	}

}
