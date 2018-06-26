import java.util.*; 
import java.io.*; 
import java.lang.*; 
import java.lang.reflect.Method; 
 class test 
 { 
     int a;  // default is not same as public // default means public in same package!!
	 public int b ;//it can be access in different packages;
	 private int c;//can not be access by another class and can be accessed  member of sameclass
	 protected int z = 100;
	 void set(int l) 
	 { 
	   c = l ;   
	 }
      int getc () 
	  { 
	    return c; 
	  } 
   public static  void ankit() 
   { 
      int a  =10; 
   System.out.println(a); 	  
	 
   }
 } 
 class accesstest 
 {  
   public static void main(String args[])
   { 
     test ob = new test(); 
	 ob.a = 10 ; 
	 ob.b = 20 ;
	 ob.z = 100;
	 //ob.c = 100; private member can only be access by member of same class only;
	 ob.set(100);
	 System.out.println(ob.getc()+ob.z); 
	 new test().ankit();  // static function can be called through object but is bad practice//
	 Class c = ob.getClass(); 
	 Method m[] = c.getDeclaredMethods();
	 for(Method a: m ) 
	 { 
       System.out.println(a.getName()); 
     }
   }
  
 
 }
