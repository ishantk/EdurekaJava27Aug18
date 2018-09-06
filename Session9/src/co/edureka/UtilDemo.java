package co.edureka;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilDemo {

	public static void main(String[] args) {
		
		Date date = new Date();
		// Printing the reference variable may give you something else than address !!
		// Why So ? Because toString method is overrided !!
		System.out.println("Today is: "+date);
		System.out.println("\nWith toString:");
		System.out.println("Today is: "+date.toString());
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat("hh:mm:ss");
		String formattedDate1 = format1.format(date);
		String formattedDate2 = format2.format(date);
		System.out.println("Formatted Date1 is: "+formattedDate1);
		System.out.println("Formatted Date2 is: "+formattedDate2);
		
		Calendar calendar = Calendar.getInstance();
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		int mm = calendar.get(Calendar.MONTH); // 0 to 11 i.e. Jan to Dec
		int yy = calendar.get(Calendar.YEAR);
		
		System.out.println("Date from Calendar: "+dd+"/"+(mm+1)+"/"+yy);

	}

}
