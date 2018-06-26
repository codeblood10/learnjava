import java.lang.*; 
 
 class  demothread implements Runnable  
 { 
    Thread t ; 
	 demothread( ) 
	 { 
	  t = new Thread(this,"demothread"); 
	  System.out.println("child" + t);  
	  t.start();
	  } 
      public void run() 
	  { 
	     try 
		 { 
            for(int i = 8; i>0;i--) 
			{  
              System.out.println("child"+i);
			  Thread.sleep(1000); 
		    } 
		 } 
		 catch(InterruptedException e) 
		 { 
            System.out.println("child interrupted");   		 
		 } 
		 System.out.println("exiting the child thread"); 
	   }	  
    
}  
 
class  mythread  
{ 
  public static void main(String ...args) 
  {  new demothread();  
      try 
  { 
   for(int i = 9;i>0;i--)
   { 
    System.out.println("main  thread" + i ); 
	Thread.sleep(1000); 
	}
  }   
  catch (InterruptedException e) 
  { System.out.println("main thread");  
  } 
  System.out.println("exiting the main thread"); 
  }  
  
  
} 
