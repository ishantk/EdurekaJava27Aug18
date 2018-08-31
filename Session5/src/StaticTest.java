class Counter{
	
	int count;
	static int scount;
	
	Counter(){
		count = 0;
		scount = 0;
	}
	
	void incrementCount(){
		count++;  // count = count+1
		scount++; // scount = scount+1
	}
	
	void showCount(){
		System.out.println("count is: "+count+" and scount is: "+scount);
	}
}

public class StaticTest {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = c1; // Ref copy !!
		
		c1.incrementCount(); // count 1 | scount 1
		c2.incrementCount(); // count 1 | scount 2
		c3.incrementCount(); // count 2 | scount 3
		
		c1.incrementCount(); // count 3 | scount 4
		c2.incrementCount(); // count 2 | scount 5
		c2.incrementCount(); // count 3 | scount 6
		
		c2.incrementCount(); // count 4 | scount 7
		
		c1.showCount(); // count is: 0 3 2 2 4 and scount is: 1 7 7 7
		c2.showCount(); // count is: 2 4 3 4 4 and scount is: 2 7 7 7
		c3.showCount(); // count is: 1 3 1 2 4 and scount is: 2 7 7 7

	}

}
