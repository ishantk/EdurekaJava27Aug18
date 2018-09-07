package co.edureka;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	void iterateInSet(Set<String> set){ // set can point to any type of set
		System.out.println("-----Iterating-----");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String nm = itr.next();
			System.out.println(nm);
		}
		
		System.out.println("-------------------");
	}
	
	void sayHello(CharSequence cs){
		Date date = new Date();
		System.out.println("Hello, "+cs+"\nIts: "+date);
	}

	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<String>(); 		// Polymorphic Statement
		HashSet<String> set = new HashSet<String>();	// Direct Object Construction
		//TreeSet<String> set = new TreeSet<String>();	// Sort the data
		
		set.add("John");
		set.add("Jennie");
		set.add("Mike");
		set.add("Leo");
		set.add("Alen");
		set.add("Jennie");
		set.add("Sia");
		set.add("George");
		
		// Data is UnOrdered due to technique called hashing which is used to store data
		// No Redundant Data !! Jennie appears only once !!
		System.out.println("===set is===");
		System.out.println(set);
		
		if(set.contains("Jennie")){
			System.out.println("Jennie is in the set");
		}
		
		set.remove("Jennie");
		
		System.out.println(set);
		
		System.out.println(set.size());
		//set.clear();
		
		SetDemo sRef = new SetDemo();
		sRef.iterateInSet(set);
		
		String name1 = "John";
		StringBuilder name2 = new StringBuilder("Jennie");
		StringBuffer name3 = new StringBuffer("Jim");
		
		sRef.sayHello(name1); // String
		sRef.sayHello(name2); // StringBuilder
		sRef.sayHello(name3); // StringBuffer
		
	}
	

}
