package Algo;

import java.util.Arrays;

public class Test1 {
	
	
	public static int getFactorial(int num)
	{
		int factorial=1;
		for(int x=1;x<=num;x++)
		{
			factorial=factorial*x;
		}
		return factorial;
	}
	
	
	
	public static void main(String args[])
	{
		System.out.println("Java programs");
		
		System.out.println("factorial of 5 is:"+getFactorial(5));  // sysout then control+space
	
		System.out.println("Sorting of array and find largest, smallest and second highest:");
		int[] arr= {5,2,6,1,7,9,3};
		for(int x=0;x<arr.length;x++)
		{
			
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]>arr[y])
				{
					int temp=arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		int arrayLenght=arr.length-1;
		System.out.println("largest number is:"+arr[arrayLenght]);
		System.out.println("Smallest number is:"+arr[0]);
		System.out.println("second largest number is:"+arr[arrayLenght-1]);
		
		
		System.out.println("Print triangles:");
		
		for(int x=1;x<6;x++)
		{
			System.out.println();
			for(int y=1;y<=x;y++)
			{
				System.out.print(x);
			}
		}
		
		for(int x=1;x<6;x++)
		{
			System.out.println();
			for(int y=1;y<=x;y++)
			{
				System.out.print(y);
			}
		}
		
		System.out.println("string reverse:");
		String name="Harsh";
		System.out.println("original name:"+name);
		StringBuffer reverseName=new StringBuffer(name);
		for(int x=0,y=name.length()-1;x<name.length();x++,y--)
		{
			char temp=name.charAt(y);
			reverseName.setCharAt(x, temp);
		}
		System.out.println("reverse name:"+reverseName);
		
		
		System.out.println("fibonacci series:");
		int n1=0;
		int n2=1;
		int n3;
		System.out.println(n1);
		System.out.println(n2);
		for(int x=2;x<10;x++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
		
		System.out.println("Prime numbers:");
		boolean flag=true;
		int count=1;
		for(int x=1;x<10;x++)
		{
			for(int y=2;y<=x;y++)
			{
				if(x%y==0)
				{
					flag=false;
					System.out.println("this is not prime:"+x);
				}
			}
			if(flag)
				System.out.println(x);
		}
	} // end of main method

}// end of class
