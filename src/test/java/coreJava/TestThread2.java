package coreJava;
public class TestThread2 extends Thread{  
	 public void run(){  
		  for(int i=1;i<5;i++){  
		    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
			 TestThread2 t1=new TestThread2();  
			 TestThread2 t2=new TestThread2();  
		   
		 //there is no context-switching because here t1 and t2 will be treated as normal object not thread object.
//			t1.run();  
//		  t2.run();  
			 
		  t1.start();
		  t2.start();
		  
		 }  
		}  
