package co.edureka;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.glassfish.jersey.servlet.ServletContainer; // Configure it in web.xml file

/*
// Marker Annotation
@interface MyAnnotation{
	String name() default "John";
}

@MyAnnotation(name="Jack")
*/

@Path("/hello")
public class Hello { // Web Service
	
	//ServletContainer -> Configure it in web.xml file

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello(){ // Web Method
		Date date = new Date();
		String response = "Hello !! Its "+date;
		return response; // PLAIN TEXT as response
	}
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){ // Web Method
		Date date = new Date();
		String response = "<html><body><h3>Hello from HTML !! Its "+date+"</h3></body></html>";
		return response; // HTML as response
	}
	
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){ // Web Method
		Date date = new Date();
		String response = "<?xml version='1.0' encoding='UTF-8'?><hello>Hello from XML !! Its "+date+"</hello>";
		return response; // XML as response
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){ // Web Method
		Date date = new Date();
		String response = "{'message':'Hello from JSON !!', 'dateTimeStamp':'"+date+"'}";
		return response; // JSON as response
	}
	
}
