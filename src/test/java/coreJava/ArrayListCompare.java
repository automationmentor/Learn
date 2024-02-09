package coreJava;
import java.util.*;


public class ArrayListCompare {
	// compare two array list
	public static void main(String args[])
	{
		ArrayList<String> A=new ArrayList<>();
		ArrayList<String> B=new ArrayList<>();
		ArrayList<String> C=new ArrayList<>();
		
		A.add("one");
		A.add("two");
		A.add("three");
		A.add("five");
		A.add("four");
		
		B.add("one");
		B.add("two");
		B.add("three");
		B.add("four");
		B.add("five");
		
		
		for(String counter:A)
		{
			C.add(B.contains(counter)? "true":"false");
		}
		
		System.out.println(C);
//		System.out.println(A.equals(B));
		

		
		
		A.forEach((a)->System.out.println(a));	
		System.out.println("------------------");
		B.forEach((a)->System.out.println(a));
		
		System.out.println("Comare a with B:"+A.equals(B));
		
		
		System.out.println("----------Harsh Testing---------");
		for(String counter:A)
		{
			System.out.println(counter);
			if(counter.equals("one"))
			{
				System.out.println("Found one");
				break;
			}
					
			
		}
		
		
	}

}
