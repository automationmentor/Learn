package coreJava;
public class CallingMethodsInSameClass {

	String myname="Harsh";
	static String myStaticName="Yog";
	
	public static void main(String[] args)
	{		
		new CallingMethodsInSameClass();
		printOne();
		printTwo();
	}
	
	public CallingMethodsInSameClass()
	{
		System.out.println("Constructor called:");
		System.out.println(myname);
		System.out.println(myStaticName);
		
	}
	public static void printOne() // static methods can be called without class instantiation
	{
		System.out.println("Hello World");
		System.out.println(myStaticName);
		
	}
	
	public static void printTwo() // static methods can be called without class instantiation
	{
		printOne();		
	}

}
