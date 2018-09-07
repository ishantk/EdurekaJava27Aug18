package co.edureka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
				// Key , Value
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "John"); // KeyValue Pair is Entry -> Type of Entry is Entry<Integer, String>
		map.put(123, "Jennie");
		map.put(345, "Jim");
		map.put(121, "John");
		map.put(344, "Jack");
		map.put(678, "Joe");
		
		// HashMap works on uniqueness for the keys
		// Value can be duplicated
		
		// if we try to duplicate the key
		map.put(344, "Leo"); // updating the old value i.e. Jack of the key 344 to a new value i.e. Leo
		
		// Print the Map
		System.out.println("===Map Contents===");
		System.out.println(map);
		
		// Output is unordered due to hashing !!
		
		String nm = map.get(345);
		System.out.println("Name on 345 is: "+nm);
		
		map.put(null, "Sia");
		map.put(111, null);
		
		System.out.println("==Map Details==");
		System.out.println(map);
		
		map.remove(111);
		
		System.out.println(map.size());
		
		if(map.containsKey(678)){
			System.out.println("key 678 is in the map");
		}
		
		if(map.containsValue("John")){
			System.out.println("John is in the map");
		}
		
		// Iterator to Iterate in the HashMap
		// 1. using keySet and iterator API
		Set<Integer> keys = map.keySet(); // keySet method returns a Set of all the Keys in the Map
		System.out.println(keys);
		Iterator<Integer> itr = keys.iterator();
		System.out.println(">>>>>>><<<<<<");
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(key+"\t"+value);
		}
		System.out.println(">>>>>>><<<<<<");
		
		//2. Entry
		System.out.println("^^^^^^^^^^^^^^^^");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> itr1 = entrySet.iterator();
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		System.out.println("^^^^^^^^^^^^^^^^");
	
		// Hashtable is a Thread-Safe Version of HashMap i.e. it is Synchronized !!
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John"); // KeyValue Pair is Entry -> Type of Entry is Entry<Integer, String>
		table.put(123, "Jennie");
		table.put(345, "Jim");
		table.put(121, "John");
		table.put(344, "Jack");
		table.put(678, "Joe");
		System.out.println("===Hashtable===");
		System.out.println(table);
		
		// Hashtable cannot allow null key or null values !!
		// table.put(null, "Sia"); -> Exception
		// table.put(111, null);  //-> Exception
		
		// Collection of Collection
		// List of Maps
		ArrayList<HashMap<Integer, String>> list1 = new ArrayList<HashMap<Integer, String>>(); 
		
		// HashMap of ArrayList of Type String
		HashMap<Integer, ArrayList<String>> map1 = new HashMap<Integer, ArrayList<String>>(); 
		
	}
	
	

}
