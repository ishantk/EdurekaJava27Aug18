package co.edureka;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

class Employee{
	
	int eid;
	String name;
	int salary;
	
	Employee() {
	
	}
	
	Employee(int e, String n, int s) {
		eid = e;
		name = n;
		salary = s;
	}
}

public class DOMWriter {

	public static void main(String[] args) {
	
		//Scanner scanner = new Scanner(System.in);
		//Read from console and create Employee Object
		
		// Employee Object is temporary i.e. in the Heap of RAM
		Employee emp = new Employee(101,"John",30000);
		
		// Persist the data -> Using XML 
		try {
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // SingleTon Design Pattern
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument(); // Document as a Tree data structure
			
			Element elmRoot = document.createElement("employees");
			Element elmEmp = document.createElement("employee");
			Element elmEid = document.createElement("eid");
			Element elmName = document.createElement("name");
			Element elmSalary = document.createElement("salary");
			
			Text txtEid = document.createTextNode(String.valueOf(emp.eid));
			Text txtName = document.createTextNode(emp.name);
			Text txtSalalry = document.createTextNode(String.valueOf(emp.salary));
			
			elmEid.appendChild(txtEid);
			elmName.appendChild(txtName);
			elmSalary.appendChild(txtSalalry);
			
			elmEmp.appendChild(elmEid);
			elmEmp.appendChild(elmName);
			elmEmp.appendChild(elmSalary);
			
			elmRoot.appendChild(elmEmp);
			
			document.appendChild(elmRoot);
			
			// Source which must be converted to XML File
			DOMSource source = new DOMSource(document);
			
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yy");
			String today = sdf.format(date);
			
			File file = new File("/Users/ishantkumar/Downloads/employees_"+today+".xml");
			FileOutputStream outputStream = new FileOutputStream(file);
			StreamResult result = new StreamResult(outputStream);
			
			//TransformerFactory tFactory = TransformerFactory.newInstance();
			//Transformer transformer = tFactory.newTransformer();
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			
			// Transformer shall generate XML File
			transformer.transform(source, result);
			
			System.out.println("==XML Data Written==");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}

}
