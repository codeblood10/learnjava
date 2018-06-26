import java.io.*;  
import java.util.*; 
import java.lang.*; 
 
 class nesttry  
 { 
    public static void main(String ...args) 
    { 
      try  // each try is pushed on to stack and if no catch 
	     // handler for that exception is find for the inner try then catch clause for outer try is searched 
	  { 
	      int a = args.length; 
	      System.out.println(a); 
         try //nesting of try can be done using function call in try statement the function should be containing try block
		 { 
		   int b = 32 / a ; 
		 }  
        catch(ArrayIndexOutOfBoundsException e ) 
		{ System.out.println(e);  
		} 		
	  }  
     catch(ArithmeticException e) 
	 { 
	   System.out.println(e);
	 } 	 
   } 	
  } 