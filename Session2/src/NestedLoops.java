
public class NestedLoops {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++){ // Loop shall execute 5 times !!
			System.out.println("For i: "+i);
			
			// Nested Loop
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			
			System.out.println();
		}

	}

}
