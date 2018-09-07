package co.edureka;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		//LinkedList<E> -> H.W. -> Create Queue using LinkedList API !! 
	
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=10;i>0;i--){
			queue.add(i);
		}
		
		// We added the data like below:
		// (head) 10 9 8 7 6 5 4 3 2 1 (tail)
		
		// BUT; PriorityQueue will sort the data for us !!
		// (head) 1 2 3 4 5 6 7 8 9 10 (tail)
		
		/*System.out.println("Head is: "+queue.peek()); // Obtain Head of the Queue !!
		System.out.println("Head is: "+queue.peek());
		System.out.println("Head is: "+queue.peek());
		
		System.out.println("Removed the Head: "+queue.poll()); // Removing the Head of the Queue !!
		System.out.println("Head is: "+queue.peek());
		System.out.println("Removed the Head: "+queue.poll());
		System.out.println("Head is: "+queue.peek());*/
		
		for(int i=1;i<=queue.size();i++){
			System.out.println("Head Removed is: "+queue.poll()+" and size is: "+queue.size());
		}
	}

}
