import java.io.*; 
  casting and conversion ;
  class casting 
  { 
      long  a =  12 ; // automatically converted the target is larger 
	  int  b  = 10 ; 
	  byte x = (byte)b;//forcefull conversion typecasting
	  byte n = 50 ; //automatic conversion 
	  int c = b * n; // the byte variable in expression are automaatically 
	    // converted to integer 
      byte m = n * 2 ; // error as  automatic conversion to integer 
       //expression are converted to in the presence of higher datatypes automatically 
	   //byte<short<int<long<float<double
  
  
  }