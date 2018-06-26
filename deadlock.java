import  java.io.*; 
import java.lang.*; 
import java.util.*; 
 
class A 
{ 
  synchronized void foo(B b)   
  { 
    String name = Thread.currentThread() .getName(); 
    System.out.println(name +"entered foo"); 
	try 
	{ 
	  Thread.sleep(1000); 
	} 
	catch(Exception e)  
	{ 
      System.out.println(e); 	
	} 
	System.out.println(name+"trying to call  b last");
     b.last();   
  }
   synchronized void last() 
    { 
	  System.out.println("inside a last");
	}

}
class B  
{ 
   synchronized void bar(A a) 
   { 
     String  name  = Thread.currentThread().getName(); 
	 System.out.println(name +"entered b bar"); 
	 try 
	 {  
	   Thread.sleep(1000); 
	 } 
	 catch(Exception e) 
      { 
        System.out.println(e);	  
	  } 
	  System.out.println(name + " trying to call A.last()"); 
     a.last();
   }
   synchronized void last()
   { 
      System.out.println("inside b last");
   }
} 

class deadlock implements Runnable 
{ 
  A a = new A(); 
  B b = new B(); 
    deadlock()  
	 { 
	   Thread.currentThread().setName("main thread"); 
	   Thread t = new Thread(this,"racing thread"); 
	   t.start();  
	   a.foo(b);//get lock on a in this thread
	   System.out.println("back in main thread"); 
	 }  
	 public void run() 
     {  b.bar(a); // get lock on b in this thread  
	    System.out.println("back in main thread");
	 }	 
    public static void main(String ...args) 
	{  
	  new deadlock();
	}	
} 