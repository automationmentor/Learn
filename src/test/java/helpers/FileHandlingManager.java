package helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.apache.log4j.Logger;
import com.google.common.io.Files;


// This class is used to do any file handling related operation like checking if a file exists or finding a text
// in a file
public class FileHandlingManager {
	
//	public FileHandling()
//	{
//		Logger log=new IntuitionLogger().getLogger();
//		log.info("Inside FileHandling default constructor");
//	}
	
	// method to check if a given text is present in a file
	public static boolean isTextPresentInFile(File fileObject, String textToSearch) throws Exception
	{
		Logger log=new LoggerManager().getLogger();
		
		boolean foundflag=false;
		try
		{
		log.info("Inside FileHandling:isTextPresentInFile:Searching the text "+textToSearch+" in a file");	
		Scanner scanner = new Scanner(fileObject);		
		while (scanner.hasNextLine()) {
			   String lineFromFile = scanner.nextLine();
			   if(lineFromFile.contains(textToSearch)) {
				// a match!
				   foundflag=true;
				   log.info("Inside FileHandling:isTextPresentInFile:Search text" +textToSearch+" found in a file");					
			       break;
			   }
			} 
		scanner.close();
		return foundflag;
		}
		catch(Exception e)
		{
			log.error("Inside FileHandling:isTextPresentInFile:Error in Searching the text "+textToSearch+" in a file");			
			return foundflag;
		}
	}
	
	// method to replace a old string with a new string in a file
	public static void modifyFile(File fileObject, String oldText, String newText)
    {
		Logger log=new LoggerManager().getLogger();
		
        String oldContent = "";
         
        BufferedReader reader = null;
         
        FileWriter writer = null;
         
        try
        {
        	log.info("Inside FileHandling:modifyFile:modifying "+oldText+" with "+newText);					
		       
        	reader = new BufferedReader(new FileReader(fileObject));
             
            //Reading all the lines of input text file into oldContent
             
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            String newContent = oldContent.replaceAll(oldText,newText);
            
            //Rewriting the input text file with newContent
             
            writer = new FileWriter(fileObject);
             
            writer.write(newContent);
            log.info("Inside FileHandling:modifyFile:modified "+oldText+" with "+newText);					
		    
        }
        catch (IOException e)
        {
        	log.error("Inside FileHandling:modifyFile:Error in modifying "+oldText+" with "+newText);		    
        	e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources
                 
                reader.close();
                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
	
	
	// method to replace the old file with a new file
	public static void replaceFile(File newFile, File originalFile) throws Exception
	{
		Logger log=new LoggerManager().getLogger();
		try
		{
		log.info("Inside FileHandling:replaceFile method: replacing old file with a new file");
		Files.copy(newFile, originalFile);
		log.info("Inside FileHandling:replaceFile method: replaced old file with a new file");
		}
		catch(Exception e)
		{
			log.error("Inside FileHandling:replaceFile method: Error in replacing old file with a new file");
			
		}
	}
}
