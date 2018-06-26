import java.lang.*; 
 
 class myexception extends Exception 
 { 
    private  int detail; 
	myexception(int a) 
    { detail = a ; 
	}
    public String toString()
	{return "myexception["+detail+"]"; //overrides the tostring function to provide description of object  
  } 
 } 
 class javaexception 
 { 
    static public void compute(int a) throws myexception  
	{ 
	    if(a>10) 
         throw new  myexception(a); 
        else 
           System.out.println("exited normally"); 		  
	} 
	   
    public static void main(String ...args)  
	{ 
     try  
	 { 
	   compute(1); 
	   compute(20);
	 }  
     catch(myexception e) 
	 { System.out.println(e); 
	 }	 
	} 
 } 