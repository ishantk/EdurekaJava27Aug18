package co.edureka.packtwo;

// Import outside the package. Only public classes can be imported !!
import co.edureka.packone.One;

//Two is default and hence cannot be accessed outside the package !!
//import co.edureka.packone.Two; // error

// Inheritance Across the package
// public and protected are inherited outside the package. protected once inherited behaves as private
// private and default are not inherited outside the package
class Seven extends One{
	
	void show(){
		//pvtShow(); -> Not Inherited
		//defShow(); -> Not Inherited
		protShow(); // execute protected method indirectly
	}
}

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		// private is not accessible outside the boundary of One
		// oRef.pvtShow(); // error
		
		// Even though class One is public but default and protected methods/attributes are not accessible outside
		// oRef.defShow();
		// oRef.protShow();
		
		// Only one thing is accessible outside the package that is public
		oRef.pubShow();
		
		System.out.println("*************");
		
		Seven sRef = new Seven();
		sRef.pubShow();
		//sRef.protShow(); // this will behave as private after inheritance
		sRef.show();
	}

}
