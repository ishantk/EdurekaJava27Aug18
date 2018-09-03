/*class Shape{
	Shape(){
		System.out.println("--Shape Object Constructed--");
	}
	
	void draw(){
		System.out.println("--Drawing a Shape--");
	}
}*/

// Lets refine Run-Time-Polymorphism
// Now, we cannot create objects for Shape - which were use less. | But as per the Rule RTE is creating objects for Shape to construct Child Object
// draw method with definition was use less and its definition is eliminated here
/*abstract class Shape{ // For Which we cannot create objects. Instantiation not allowed.
	Shape(){
		System.out.println("--Shape Object Constructed--");
	}
	
	// A method which has no definition.
	// can be created only within abstract class
	// Its a Rule created by Parent which child must define
	abstract void draw();
	//abstract void draw1(); // we can have n number of abstract methods. All of them must be defined by the child
	
	// Regular Methods are allowed:
	void fun(){
		System.out.println("This is fun !!");
	}
}*/

// Lets refine Run-Time-Polymorphism to the Best !!
interface Shape{ // For Which we cannot create objects. Instantiation not allowed.
	
	// Constructors are not allowed. Neither we nor RTE can create its objects
	/*Shape(){
		System.out.println("--Shape Object Constructed--");
	}*/
	
	// A method which has no definition.
	// can be created only within abstract class
	// Its a Rule created by interface which object implementing it must define !!
	void draw(); //-> public abstract void draw();
	
	// Regular Methods are not allowed:
	/*void fun(){
		System.out.println("This is fun !!");
	}*/
}

class Circle implements Shape{//extends Shape{
	Circle(){
		System.out.println("--Circle Object Constructed--");
	}
	
	public void draw(){
		System.out.println("--Drawing a Circle--");
	}
}

class Rectangle implements Shape{//extends Shape{
	Rectangle(){
		System.out.println("--Rectangle Object Constructed--");
	}
	
	public void draw(){
		System.out.println("--Drawing a Rectangle--");
	}
}

class Triangle implements Shape{//extends Shape{
	Triangle(){
		System.out.println("--Triangle Object Constructed--");
	}
	
	public void draw(){
		System.out.println("--Drawing a Triangle--");
	}
	
	void fillColor(){
		System.out.println("--Triangle Filled with Color RED--");
	}
}


public class AbsDemo {

	public static void main(String[] args) {
		
		// s is a ref variable of interface which can point to the object which implements it !!
		
		Shape s; // s is ref variable of Shape which can point to the child object
		s = new Circle(); // created object of Circle
		s.draw();
		
		System.out.println();
		System.out.println("#####################");
		System.out.println();
		
		s = new Rectangle(); // Created object of Rectangle
		s.draw();
		
		System.out.println();
		System.out.println("#####################");
		System.out.println();
		
		s = new Triangle(); // Created object of Triangle
		s.draw();
		
		System.out.println();
		System.out.println("#####################");
		System.out.println();
		
		// Having the Object of Shape and draw method's definition is of no use !!
		//s = new Shape();
		//s.draw();
		
		// Why Downcasting is required
		// We know Triangle Object has draw method from Parent, draw method of its own, and fillColor method
		// But Shape as a Parent has only draw method
		// So, We cannot access fillColor method of Traingle with s

		// s.fillColor(); -> error
		
		/*System.out.println();
		System.out.println("#####################");
		System.out.println();
		
		Triangle t = (Triangle)s; // Downcasting
		t.draw();
		t.fillColor();*/
	}

}
