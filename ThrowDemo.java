class ThrowDemo { 
static void demoproc()
 { 
 try { 
      throw new NullPointerException("demo"); 
     } 
 catch(NullPointerException e) 
 { System.out.println("Caught inside demoproc."+e.getMessage()); 
 throw e; // rethrow the exception 
 } 
catch(Exception e) 
 {  System.out.println("demo2"); 
}   }
public static void main(String args[]) 
{ try { demoproc(); } 
catch(NullPointerException e) 
{ System.out.println("Recaught: " + e); } }
}
