import java.lang.*; 
import java.io.*; 
import java.util.*; 

class Q 
{ 
  int n; 
  boolean valueset = false;  
  synchronized int get()
  { 
    while(!valueset) 
	{ 
      try 
	  { 
	   wait(); 
	  } 
	  catch(InterruptedException e) 
	  { 
	   System.out.println(e); 
	  } 
   } 
      System.out.println("got, "+n); 
      valueset =false;  
      notify(); 
      return n; 	  
   } 
   synchronized void put(int n) 
    {  
	   try {
      while(valueset) 
	  { 
        wait(); 
	  }   
	   }	  
	  catch(InterruptedException e) 
	  { 
	    System.out.println(e); 
	  }  
	  this.n = n ; 
	  
	  System.out.println("put: "+n); 
	  valueset = true; 
	  notify(); 
	
   }
} 
 
 class producer implements  Runnable 
 { 
   Q q ; 
   producer(Q q) 
     { 
      this.q = q; 
	  new Thread(this,"producer").start(); 
	 }   
   public void run()  
   { 
      int i = 0;  
	  while(true) 
	  { 
       q.put(++i);   
      } 
	 }
} 
class consumer implements Runnable 
{ 
 Q q; 
 consumer(Q q) 
 { 
   this.q = q; 
   new Thread (this,"consumer").start();   
 }
 public void run() 
   { 
    while(true) 
	{  
      q.get(); 
    }
 } 
}    

class interthread 
{ 
  public static void main(String ...args) 
  { 
     Q q = new Q(); 
	 new producer(q); 
     new consumer(q); 
   System.out.println("Control+c to stop the thread"); 
   
  }  
}
