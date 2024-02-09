package Algo;

public class Test3 {
	
	public static void main(String args[])
	{
		
		 String locator = "cssSelector#RichWidgets_wt35_block_wtMainContent_wtUserNameInput";
		    //Split the value which contains locator type and locator value
	         String locatorType = locator.split("#")[0];
	         String locatorValue = locator.split("#")[1];
	         System.out.println(locatorType);
	         System.out.println(locatorValue);
	         
	}

}
