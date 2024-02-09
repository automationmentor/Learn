package coreJava;
import java.util.*;

public class ArrayListExample {
	
	public static void main(String args[])
	{
	
	List<String> obj = new ArrayList<String>();
	obj.add("one");
	obj.add("two");
	obj.add("three");
	obj.add("four");	
	obj.add("five");
	obj.add("six");
	obj.add("seven");
	obj.add("eight");
	obj.add("nine");
	obj.add("ten");
	obj.add("ten");
	
	
	System.out.println(obj);
	obj.remove("ten");
	
	System.out.println(obj);
	System.out.println(obj.get(0));
	System.out.println(obj.contains("ten"));
	
    /* Advanced For Loop*/ 		
    System.out.println("Advanced For Loop"); 		
    for (String counter : obj) { 		      
         System.out.println(counter); 	
         if (counter.contains("two"))
         System.out.println("found two in the list");
    }
	
    /* For Loop for iterating ArrayList */
    System.out.println("For Loop");
    for (int counter = 0; counter < obj.size(); counter++) { 		      
        System.out.println(obj.get(counter)); 		
    }  
	
    /* Sort statement*/
    System.out.println("sorted array list in ascending order");
	   Collections.sort(obj);
	   System.out.println(obj);
	   
	    /* Sort statement*/
	    System.out.println("sorted array list in descending order");
		   Collections.sort(obj);
		   Collections.reverse(obj);
		   System.out.println(obj);   

			List<String> obj2 = new ArrayList<String>();
			obj.add("eleven");
			obj.add("twelve");
			obj.add("thirteeb");
			obj.add("fourteen");	
			obj.add("fifteen");
	//Append Collection elements to ArrayList
	obj.addAll(obj2);
	
	System.out.println("after adding obj with obj2");
	System.out.println(obj);
	
	//Sublist to ArrayList
    ArrayList<String> al2 = new ArrayList<String>(obj.subList(1, 4));
    System.out.println("SubList stored in ArrayList: "+al2);
	   
	
	}// end of main method
	
	

}// end of class
