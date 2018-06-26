import java.lang.*; 
import java.io.*; 
import java.util.*; 
 class parent //make the class final if u wanna restrict inheritance  
{ 
    int a = 10 ; 
	private int b =20; 
	public int c = 30;
	 void show () //final and static method cannot be override
    { 
        System.out.println("this is parent show");		
    } 
   parent(int x)	 
    { 
	   a = x; 
	 }
}  
 
 class child extends parent //abstract if u want to break the has a relationship;
{ 
   int a = 20 ; //overriding do not apply on the variable;
   void show()
   { // final int b = 10; final cannot be intialised or defined at method level because a fucking compile time binding  
      System.out.println("this is child show");//method overriding  
     // System.out.println(b);// private variable cannot be used in sub class ;
       System.out.println(c+" "+super.a);// public variable can be directly used in  child class	
       super.show();//use super to reference parent class in child classs	   
   } 
   child ()
   { 
     super(140); // child class constructor always call the parent class constructor so we super to pass the parameter;
	 super.a = 80; //we can use super to  access the parent class variable;
	 a = 70;
    }
 } 
 
class relation  
{ 
  public static void main(String args[]) 
  { 
     parent p = new child(); //dynamic dispatching child always dominates and vice versa is not true; 
      p. show(); 
      System.out.println(p.a); //parent a is called see above reason ; 	 
      System.out.println(((child)p).a);//downcasting  
	 child c =  new child (); 
      System.out.println(((parent)c).a ); //upcasting (parent).a;  
     // parent.show();   non static cannot be called by namespace as a result we cannot access by namespace during overriding   
  } 
} 