package coreJava;
interface Printable1{  
void print();  
}  

interface Showable1 extends Printable1{  
void show();  
}  

class TestInterface4 implements Showable1{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
TestInterface4 obj = new TestInterface4();  
obj.print();  
obj.show();  
 }  
}  