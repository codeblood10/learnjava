import java.io.*; 
import java.lang.*; 
import java.util.*; 
 
 class chainedexcp 
 { 
   static void demoproc()  
   { 
    NullPointerException e = new NullPointerException();  
    e.initCause(new ArithmeticException("cause")); 
    throw e ;	
    }
     public static void main (String ...args)  
	 { 
	   try 
	   { 
         demoproc(); 	   
	   }
	   catch(NullPointerException e) 
	   { System.out.println("main excp"+e); 
         System.out.println("original cause"+e.getCause());
	   }
	 
	 } 	 
  } 