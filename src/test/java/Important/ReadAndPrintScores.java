package Important;
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