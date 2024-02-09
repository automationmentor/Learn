package Algo;

public class StringReverse {
	
	public static void main(String args[])
	{
	System.out.println("String reverse example:");
	String name="HARSH";
	StringBuffer reverseName=new StringBuffer(name);
	for(int i=0,j=name.length()-1;i<name.length();i++,j--)
	{
		char temp=name.charAt(j);
		reverseName.setCharAt(i, temp);
	}
	
	System.out.println(reverseName);
	
	
	String ABC="ABCDEFGH";
	StringBuffer CBA=new StringBuffer(ABC);
	
	for(int x=0,y=ABC.length()-1; x<ABC.length();x++,y--)
	{
		
		
			char temp=ABC.charAt(y);
			CBA.setCharAt(x, temp);
			
		
	}
	
	System.out.println(CBA);
	
	}

	
	
}
