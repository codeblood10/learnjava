import java.lang.*; 
import java.io.*; 
import java.util.*; 
 
 class  newthread implements Runnable
 { 
      Thread t  ; 
       String a ; 	  
	  newthread(String s ) 
	  {   a = s;  
	      t = new  Thread(this,s); 
		  System.out.println("Thread"+t);
  		  t.start();
	  } 
	  public  void run() 
	  {
      try  
	  { 
	    for(int i =9;i>0;i--) 
		{ 
	      System.out.println(a+i); 
           Thread.sleep(1000);		   
		}
	  }  
	  catch(InterruptedException e) 
	  { 
	   System.out.println(e); 
	   }
      System.out.println("exiting thread"+a);  
	  }
   } 
 class multithread 
 {  
    
   public static void main(String ...args) 
   {  
      new newthread("one"); 
    new newthread("two"); 
	new newthread("three");
     try 
	 {
	  for(int i=8;i>0;i--) 
	  { 
       System.out.println("main thread"+ i);
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