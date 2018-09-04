package co.edureka.exceptions;

public class App {

	public static void main(String[] args) {
		System.out.println("==App Started==");

		int[] arr = {10,20,30,40,50};
		int a=10, b=0, c=0;
		
		try{
			System.out.println("arr[2] is: "+arr[2]);
			c = a/b;
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println("OOPS !! Something Went Wrong !!");
		}catch(ArithmeticException aRef){
			System.out.println("OOPS !! Something Went Wrong !!");
		}*/
		catch(Exception e){
			System.out.println("OOPS !! Something Went Wrong !!");
		}finally{
			System.out.println("This is important");
		}
		
		
	
		System.out.println("c is: "+c);
		
		
		System.out.println("==App Finished==");
	}

}
