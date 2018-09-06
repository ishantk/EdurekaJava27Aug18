package co.edureka;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

class Employee{
	
	// Attributes
	int eid;
	String name;
	int salary;
	String email;
	String address;
	
	// Method
	String getCSVData(){
		String data = eid+","+name+","+salary+","+email+","+address+"\n";
		return data;
	}
	
}

public class FileIODemo {

	void writeDataInFile(Employee eRef){
		
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/employees.txt");
			
			/*if(file.exists()){
				System.out.println(file.getName()+" Exists !!");
			}else{
				System.out.println(file.getName()+" Does Not Exists !!");
			}
			
			if(file.isDirectory()){ // checking for a folder
				
			}
			if(file.isFile()){ // checking for a file
				
			}*/
			
			//File file = new File("/Users/ishantkumar/Downloads/employees.txt");
			File file = new File("/Users/ishantkumar/Downloads/employees.csv");
			// Write Operation in the form of Bytes
			//FileOutputStream fos = new FileOutputStream(file); // It will overwrite the old data with new one
			FileOutputStream fos = new FileOutputStream(file, true); // true-> enable append mode. 
			fos.write(eRef.getCSVData().getBytes()); // Stream of bytes
			fos.close();
			System.out.println("==Data Written==");
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
		
	}
	
	void writeDataInFileAgain(Employee eRef){
		try{
			File file = new File("/Users/ishantkumar/Downloads/employeesagain.csv");
			// Write Operation in the form of Text
			//FileWriter writer = new FileWriter(file); // Overwrite the old data with new one
			FileWriter writer = new FileWriter(file, true); // true-> enable append mode.
			writer.write(eRef.getCSVData()); // String -> Stream of Characters
			writer.close();
			System.out.println("==Data Written==");
		}catch(Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void readFromFile(){
		try {
			File file = new File("/Users/ishantkumar/Downloads/WrapperDemo.java");
			// Read Operation in the form of Bytes
			FileInputStream fis = new FileInputStream(file);
			
			int i = 0;
			
			while( (i = fis.read()) != -1 ){ // -1 is end of file
				char ch = (char)i;
				System.out.print(ch);
			}
			
			fis.close();
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void readFromFileAgain(){
		try {
			File file = new File("/Users/ishantkumar/Downloads/WrapperDemo.java");
			// Read Operation in the form of Text
			FileReader reader = new FileReader(file);
			// IO Chaining
			BufferedReader buffer = new BufferedReader(reader); // we can read data line by line
			
			String line = "";
			int count = 0;
			while( (line=buffer.readLine()) != null ){
				System.out.println(line);
				
				if(line.contains("new")){
					count++;
				}
			}
			
			System.out.println("Total Object constructed are "+count);
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.eid = 101;
		emp1.name = "John";
		emp1.salary = 30000;
		emp1.email = "john@example.com";
		emp1.address = "Redwood Shores";
		
		Employee emp2 = new Employee();
		emp2.eid = 201;
		emp2.name = "Jennie";
		emp2.salary = 50000;
		emp2.email = "jennie@example.com";
		emp2.address = "Country Homes";
		
		FileIODemo fRef = new FileIODemo();
		
		// To store the data permanently in the file:
		//fRef.writeDataInFile(emp2);
		//fRef.writeDataInFileAgain(emp1);
		//fRef.writeDataInFileAgain(emp2);
		
		
		// Read a CSV File and Create an Employee Object !!
		//fRef.readFromFile();
		//fRef.readFromFileAgain();

	}

}
