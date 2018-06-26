import java.io.*;  
import java.lang.*; 
   
  class usingfinalize 
  { 
      
	  public static void main (String args[])
	  {  
	  ankit ob = new ankit(); 
	  System.out.println(ob.a); 
      System.out.println("finalizing"); 
      ob.finalize();  
	  }   
  }
  class ankit 
  { 
       int a ; 
	   ankit (){ 
	         a = 10 ;
		    } 
	  protected void finalize () 
	  { 
	     System.out.println("finalized"); 
	  }
  
  }