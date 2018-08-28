
public class Loops {

	public static void main(String[] args) {
		
		int num = 7;
		int i = 1;
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i->2
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i->3
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i->4
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i->5
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i->6
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i->7
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i->8
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i->9
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i->10
		
		System.out.println(num+" "+i+"'s are "+(num*i));

		// Use Loops and save time to write repetitive code !!
		// 1. while loop
		System.out.println("======while Loop=====");
		num = 11;
		i = 100;
		
		while(i<=10){ // till condition is true loop shall work. condition checking happens before we enter
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}
		
		// 2. do while loop
		// executed once even condition is false
		System.out.println("======do while Loop=====");
		num = 15;
		i = 100;
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}while(i<=10); // till condition is true loop shall work. condition checking happens before we exit
		
		//3. for loop
		System.out.println("======for Loop=====");
		// for(initializations ; condition ; expression){ //.. }
		for(num=17,i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}

}
