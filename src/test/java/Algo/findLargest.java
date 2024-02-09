package Algo;
public class findLargest {
	
	public static void main(String args[])
	{

	int a=1;
	int b=2;
	int c=3;
	
	if(a>b && a>c)
	{
		System.out.println("a is largest");
	}
	else if(b>a && b>c)
	{
		System.out.println("b is largest");
	}
	else
	{
		System.out.println("c is largest");
	}		

	
	int arr[]={1,2,3,4,5,6,7,8};
	
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}		
	}
	
	System.out.println("max is:"+max);
	
	int min=arr[0];
	for(int h=0;h<arr.length;h++)
	{
		if(arr[h]<min) min=arr[h];
	}
	
	System.out.println("min is:"+min);
}
}
