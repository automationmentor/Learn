package Algo;

import java.util.Arrays;

public class Test2 {
	
	
	public static int factorial(int num)
	{
		int factorial=1;
		
		for(int x=1;x<=num;x++)
		{
			factorial=factorial*x;
		}
		return factorial;
	}
	
	public static void main(String[] args) {
		System.out.println("Testing of algorithims:");
		System.out.println("factorial for 5 is:" +factorial(5));
		
		int numbers[]= {3,2,1,10,5,4};
		System.out.println("unsorted number:"+Arrays.toString(numbers));
		
		for(int x=0;x<=numbers.length;x++)
		{
			for(int y=x+1;y<numbers.length;y++)
			{
				if(numbers[x]>numbers[y])
				{
					int temp=numbers[x];
					numbers[x]=numbers[y];
					numbers[y]=temp;
				}
			}
		}
		System.out.println("sorted numbers:"+Arrays.toString(numbers));
		System.out.println("length of numbers array:"+numbers.length);
		System.out.println("smallest number:"+numbers[0]);
		System.out.println("largest number:"+numbers[numbers.length-1]);
		System.out.println("second largest number:"+numbers[numbers.length-2]);
		
		System.out.println("Print triangles");
		
		for(int x=1;x<=5;x++)
		{
			System.out.println();
			
			for(int y=1;y<=x;y++)
			{
				System.out.print(x);
			}
		}
		
		for(int x=1;x<=5;x++)
		{
			System.out.println();
			
			for(int y=1;y<=x;y++)
			{
				System.out.print(y);
			}
		}
		
		System.out.println();
		System.out.println("String reverse");
		String name="ABCDEFG";
		StringBuffer reverseName=new StringBuffer(name);
		for(int x=0,y=name.length()-1;x<name.length();x++,y--)
		{
			char temp=name.charAt(y);
			reverseName.setCharAt(x, temp);
		}
		System.out.println(reverseName);
		
		System.out.println("Find words in a string:");
		String longString="Hello I am Harsh";
		String[] words=longString.split(" ");
		System.out.println(words.length);
		
		System.out.println("Fibonacci series");
		
	}

}
