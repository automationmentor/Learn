package coreJava;
import java.util.*;
public class myArrayList {
	
	public static void main(String args[])
	{
		int myIntArray[]=new int[4];
		myIntArray[0]=0;
		myIntArray[1]=1;
		myIntArray[2]=2;
		myIntArray[3]=3;		
		
		System.out.println("myIntArray:");
		for(int i=0;i<myIntArray.length;i++)
		{
			System.out.println(myIntArray[i]);
		}
		
		int myIntArray1[]={0,1,2,3};
		System.out.println("myIntArray1:");
		for(int i=0;i<myIntArray1.length;i++)
		{
			System.out.println(myIntArray1[i]);
		}
		
		int myIntArray2[][]={
							{0,0,0,0},
							{1,1,1,1}
							};
		
		// Arraylist
		ArrayList <String> myArrayList1=new ArrayList<String>();
		myArrayList1.add("one");
		myArrayList1.add("two");
		myArrayList1.add("three");
		myArrayList1.add("four");
		myArrayList1.add("five");
		
		System.out.println("myArrayList1:");
		for(int i=0;i<myArrayList1.size();i++)
		{
			System.out.println(myArrayList1.get(i));
		}
		
		System.out.println("does myArrayList1 contains three:"+myArrayList1.contains("three"));
		System.out.println("does myArrayList1 contains seven:"+myArrayList1.contains("seven"));
		
		
		ArrayList <Integer> myArrayList2=new ArrayList<Integer>();
		myArrayList2.add(1);
		myArrayList2.add(2);
		myArrayList2.add(3);
		myArrayList2.add(4);
		myArrayList2.add(5);
		
		System.out.println("myArrayList2:");
		for(int i=0;i<myArrayList2.size();i++)
		{
			System.out.println(myArrayList2.get(i));
		}
		
	} // end of main method

}// end of class
