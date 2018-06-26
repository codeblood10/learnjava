package pkg ; 
 
 import java.io.*; 
 import java.lang.*; 
  
 public class  learnpack 
 { 
      static int a =10  ; 
      public  int b = 20 ;  
	   public void show() 
	    { 
		  System.out.println("this is learnpack");
	    }   
		public static void main (String args[]) 
		{ 
		  System.out.println(learnpack.a);
		
		}
 }  
 // to compile  the file in package u have give path javac -d . or .. filename.java to compile the file
 // to run u have to compile file like java  pkg.classname; if package is in curent directory;   