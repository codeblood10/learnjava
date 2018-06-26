import java.io.*; 
import java.util.*; 
 
class callme  
{ 
  synchronized void call(String msg) 
   { 
    System.out.println("["+msg);
    try 
	{ 
     Thread.sleep(1000); 
	 
	} 
	catch(InterruptedException e) 
	{ 
	  System.out.println(e);
	} 
   System.out.println("]");
   }
 } 
 class Caller  implements Runnable  
 { 
   String msg; 
   callme target; 
   Thread t ; 
      Caller(callme targ , String s ) 
	  {
		  target =  targ; 
		  msg   = s ; 
		  t = new Thread(this);
		  t.start();
	  }
      public void run() 
       { synchronized(target) // synchronize the function call another way to synchronise the call 
		   {
	          target.call(msg);
		   }
	  }	  
 } 
   
 class synch 
  { 
      public static void main(String ...args) 
	  {   
	     callme target = new callme(); 
		 Caller ob1 = new Caller(target, "Hello"); 
		 Caller ob2 = new Caller(target, "Synchronized");
		 Caller ob3 = new Caller(target, "World");
       
      try {
		  ob1.t.join(); 
		  ob2.t.join(); 
		  ob3.t.join(); 
		  } 
		  catch(InterruptedException e)
		  { System.out.println("Interrupted"); 
		  }
	  
 
	  }
 
 
 }
