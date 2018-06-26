import java.io.*; 
import java.lang.*; 
 
 class mythread  extends Thread 
 { 
  mythread () 
  { 
    super("demo thread"); 
    System.out.println("child"+this); 
    start();	
  }  
  public void run() 
  { 
    try 
	{ 
      for(int i =9;i>0;i--)
	  { 
        System.out.println("child"+i); 
        Thread.sleep(1000); 		
	  } 
	} 
    catch (InterruptedException e) 
	{ 
      System.out.println("child thread interrupted"); 
      	  
	}	
   System.out.println("child exit"); 
  
  }
 }  
  
  class threadex 
  { 
   public static void main(String ...args) 
   { 
     new mythread(); 
     try 
	 { 
       for(int i = 5;i>0;i--) 
	   { 
          System.out.println("main thread");  
		  Thread.sleep(1000);
		}		   
	 } 
	 catch (InterruptedException e) 
	 { 
	    System.out.println("main thread interrupted"); 
	 }  
	 System.out.println("exiting the  main thread");
   } 
  
  
  } 