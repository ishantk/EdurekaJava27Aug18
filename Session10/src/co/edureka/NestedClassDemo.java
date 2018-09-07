package co.edureka;

class Outer{
	
	void show(){
		System.out.println("This is show of Outer");
	}
	
	// Nested or Inner Class in Java
	class Inner{
		void show(){
			System.out.println("This is show of Inner");
		}
	}
}


class CA{
	
	public class CD{
		
	}
	
	private class CB{ 
		
	}

	protected class CC{ 
		
	}
	
	static class CE{
		
	}
	
}

/*
private class CB{ error
	
}

protected class CC{ error
	
}
*/

public class NestedClassDemo {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		oRef.show();
		
		Outer.Inner iRef = oRef.new Inner();
		iRef.show();
		

	}
}
