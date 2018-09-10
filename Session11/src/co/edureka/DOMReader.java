package co.edureka;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMReader {

	public static void main(String[] args) {
		try {
			
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yy");
			String today = sdf.format(date);
			
			File file = new File("/Users/ishantkumar/Downloads/employees_"+today+".xml");
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // SingleTon Design Pattern
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file);
			
			System.out.println("Root Element is: "+document.getDocumentElement().getNodeName());
			
			NodeList nodeList = document.getElementsByTagName("employee");
			System.out.println("Number of Elements with tag employee: "+nodeList.getLength());
			
			for(int i=0;i<nodeList.getLength();i++){
				Node node = nodeList.item(i);
				Element element = (Element)node; // Node is parent for Element
				System.out.println("Eid: "+element.getElementsByTagName("eid").item(0).getTextContent());
				System.out.println("Name: "+element.getElementsByTagName("name").item(0).getTextContent());
				System.out.println("Salalry: "+element.getElementsByTagName("salary").item(0).getTextContent());
				System.out.println("************************");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}

	}

}
