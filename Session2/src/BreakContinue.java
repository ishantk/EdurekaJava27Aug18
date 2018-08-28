
public class BreakContinue {

	public static void main(String[] args) {
		
		// Iterating in a building of 100 floors
		// We are using a lift to navigate between floors
		
		int homeFloor = 15;
		
		for(int floor=1;floor<=100;floor++){
			System.out.println("Floor is: "+floor);
			
			// break shall terminate the loop, so that no further execution takes place
			if(floor == homeFloor){
				break;
			}
			
		}
		
		System.out.println("=============");
		
		for(int i=1;i<=10;i++){
			
			// 1, 2, 3, 4 and 5 shall be skipped
			if(i<=5){
				continue; // continue shall skip the instructions below and take the loop in next iteration
			}
			
			System.out.println("i is: "+i);
		}
		
		
		System.out.println(">>>>>>>>><<<<<<<<<<<");
		// Whats the Output Below ?
		for(int p=1;p<=5;p++){
			System.out.println("For p: "+p);
			
			for(int q=1;q<=5;q++){
				if(q==3){
					break;
				}
				System.out.print(q+" ");
			}
			
			System.out.println();
		}
		
		System.out.println(">>>>>>>>><<<<<<<<<<<");
	}

}
