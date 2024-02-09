package coreJava;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadAndPrintScores
{
    public static void main(String[] args)
    {	
    	try
    	{   
    	Scanner s = new Scanner( new File("D:\\Work\\out.txt") );
	    while( s.hasNextInt() )
	    {	
	    System.out.println( "inside hasNextInt");
	    System.out.println( s.nextInt() );
	    }
	    
	    while( s.hasNextLong() )
	    {	System.out.println( "inside hasNextLong");
	    	System.out.println( s.nextLong() );
	    }
	    
	    while( s.hasNextDouble() )
	    {	System.out.println( "inside hasNextDouble");
	    	System.out.println( s.nextDouble() );
	    }
	    
	    while( s.hasNextLine() )
	    {	System.out.println( "inside hasNextLine");
	    	System.out.println( s.nextLine() );
	    }
	}
    	catch(IOException e)
	{	System.out.println( e );
	}
    }
}