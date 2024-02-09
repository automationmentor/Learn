package coreJava;
import java.util.*;

public class HashtableExample {
	
	public static void main(String args[])
	{
	// Creating a Hashtable
	Hashtable<String, String> hashtable1 =  new Hashtable<String, String>();
	   // Adding Key and Value pairs to Hashtable	   
	   hashtable1.put("Key1","Chaitanya");
	   hashtable1.put("Key2","Ajeet");
	   hashtable1.put("Key3","Peter");
	   hashtable1.put("Key4","Ricky");
	   hashtable1.put("Key5","Mona");
//	   hashtable1.remove("Key1");
//	   
//	   System.out.println(hashtable1);
	   
	   Enumeration keys;
	   Enumeration values;
//	   String key;
	   keys = hashtable1.keys();
	   values=hashtable1.elements();
	   
	   while(keys.hasMoreElements())
	   {
		   System.out.println(keys.nextElement()+","+values.nextElement());
	   }
	   
//	   Hashtable<String, String> hashtable2 =  new Hashtable<String, String>();
//	   // Adding Key and Value pairs to Hashtable	   
//	   hashtable2.put("Key1","Chaitanya");
//	   hashtable2.put("Key2","Ajeet");
//	   hashtable2.put("Key3","Peter");
//	   hashtable2.put("Key4","Ricky");
//	   hashtable2.put("Key5","Harsh");
//	   
//	   System.out.println(hashtable1.equals(hashtable2));

		   
	 

	   
	   
	   
	}// end of main	 

}// end of class
