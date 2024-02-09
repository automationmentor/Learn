package Algo;

import java.util.Arrays;
import java.util.Collections;

public class sortNumbers {
	
	public static void main(String args[])
	{
		int arr[]={1,60,5,56,20};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		// sort in reverse order
		Integer arr1[]={1,60,5,56,20};
		Arrays.sort(arr1, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr1));
		
		
		String arr2[] = {"practice.geeksforgeeks.org",
                "quiz.geeksforgeeks.org",
                "code.geeksforgeeks.org"
               };

// Sorts arr[] in ascending order
Arrays.sort(arr2);
System.out.println(Arrays.toString(arr2));

// Sorts arr[] in descending order
Arrays.sort(arr2, Collections.reverseOrder());

System.out.println(Arrays.toString(arr2));

System.out.println("sort array with code:");
int x[]={1,60,5,56,20};
int temp;

for(int a=0;a<x.length;a++)
{
	
	for(int b=a+1;b<x.length;b++)
	{
		if(x[a]>x[b])
		{
			temp=x[a];
			x[a]=x[b];
			x[b]=temp;
		} // end of if
			
			
	} // end of inner for
} // end of external for

System.out.println(Arrays.toString(x));

System.out.println("sort abcd");
char[] mychar= {'z','x','y','d','b','a'};
Arrays.sort(mychar);
System.out.println(Arrays.toString(mychar));
		
	}
	
	}
