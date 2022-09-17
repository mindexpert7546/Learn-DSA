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
		Codechef cd = new Codechef();
		
		int t = scan.nextInt();
		while(t>0){
		    int w = scan.nextInt();
		    int c = scan.nextInt();
		    cd.findCost(w,c);
		    t--;
		}
	}
	
	public void findCost(int week, int costPerweek){
	    int res = week*costPerweek;
	    System.out.println(res);
	}
}
