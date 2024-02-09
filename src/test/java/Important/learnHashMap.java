package Important;

import java.util.HashMap;
import java.util.Map;

public class learnHashMap {

	public static void main(String[] args)
	{	
		
		// Hashtable
		Map<String,String> mapObject1=new HashMap<String,String>();
		mapObject1.put("Harsh", "1000");
		mapObject1.put("Sachin", "2000");
		mapObject1.put("Archis", "5000");
		mapObject1.put("Tatsat", "8000");
		mapObject1.put("Samidha", "10000");
		
		System.out.println(mapObject1);
		
		// print map
		
		for (Map.Entry<String, String> counter : mapObject1.entrySet()) {
		    System.out.println(counter.getKey() + " = " + counter.getValue());
		}
		
		// Using lamda expression
//		System.out.println("Using labda expression");
//		mapObject1.forEach((key,value) -> System.out.println(key + " = " + value));
		
		Map<String,String> mapObject2=new HashMap<String,String>();
		mapObject2.put("Harsh", "1000");
		mapObject2.put("Sachin", "2000");
		mapObject2.put("Archis", "5000");
		mapObject2.put("Tatsat", "8000");
		mapObject2.put("Samidha", "10000");
		System.out.println(mapObject2);
		
		// compare two maps
		System.out.println(mapObject1.equals(mapObject2));

		
	}
}

