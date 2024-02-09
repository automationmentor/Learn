package Important;
public class CreateThreadRunnableExample implements Runnable{
	public void run(){
        
        for(int i=0; i < 5; i++){
        	Thread t=Thread.currentThread();
                System.out.println(t.getName()+ i);
               
                try{
                        Thread.sleep(50);
                }
                catch(InterruptedException ie){
                        System.out.println("Child thread interrupted! " + ie);
                }
        }
       
        System.out.println("Child thread finished!");
}
	public static void main(String[] args) {
            
        Thread t1 = new Thread(new CreateThreadRunnableExample(), "My Thread1:");
        Thread t2 = new Thread(new CreateThreadRunnableExample(), "My Thread2:");

        t1.start();
        t2.start();
}
}
