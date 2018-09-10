package co.edureka;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class MyHandler extends DefaultHandler{
	
	public void startDocument() throws SAXException {
		System.out.println("==Document Parsing Started==");
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("<"+qName+">");
	}
	

	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch,start,length);
		System.out.print(data);
	}
	

	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}
	
	public void endDocument() throws SAXException {
		System.out.println("==Document Parsing Ended==");
	}
	
}

public class SAXReader {

	public static void main(String[] args) {
		try {
			
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yy");
			String today = sdf.format(date);
			
			File file = new File("/Users/ishantkumar/Downloads/employees_"+today+".xml");
			
			MyHandler handler = new MyHandler();
			FileInputStream inputStream = new FileInputStream(file);
			
			//SAXParserFactory factory = SAXParserFactory.newInstance().
			//SAXParser parser = factory.newSAXParser();
			
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			parser.parse(inputStream, handler);
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}

	}

}
