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
		int rtp,audit,non_rtp;
		
		while(t>0){
		    rtp = scan.nextInt();
		    audit = scan.nextInt();
		    non_rtp = scan.nextInt();
		    
		    int creadit_for_rtp = 4*rtp;
		    int creadit_for_audit = 2*audit;
		    int creadit_for_non_rtp = 0*non_rtp;
		    
		    int res = creadit_for_rtp+creadit_for_audit+creadit_for_non_rtp;
		    System.out.println(res);
		    
		    
		    t--;
		}
	}
}
