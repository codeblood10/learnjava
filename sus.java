import  java.util.*; 
import  java.io.*;
import  java.util.*; 
// as suspend method and resume method are depreciated by java 2 so we use new user-defined method
class newthread implements Runnable 
{ 
  String name; 
  Thread t ; 
 boolean flag;  
  newthread(String name) 
   { 
     this.name = name ; 
	 t = new  Thread(this,name); 
	 System.out.println("new thread:"+t);  
	 flag  = false;
	 t.start(); 
    }
     public void  run() 
	 { 
	    try   
		{ 
		 for(int i = 0; i<14;i++)  
		 { System.out.println(name+i); 
		     Thread.sleep(1000); 
			 synchronized(this) 
			 { 
              while(flag)
                wait();				  
			 }
		  } 
		} 
	 catch(InterruptedException e) 
		{ 
		  System.out.println(name +"interrupted."); 
		}
	  	 
	    System.out.println(name+"exiting");  
     } 
     void mysuspend() 
	 { 
	  flag = true;  
	 } 
    synchronized void myresume() 
	{ flag = false; 
        notify();	
	}	
} 	 
    
	 class sus 
	 { 
	    public static void main(String args[])
	     { newthread ob1 = new newthread("One");
      	   newthread ob2 = new newthread("Two");
        try 
		{ 
 		Thread.sleep(1000);
		ob1.mysuspend();
		System.out.println("Suspending thread One"); 
		Thread.sleep(1000);
		ob1.myresume(); 
		System.out.println("Resuming thread One");
		ob2.mysuspend();
		System.out.println("Suspending thread Two");
		Thread.sleep(1000);
		ob2.myresume(); 
		System.out.println("Resuming thread Two"); 
		} 
		catch (InterruptedException e) 
		{ 
		  System.out.println("Main thread Interrupted");
		}
//wait for threads to finish
 try 
{ System.out.println("Waiting for threads to finish.");
 ob1.t.join();
 ob2.t.join();
 } 
 catch (InterruptedException e) 
 { System.out.println("Main thread Interrupted");
 }
 System.out.println("Main thread exiting.");
}
}

