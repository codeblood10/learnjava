import java.io.*; 
import java.lang.*; 
import java.util.*; 
 
 class exph 
 { 
  public static void main(String ...args) 
  {  Random r = new Random();
    try 
	{ 
      int b = r.nextInt(); 	
     int a = 41 / 0;  
	}  
	catch (ArithmeticException e ) 
	{ 
	   System.out.println("divison by zero" + e); 
     //a =  0 ;	   
	}  
    catch (Exception e) 
    { 
       System.out.println("generic Statements"); //Exception is a superclass for ArithmeticException e 
       // it has to be checked below	   
	 } 	
  }
 
 } 