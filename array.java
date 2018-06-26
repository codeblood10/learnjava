import java.io.*; 
import java.lang.*; 
  
 class array  
 { 
            
      int a []= new int[] {1,2,3,4,5};//using new dynamically defining an array 
	  int b[] = {1,3,4,5,6};//there is no need to define size if if u r using  intialising at the time of  
          // declaration 	  
     int c [] = {1,2,3,4,5}; 
   public static void main (String []args)	{ 
      for(int i: new array().a)  //for each loop
	  { 
        System.out.println(i);
	  }		  
	  for(int j =0;j<5;j++) 
	  { 
         System.out.println(new array().b[j]+" "+ new array().c[j]); 
	  } 
       int p[][] = new int[4][5] ;// already intialised to zero so we dont have to intialised it and its a local variable;	  
	  int twoD[][] = new int[4][]; 
	  twoD[0] = new int[]{1,2,3,4,5};  
	  twoD[1] = new int[]{1,2,3,4,5}; 
	  twoD[2] = new int[]{1,2,3,4,5};
	  twoD[3] = new int[]{12,3,4,5,6}; 
      for(int[] z:twoD) 
		   for(int m: z ) 
			   System.out.println(m);

   }
 } 