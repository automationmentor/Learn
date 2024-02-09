package coreJava;

public class CreateThreadWithThreadClass extends Thread {

	
public void run(){
        
        for(int i=0; i < 5; i++)
        {
        	Thread t=Thread.currentThread();
                System.out.println(t.getName()+":"+ i);
               
                try
                {
                        Thread.sleep(50);
                }
                catch(InterruptedException ie)
                {
                        System.out.println("Child thread interrupted! " + ie);
                }
        } // end of for loop
        
}
	
	
	
	public static void main(String[] args) {
	    
		CreateThreadWithThreadClass t1 = new CreateThreadWithThreadClass();
		CreateThreadWithThreadClass t2 = new CreateThreadWithThreadClass();    
	    t1.start();
	    t2.start();
	    System.out.println("done");
	    

	}
}
