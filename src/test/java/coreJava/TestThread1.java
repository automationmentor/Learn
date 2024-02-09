package coreJava;
public class TestThread1 extends Thread{
	
	public void run()
	{
		System.out.println("thread is running...");
	}
	
	public static void main(String args[])
	{
		TestThread1 obj=new TestThread1();
		obj.start();
	}

}
