
public class VoteProblem {

	public static void main(String[] args) {
		
		// 1. Single Value Containers - Containing data i.e. vote count for various regions
		// Not Recommended
		
		// Democratic Party
		int arizonaDemCount = 126;
		int floridaDemCount = 32;
		int vermontDemCount = 230;
		int texasDemCount = 21;
		int georgiaDemCount = 200;
		
		// Republican Party
		int arizonaRepCount = 152;
		int floridaRepCount = 85;
		int vermontRepCount = 121;
		int texasRepCount = 215;
		int georgiaRepCount = 13;
		

		// Write Logic to decide who wins ??
		
		int demVoteCount = arizonaDemCount + floridaDemCount + vermontDemCount + texasDemCount + georgiaDemCount;
		int repVoteCount = arizonaRepCount + floridaRepCount + vermontRepCount + texasRepCount + georgiaRepCount;
		
		if(demVoteCount > repVoteCount){
			System.out.println("Democratic Party wins by "+(demVoteCount-repVoteCount)+" votes");
		}else{
			System.out.println("Replublican Party wins by "+(repVoteCount-demVoteCount)+" votes");
		}
		
		//2. Use Multi Value Container i.e. Array to Store the data and solve the problem 
		
		// Assuming we have n number of regions so storing data will become complex !!
		// Other Solution is to have a multi value container -> Array
		// Array is Homogeneous. -> Same type of data
		// Syntax to Create an Array : will have indexes to access data
						// 0   1    2    3   4
		int[] demVotes = {126, 32, 230, 21, 200, 345, 678};
		int[] repVotes = {152, 85, 121, 215, 13, 50, 670};
		
		// When we try to print demVotes and repVotes
		// demVotes and repVotes are not arrays !! They are reference variables which holds the address for the array !!
		System.out.println("demVotes is: "+demVotes);
		System.out.println("repVotes is: "+repVotes);
		
		System.out.println("demVotes length is: "+demVotes.length);
		System.out.println("repVotes length is: "+repVotes.length);
		
		// Read the element from Array using its index
		System.out.println("demVotes[1]: "+demVotes[1]); // 32
		System.out.println("repVotes[3]: "+repVotes[3]); // 215
		
		// Update the data in Array using its index
		demVotes[1] = 312;
		repVotes[3] = 577;
		System.out.println("----After Update----");
		System.out.println("demVotes[1]: "+demVotes[1]); 
		System.out.println("repVotes[3]: "+repVotes[3]); 
		
		// Read all the array indexes
		// 1. Loop
		for(int i=0;i<repVotes.length;i++){
			System.out.print(repVotes[i]+"  ");
		}
		System.out.println();
		
		//2. Enhanced For Loop | Used only with Arrays as of now
		for(int elm : demVotes){ // elm can be anyname of your choice
			System.out.print(elm+"  ");
		}
		
		System.out.println();
		
		// Write Logic to decide who wins ??
		demVoteCount = 0;
		repVoteCount = 0;
		
		for(int elm : demVotes){
			demVoteCount = demVoteCount + elm;
		}
		
		for(int elm : repVotes){
			repVoteCount = repVoteCount + elm;
		}
		
		if(demVoteCount > repVoteCount){
			System.out.println("Democratic Party wins by "+(demVoteCount-repVoteCount)+" votes");
		}else{
			System.out.println("Replublican Party wins by "+(repVoteCount-demVoteCount)+" votes");
		}
		
		// Problem Statements on Array and all other around -> Hackerearth, Hackerrank, Codility, TopCoder, GeekForGeeks 
	
		//3. Use Multi Value Container i.e. Array of Arrays to Store the data and solve the problem
		// n-Dim Array
		// 2-Dim Array -> Array of Arrays
		int[][] votes = {
							{126, 32, 230, 21, 200, 345, 678},   // 0th index
							{152, 85, 121, 215, 13, 50, 670} 	 // 1st index
						};
		
		System.out.println(">>>>>>>><<<<<<<<<");
		
		System.out.println("votes is: "+votes);
		System.out.println("votes length is: "+votes.length);
		
		System.out.println("votes[0] is: "+votes[0]+" | "+votes[0].length);
		System.out.println("votes[1] is: "+votes[1]+" | "+votes[1].length);
		
		System.out.println(votes[0][0]); // element at votes[0th Array's][0th index] -> 126
		System.out.println(votes[1][4]); // element at votes[1st Array's][4th index] -> 13
		
		// Write Logic to decide who wins ??
		demVoteCount = 0;
		repVoteCount = 0;
		
		for(int i=0;i<votes.length;i++){ // iterating 2 times
			for(int j=0;j<votes[i].length;j++){ // votes[0].length and votes[1].length
				// Our Logic Here
				if(i==0){
					demVoteCount = demVoteCount + votes[i][j];
				}else{
					repVoteCount = repVoteCount + votes[i][j];
				}
			}
		}
		
		if(demVoteCount > repVoteCount){
			System.out.println("Democratic Party wins by "+(demVoteCount-repVoteCount)+" votes");
		}else{
			System.out.println("Replublican Party wins by "+(repVoteCount-demVoteCount)+" votes");
		}
		
		// Array can be of any type but always same data
		double[] values = {1.1, 2.2, 3.3, 4.4, 5.5};
		char[] vowels = {'A','E','I','O','U'};
	}

}
