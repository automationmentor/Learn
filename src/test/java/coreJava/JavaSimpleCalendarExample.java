package coreJava;
import java.util.Calendar;
public class JavaSimpleCalendarExample {
	public static void main(String[] args) {
		   
	    //use getInstance() method to get object of java Calendar class
	    Calendar cal = Calendar.getInstance();
	   
	    //use getTime() method of Calendar class to get date and time
	    System.out.println("Today is : " + cal.getTime());  
	 
	  }
}
