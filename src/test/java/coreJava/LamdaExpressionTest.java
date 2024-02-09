package coreJava;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;


public class LamdaExpressionTest {
	
	public static void main(String[] args)
	{	
		// Array
		int[] list ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// ArrayList
		List<String> arrayListObject=new ArrayList<String>();
		arrayListObject.add("one");
		arrayListObject.add("two");
		arrayListObject.add("three");
		
		// Hashtable
		Map<String,String> mapObject=new Hashtable<String,String>();
		mapObject.put("key1", "value1");
		mapObject.put("key2", "value2");
		mapObject.put("key3", "value3");
		mapObject.put("key4", "value4");
		mapObject.put("key5", "value5");
		
		
		
		System.out.println("Using labda expression:ArrayList");
		
		arrayListObject.forEach((b)->System.out.println(b));
		
		
		// Using lamda expression
		System.out.println("Using labda expression:Map");
		mapObject.forEach((key,value) -> System.out.println(key + " = " + value));
		
	}
}

