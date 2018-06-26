import java.util.*; 
import java.lang.*; 
import java.io.*; 
 
 class object  
 { 
   public static void main (String args[]) 
   { 
      test o = new test(1,2); 
      test b = new test(4,5); 
   	  System.out.println(b.equals(o));  // it also pass by reference any change to  member will 
                                        // be reflected back	  
	  System.out.println(o.a);
   } 
 }
 
 
 
 
class test  
{ 
 int a ;
 int b ;  
 test (int i,int j) 
 { 
    this.a = i ;
	this.b = j ; 
   } 
 boolean equals (test O) 
 { O.a = 10;
   if(O.a==a&&O.b==b) 
     return true; 
   else 
     return false; 	   
 }  
  
}
 
  