package coreJava;

public class ForLoop {
	
	public static void main(String args[])
	{
		outerloop:
		for(int i=0;i<10;i++)
		{
			System.out.println("i:"+i);
			
			for(int j=1;j<5;j++)
			{
				System.out.println("j:"+j);
				if(j==3) break outerloop;
			}
		
		}

	}
}
