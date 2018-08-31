
public class BufferAndBuilder {

	public static void main(String[] args) {
		
		// IMMUTABLE - String cannot be modified
		String str = new String("John");
		String newStr = str.concat(" Watson");
		
		// MUTABLE - String can be modified and THREAD-SAFE
		StringBuffer buffer = new StringBuffer("Jennie");
		buffer.append(" Watson");

		// MUTABLE and NOT THREAD-SAFE
		StringBuilder builder = new StringBuilder("Jack");
		builder.append(" Watson");

		System.out.println("str is: "+str);
		System.out.println("newStr is: "+newStr);
		System.out.println("buffer is: "+buffer);
		System.out.println("builder is: "+builder);
		
		
		// StringBuffer and StringBuilder are always Object Way and not interned
		//StringBuffer buf = "Hello";  // err
		//StringBuilder bld = "Hello"; // err
	}

}
