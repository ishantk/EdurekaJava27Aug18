
public class ValueRef {

	static void calculateSquare(int num){ // num will have value 10
		int result = num*num;
		System.out.println("Square of "+num+" is "+result);
		num = 1;
	}
	
	static void calculateSquares(int[] arr){ // arr holds address value
		System.out.println("arr contains: "+arr);
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i]*arr[i];
		}
	}
	
	public static void main(String[] args) {
		
		int n = 10;
		System.out.println("n before is: "+n);
		ValueRef.calculateSquare(n);
		System.out.println("n after is: "+n);
		
		int[] a1 = {10,20,30,40,50};
		System.out.println("a1 contains: "+a1);
		System.out.println("a1 before: ");
		
		for(int elm : a1){
			System.out.print(elm+"  ");
		}
		System.out.println();
		
		ValueRef.calculateSquares(a1); // a1 holds address value
		
		// arr and a1 shall point to the same memory location where actual array is created

		System.out.println("a1 after: ");
		
		for(int elm : a1){
			System.out.print(elm+"  ");
		}
		System.out.println();
	}

}
