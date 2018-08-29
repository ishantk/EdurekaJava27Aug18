
public class Arrays {

	public static void main(String[] args) {
		
		// 1. Implicit
		int[] a1 = {10, 20, 30, 40, 50}; // Translated to -> int[] a1 = new int[]{10, 20, 30, 40, 50};
		
		//2. Explicit
		int[] a2 = new int[]{10, 20, 30, 40, 50}; // Size is taken care automatically. Dont give the size !!
		
		// In 1 and 2 we created an array dynamically i.e. at run time in the heap area
		// new will create the array at run time
		// we dont delete the array, it shall be deleted by Garbage Collector
		// all the elements in 1 and 2 type of arrays have default values as given by us !! eg: 10, 20 ...
		
		//3.
		int[] a3 = new int[5];
		// In 3 array is created dynamically i.e. at run time in heap area
		// all the elements of a3 are by default 0.
		// We mentioned size as 5 which means only 5 elements from 0th index to 4th
		
		// We can write data later
		a3[2] = 123;
		
		for(int i : a3){
			System.out.print(i+"  ");
		}
		System.out.println();
		
		//4.
		int[] a4,a5; // Bracket before all are references to arrays
		a4 = new int[5];
		a5 = new int[10];
		
		int a6[], a7;
		a6 = new int[20];
		a7 = 10; // a7 is just a regular integer
		
		int[] a8 = new int[5];
		int a9[] = new int[5];
		
		int[] a10 = {1,2,3,4,5};
		int a11[] = {1,2,3,4,5};
		
		int[][] arr1 = new int[3][4]; // 3 1-D Arrays with each Array having 4 elements
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		arr1[0][3] = 40;
		//.....
		//.....
		arr1[2][3] = 100;
		
		int[][] arr2 = new int[3][]; // 3 1-D Arrays but size is decided later
		arr2[0] = new int[5];  // 0th Array will have 5 elements
		arr2[1] = new int[10]; // 1st Array will have 10 elements
		arr2[2] = new int[15]; // 2nd Array will have 15 elements
		
		int[] array = {10,20,30,40,50};
		//System.out.println(array[30]); // error at run time
		
	}

}
