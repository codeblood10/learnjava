import java.io.*; 
import java.lang.*;  
import java.util.*;

  class stack 
  { 
    public static void main(String args[]) 
	{ Scanner s = new Scanner(System.in); 
	  int a =  s.nextInt();
	  final ostack ob = new ostack(a);   
	    
      for(int i = 0 ;i<a;i++) 
      {		  
	  int val = s.nextInt();  
	   ob.push(val);
	  }	  
	  for(int i = 0 ;i<a;i++) 
	  { 
       ob.pop();
      }
	
	}
   
   
  } 
 
  class ostack 
  { 
     int s[] ;  
     int tos ; 
     ostack(int size) 
     {  s = new int[size];
	   tos = -1;
	 }  
     public void push (int val) 
	 { 
	   if(tos==s.length-1) 
		   System.out.println("stack is full"); 
	    else 
		  s[++tos] = val;
	     
	 }  	 
    public void pop ()
	{ 
	   if(tos==-1) 
		   System.out.println("stack is underrflow"); 
	   else 
	   { 
         System.out.println(s[tos]); 
		 tos--;
	   }
	  
	 }
  } 
  