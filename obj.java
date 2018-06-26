import java.lang.*; 
import java.util.*; 
import java.io.*; 
 class student 
 { 
   int name ; 
   int no ; 
   int yr ;
   
 }  
 
 class obj  implements Cloneable 
 { 
    public static void main () 
    { 
     student s = new student(); 
     student b = s.clone();
     System.out.println(b.equals(s)); 
     Class c = s.getClass; 
      System.out.println(s.hashcode());  	  
	}	
 }
 