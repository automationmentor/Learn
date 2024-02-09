package Important;

import java.io.*;  
public class BufferedReaderExample {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("D:\\Work\\out.txt");    
          BufferedReader br=new BufferedReader(fr);    
 
          
          String readFile;    
          while((readFile=br.readLine())!=null){  
          System.out.println(readFile);  
          }  
          
          br.close();    
          fr.close();    
    }    
} 