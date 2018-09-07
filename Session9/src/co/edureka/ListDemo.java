package co.edureka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Student{
	int roll;
	String name;
	
	public String toString() {
		return roll+"\t"+name;
	}
}

public class ListDemo {

	public static void main(String[] args) {
		
		//List list1 = new ArrayList(); 						// Polymorphic Statement
		
		// We can store any type of data
		ArrayList list1 = new ArrayList(); 						// Direct Object Construction

		// We can store only Strings
		ArrayList<String> list2 = new ArrayList<String>(); 		// Direct Object Construction with Type
		
		// We can store only Student Objects
		ArrayList<Student> list3 = new ArrayList<Student>(); 	// Direct Object Construction with Type
		
		Student s1 = new Student();
		s1.roll = 101;
		s1.name = "Mike";
		
		Student s2 = new Student();
		s2.roll = 201;
		s2.name = "Leo";
		
		// 1. Adding Data to ArrayList
		
		// index management happens automatically
		//list1.add(0,10); 
		list1.add(10); 		//0	//-> translated as list1.add(new Integer(10)); // AutoBoxing Happens here
		list1.add(2.2);		//1
		list1.add("John");  //2
		list1.add("Sia");	//3
		list1.add('A');		//4
		list1.add(s1);		//5
		
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("Joe");
		list2.add("Jennie"); // Duplicacy Allowed
		//list2.add(100); // err
		//list2.add('A'); // err
		//list2.add(s1);  // err
		
		list3.add(s1);
		list3.add(s2);
		//list3.add('A'); // err
		
		//2. Read All Elements in List
		System.out.println("===List1 Contents===");
		System.out.println(list1); // -> System.out.println(list1.toString());
		
		System.out.println("===List2 Contents===");
		System.out.println(list2);
		
		System.out.println("===List3 Contents===");
		System.out.println(list3);
		
		//3. Read Single Element from List
		Object o = list1.get(3);
		String nm = list2.get(1);
		Student s = list3.get(1);
		
		System.out.println(o);
		System.out.println(nm);
		System.out.println(s);
		
		//4. Length of List
		System.out.println("list1 size is: "+list1.size());
		System.out.println("list2 size is: "+list2.size());
		System.out.println("list3 size is: "+list3.size());
		
		//5. Remove Element from a list
		list2.remove(3);
		System.out.println("===List2 Contents===");
		System.out.println(list2);
		
		//6. Update Element in a List
		list2.set(3, "Joey Watson");
		System.out.println("===List2 Contents===");
		System.out.println(list2);
		
		//7. check for the element : contains method
		if(list2.contains("Jim")){
			System.out.println("Jim is in the list");
		}
		
		int idx = list2.indexOf("Jim");
		System.out.println("idx of Jim is: "+idx);
		idx = list2.lastIndexOf("Jennie");
		System.out.println("idx of Jennie from the last is: "+idx);
		
		// 8. Iterating in the List
		
		// 8.1
		System.out.println("-------For Loop------");
		for(int i=0;i<list1.size();i++){
			Object obj = list1.get(i);
			System.out.println(obj);
		}
		System.out.println("------------");
		for(int i=0;i<list2.size();i++){
			String name = list2.get(i);
			System.out.println(name);
		}
		System.out.println("------------");
		for(int i=0;i<list3.size();i++){
			Student stu = list3.get(i);
			System.out.println(stu);
		}
		
		//8.2
		System.out.println("-------Enhanced For Loop------");
		for(Object obj : list1){
			System.out.println(obj);
		}
		System.out.println("------------");
		for(String str : list2){
			System.out.println(str);
		}
		System.out.println("------------");
		for(Student stu : list3){
			System.out.println(stu);
		}
		
		//8.3
		System.out.println("-------Iterator------");
		
		Iterator itr1 = list1.iterator();
		while(itr1.hasNext()){
			Object obj = itr1.next();
			System.out.println(obj);
		}
		System.out.println("------------");
		Iterator<String> itr2 = list2.iterator();
		/*System.out.println(itr2.next());
		System.out.println(itr2.next());
		System.out.println(itr2.next());*/
		while(itr2.hasNext()){
			String str = itr2.next();
			System.out.println(str);
			
			if(str.equals("Jim")){
				itr2.remove(); // will delete the element form list directly
			}
		}
		System.out.println("------------");
		Iterator<Student> itr3 = list3.iterator();
		while(itr3.hasNext()){
			Student stu = itr3.next();
			System.out.println(stu);
		}
		
		//8.4
		System.out.println("-------List Iterator------");
		ListIterator<String> listItr2 = list2.listIterator();
		while(listItr2.hasNext()){
			String str = listItr2.next();
			System.out.println(str);
		}
		System.out.println("------------");
		while(listItr2.hasPrevious()){
			String str = listItr2.previous();
			System.out.println(str);
		}
		
		//8.5
		System.out.println("-------Enumeration------");
		Enumeration<String> enm = Collections.enumeration(list2); // read only structure
		while(enm.hasMoreElements()){
			String str = enm.nextElement();
			System.out.println(str);		
		}
		
		// ArrayList -> Not Thread-Safe i.e. it is not Synchronized !!
		// Vector -> Sibling to ArrayList and is Thread-Safe i.e. Synchronized !!
		
		Vector<String> names = new Vector<String>();
		names.add("John");
		names.add("Jennie");
		names.add("Jim");
		names.add("Jack");
		names.add("Joe");
		
		System.out.println("names are "+names);
		
		for(String str : names){
			System.out.println(str);
		}
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("John");
		myList.add("Jennie");
		myList.add("Jim");
		myList.add("Jack");
		myList.add("Joe");
		
		ArrayList<String> yourList = new ArrayList<String>();
		yourList.add("Mike");
		yourList.add("Leo");
		yourList.add("Sia");
		
		yourList.addAll(myList); // We are appending data from myList into yourList
		System.out.println("====myList====");
		System.out.println(myList);
		System.out.println("====yourList====");
		System.out.println(yourList);
		
	}

}
