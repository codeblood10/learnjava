  import java.util.*; 
  import java.io.*; 
  import java.lang.*; 
   interface  interp  
   { void calc(int a , int b);  
    } 
  
  
  interface inter extends interp { //if a interface is defined public then the filename 
    // start with interface name
   void show () ;  // all method are public and abstract implictily
   void sum (int a,int b); 
   int a  = 10 ; // all varible are final and public implicity; 
} 
public class learninter implements inter // if a class does not want to define all methods of interface then it  should be abstract 
{  
  public void show () // we have to define the method public of a interface while  defining it 
   { 
     System.out.println("this is show"); 
   } 
   public void calc(int a ,int b) 
   { int sum = a + b ;  
   } 
  public void sum (int a , int b)  
   { int sum = a+b;
      return ;
   } 
   public static void main(String args[]) 
   { 
     learninter li = new learninter(); 
      li.show(); 
	  System.out.println(li.a);
   }   
 // we can define a references variable of a interfaces  
 // inter   i = new learninter();  
} 