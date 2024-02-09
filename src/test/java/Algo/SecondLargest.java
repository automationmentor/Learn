package Algo;

import java.util.Arrays;

public class SecondLargest {
	 
	public static void main(String[] args) {
 
		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
//		int largest = arr[0];
//		int secondLargest = arr[0];
//		
//		for (int i = 0; i < arr.length; i++) { 
//			if (arr[i] > largest) {
//				secondLargest = largest;
//				largest = arr[i]; 
//			} else if (arr[i] > secondLargest) {
//				secondLargest = arr[i]; 
//			}
//		} 
//		System.out.println("\nSecond largest number is:" + secondLargest);
 
		int largest=arr[0];
		int secondLargest=arr[0];
		for(int x=0;x<arr.length;x++) 
		{
			
			if(arr[x]>largest)
			{
				secondLargest=largest;
				largest=arr[x];
				
			}
			else if(arr[x]>secondLargest)
			{
				secondLargest=arr[x];
			}
		} // end of for loop
		System.out.println("Largest:"+largest);
		System.out.println("SecondLargest:"+secondLargest);
		
		
		Arrays.sort(arr); 
		System.out.println("Largest:"+arr[arr.length-1]);
		System.out.println("SecondLargest:"+arr[arr.length-2]);
		
	}// end of main function
}// end of class
