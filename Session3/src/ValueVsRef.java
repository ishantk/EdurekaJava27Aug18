
public class ValueVsRef {
	
	
	void addOneToArray(int[] arr){
		System.out.println("arr is: "+arr);
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i]+1;
		}
	}

	public static void main(String[] args) {
		
		int a = 10;
		int b = a; // Value Copy !!
		
		int[] a1 = {10,20,30,40,50};
		int[] a2 = a1; // Reference Copy !!
		
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		
		// a1 and a2 are different ref variables but they will hold the same address to the Array
		// a1 and a2 are the 2 diff names for the same array
		//System.out.println("a2[1] is: "+a2[1]); // 20
		//a2[2] = 100;
		//System.out.println("a1[2] is: "+a1[2]); // 100
		
		ValueVsRef v = new ValueVsRef();
		v.addOneToArray(a1);
		
		for(int elm : a2){
			System.out.print(elm+"  ");
		}
		System.out.println();
		
	}

}
