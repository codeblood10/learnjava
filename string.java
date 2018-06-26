import java.util.*; 
import java.io.*; 
import java.lang.*;  
//string are implement in java.lang
//string is a immutable class 
 class string 
 { 
    public static void main(String args[]) //variable length argument can also be written as ...args (string ...args)
	 //there can be only one variable length
	 //argument and should be last in argument function with vargs can be overloaded
	 
	{  
	   String a =  args[0]; 
	   String b = args[1]; 
	   System.out.println(a.equals(b)); 
	   System.out.println(a.charAt(0)); 
	   System.out.println(a.length()); 
	   
	}	
 } 