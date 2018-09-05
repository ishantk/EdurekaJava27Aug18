package co.edureka.threads;

class Message{
	
	String message  = "==No Message Available==";
	
	void writeMessage(String m){
		message = m;
		System.out.println(">>Message Written<<");
	}
	
	void readMessage(){
		System.out.println("**Message is: "+message+"**");
	}
}

class ReaderThread extends Thread{
	
	Message m;
	
	ReaderThread(Message n){
		m = n;
	}
	
	public void run(){
		synchronized (m) { // no other thread can perform anything on m, since lock shall be acquired
			
			try {
				m.wait(); // waiting to be notified for further execution on m
				//m.wait(1000); // wait for only 1 second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			m.readMessage(); 
		}
	}
}

class WriterThread extends Thread{
	
	Message m;
	
	WriterThread(Message n){
		m = n;
	}
	
	public void run(){
		synchronized (m) { // no other thread can perform anything on m, since lock shall be acquired
			m.writeMessage("Be Exceptional !!");
			//m.notify(); // who so ever is waiting on object m shall be notified
			m.notifyAll();
		}
	}
}

public class WNDemo {

	public static void main(String[] args) {
		
		Message m = new Message();

		// Read and Write Operations must be performed by separate threads !!
		// Reader and Writer are working on same object i.e. is pointed by m
		ReaderThread rt1 = new ReaderThread(m);
		ReaderThread rt2 = new ReaderThread(m);
		WriterThread wt = new WriterThread(m);
		
		rt1.start();
		rt2.start();
		wt.start();
		
	}

}
