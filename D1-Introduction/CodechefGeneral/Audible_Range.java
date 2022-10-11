/*
Input

5
42
67
402
45000
45005

Output
NO
YES
YES
YES
NO


*/



/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner scan = new Scanner(System.in);
	  int t = scan.nextInt();
	  
	  while(t>0){
	      
	      int f = scan.nextInt();
	      
	      if(f<67){
	          System.out.println("NO");
	      }
	      else if(f>=67 && f<=45000){
	          System.out.println("YES");
	      }
	      else{
	          System.out.println("NO");
	      }
	      
	      t--;
	  }
	}
}
