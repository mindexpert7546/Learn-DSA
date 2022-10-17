/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int x,p,q;
		
		while(t>0){
		    
		    x = scan.nextInt();
		    p = scan.nextInt();
		    q = scan.nextInt();
		    
		    int without_ticket = p-q;
		    int fine = without_ticket*x;
		    
		    System.out.println(fine);
		    
		    
		    t--;
		}
	}
}
