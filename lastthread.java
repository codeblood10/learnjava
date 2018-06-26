import java.util.*; 
import java.lang.*; 
 
 
class newthread  implements Runnable 
{  
   Thread t ; 
   String name ;   
   newthread (String s)  
   { 
      name =s ; 
	  t = new Thread(this,s);  
       System.out.println("thread"+s); 
      t.start(); 	   
   } 
   public void run() 
   { 
    try   
	{ 
      for(int i =5;i>0;i--) 
	  { 
        System.out.println(name+i); 
		Thread.sleep(1000);
	  } 	  
	 }	 
	 catch(InterruptedException e) 
	 { 
      System.out.println(e);	 
	 }  
	 System.out.println("exiting the main thread"); 
   } 
} 
 
 class lastthread 
 { 
    public static void main(String ...args) 
	{ 
	 newthread ob1 = new  newthread("one"); 
	  newthread ob2 =  new newthread("second"); 
	  newthread ob3 = new newthread("three");  
	  System.out.println("Thread One is alive: " + ob1.t.isAlive());
	  System.out.println("Thread Two is alive: " + ob2.t.isAlive()); 
	  System.out.println("Thread Three is alive: " + ob3.t.isAlive());
	  try 
	  { 
	    System.out.println("waiting for thread to dead"); 
        ob1.t.join(); 
 		ob2.t.join(); 
		ob3.t.join(); 
	  } 
       catch(InterruptedException e)  
	   { 
         System.out.println(e);		 
	   }	   
	
    System.out.println("Thread One is alive: " + ob1.t.isAlive());
	  System.out.println("Thread Two is alive: " + ob2.t.isAlive()); 
	  System.out.println("Thread Three is alive: " + ob3.t.isAlive());
	  System.out.println("exiting the main thread"); 
	}  
 }