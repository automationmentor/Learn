package coreJava;
import java.util.*;

public class ArrayListBook {
	int id;  
	String name,author,publisher;  
	int quantity;  
	
	public ArrayListBook(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}  
	
	public static void main(String args[])
	{
		//Creating list of Books  
		List<ArrayListBook> list=new ArrayList<>();
//		List<ArrayListBook> list=new LinkedList<>();
		
		//Creating Books  
		ArrayListBook b1=new ArrayListBook(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		ArrayListBook b2=new ArrayListBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		ArrayListBook b3=new ArrayListBook(103,"Operating System","Galvin","Wiley",6);  
		
	    //Adding Books to list  
	    list.add(b1);  
	    list.add(b2);  
	    list.add(b3);  
	    
	    // advanced for
	    System.out.println("Book list:");
	    for(ArrayListBook counter:list)
	    {
	    	System.out.println(counter.author+","+counter.id+","+counter.name);
	    }
	    
	    System.out.println("-----------------------------");
	    
	    // lamda expression
	    list.forEach(
	    		(a)->System.out.println(a.id+","+a.name+","+a.author+","+a.publisher+","+a.quantity));
	    
	    
//	    for(ArrayListBook counter:list)
//	    {
//	    	System.out.println(counter.author+","+counter.id+","+counter.name);
//	    	if(counter.author.equals("Yashwant Kanetkar"))
//	    	{
//	    		System.out.println("found:----------------------------L Let us C");
//	    	}
//	    }
//	   
	    
		
	}
}  

