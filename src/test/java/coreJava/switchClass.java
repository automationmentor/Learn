package coreJava;
import java.util.Scanner;


public class switchClass {

	public static void main(String[]args)
	{
		
		Scanner in=new Scanner(System.in);		
		System.out.print( "Enter your marks: "  );
		int marks =in.nextInt();
		switch(marks)
		{
			
		case 25:
			System.out.println("D Grade");
			break;
			
		case 50:
			System.out.println("C Grade");
			break;
		case 75:
			System.out.println("B Grade");
			break;
		case 100:
			System.out.println("A Grade");
			break;
		default:
			System.out.println("invalid marks");
		}		
		
	}
}
