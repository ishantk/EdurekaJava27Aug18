final class X{ // cannot inherit from final class
	// final is a method which cannot be oerridden
	final void fun(){
		
	}
}

class Y{ //extends X{
	/*void fun(){ // overriding the method pf parent in child
		
	}*/
}

public class FinalDemo {

	public static void main(String[] args) {
		
		int i = 10;
		i = 100;
		
		// final variable is the one whose value cannot be modified
		final int j = 10;
		// j = 100; // error

	}

}
