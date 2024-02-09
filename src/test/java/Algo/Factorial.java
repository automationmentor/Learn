package Algo;
public class Factorial {

	public static void main(String[] args)
	{
		int numbers=5;
		
		for(int i=0;i<numbers;i++)
				System.out.println("Factorial of "+i+" is:"+factorial(i));
		
	}
	
	public static long factorial(int n)
	{
		long result=1;
		for(int i=1;i<=n;i++)
			result=result*i;
		return result;
	}
}

