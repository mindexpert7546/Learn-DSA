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
		    int p = scan.nextInt();
		    int tc = scan.nextInt();
		    int cs = p/10;
		    System.out.println(cs*tc);
		    t--;
		}
	}
}
