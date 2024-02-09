package coreJava;

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
		
	}
	
	}
