import java.lang.*; 
import java.io.*; 
import java.util.*; 
//member of inner class cannot be accessed by outer class directly because there is no instance of outer class 
//but inner class can directly accessed the member of inner class//irrespective of their  access qualifier!!
class outerclass 
{ 
 public static void main(String args[]) 
 { 
   outer ou = new outer(); 
   outer.inner t = new outer.inner(); // check out how to do this dont think this is possible!! 
   ou.test(); 
 } 
} 
class outer 
{ 
  private int ox = 10; 
  void test() 
  { 
    inner in = new inner(); 
	in.display(); 
  } 
  public static class inner 
  {  int y = 10; 
    void display() 
    { 
	   System.out.println(ox);
	}
  } 
}  