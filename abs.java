import java.lang.*; 
import java.util.*; 
import java.io.*; 
  
 abstract class parent //for a abstract class we cannot have a object 
  // it can only be inherit  
 { 
   abstract void callme (); //only declaration is allowed for a abstract method 
    void callmeto()  //concrete method are also allowed in abstract class
    { 
      System.out.println("i am call2");	
	} 	
  } 
  class child extends parent 
  {  //abstract void fuckyou(); class have to be abstract for overiding a abstract object 
     void callme ()
	  { 
	    System.out.println("i am call1") ;
	  
	  }
  }   
  
  class abs
  { 
    public static void main(String ...args) 
	{ 
	    child c = new child() ; 
         c.callme(); 	 
	     c.callmeto(); 
	    	 
    }	
  }
 