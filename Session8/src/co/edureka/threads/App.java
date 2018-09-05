package co.edureka.threads;

/*class MyTask{
	void executeTask(){
		for(int i=1;i<=10;i++){
			System.out.println("**MyTask** "+i);
		}
	}
}*/

class MyTask extends Thread{
	public void run(){
		System.out.println("MyTask State4 "+getState());
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("**MyTask** "+i);
		}
	}
}

class CA{
	
}

//class YourTask extends CA,Thread{ // Multiple Inheritance is not supported in Java
class YourTask extends CA implements Runnable{ 
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("$$YourTask$$ "+i);
		}
	}
}

public class App {

	// When we run the program, main will be executed automatically !!
	// Whatever is written in the main is executed sequentially i.e. one after the other !!
	public static void main(String[] args) {
		
		System.out.println("==App Started==");
		
		// Till MyTask will not finish its execution, main's instruction they will be blocked and they will execute after it !!
		//MyTask mRef = new MyTask();
		//mRef.executeTask();
		
		// Multi Threading helps us achieve asynchronization i.e. parallel execution
		
		// Now, MyTask is a Thread
		// MyTask is running parllely to the main thread
		MyTask mRef = new MyTask();
		
		System.out.println("MyTask State1 "+mRef.getState());
		
		Runnable r = new YourTask(); // Polymorphic Statement
		Thread yRef = new Thread(r);
				
		mRef.setName("John");
		mRef.setPriority(Thread.MAX_PRIORITY);  // 10
		
		yRef.setName("Jennie");
		yRef.setPriority(Thread.NORM_PRIORITY); // 5
		
		Thread.currentThread().setName("Jack");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // 1
		
		mRef.start(); // start method will internally execute run method. Since thread has state management so we call start rather than run
		System.out.println("MyTask State2 "+mRef.getState());
		try {
			mRef.join(); // execute my tasks and let others wait !! executed immediately after start !!
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("MyTask State3 "+mRef.getState());
		
		yRef.start();
		
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(2000); // 2secs
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("==Main== "+i);
		}
		
		System.out.println("mRef name is: "+mRef.getName()+" and Priority is: "+mRef.getPriority());
		System.out.println("yRef name is: "+yRef.getName()+" and Priority is: "+yRef.getPriority());
		System.out.println("main name is: "+Thread.currentThread().getName()+" and Priority is: "+Thread.currentThread().getPriority());
		
		System.out.println("==App Finished==");
	}

}
