package co.edureka.packone;

public class App {

	public static void main(String[] args) {

		// -> either public or default class, we can create objects in any class in the same package !!
		// -> everything is accessible other than private in the same package !!
		
		// Execution can be done here
		One oRef = new One();
		// private is not accessible outside the boundary of One
		//oRef.pvtShow(); // error
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println("***********");
		
		Two tRef = new Two();
		// private is not accessible outside the boundary of One
		//tRef.pvtShow(); //error
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();
		
		
	}

}
