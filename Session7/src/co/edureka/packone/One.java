package co.edureka.packone;

// One is public
public class One {

	private void pvtShow(){
		System.out.println("This is private show of One");
	}
	
	void defShow(){
		System.out.println("This is default show of One");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println("This is public show of One");
	}
	
}

// Two is default (default is no access modifier)
class Two{
	
	private void pvtShow(){
		System.out.println("This is private show of Two");
	}
	
	void defShow(){
		System.out.println("This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println("This is public show of Two");
	}
	
}

// private class not allowed
/*private class Three{
	
}*/

//protected class not allowed
/*protected class Four{
	
}*/

// In the same Source File we can create n number of default classes
class Five{
	
}

// In one source file thr can be only one public class
// Why? Since Java saves the source file with same name as that of public class name
/*public class Six{
	
}*/