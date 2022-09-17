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
		//test cases 
		int t = scan.nextInt();
		
	while(t>0){
		    int seat = scan.nextInt();
		    if(seat>=1 && seat<=50){
		        System.out.println("LEFT");
		    }
		    else{
		        System.out.println("RIGHT");
		    }
		    t--;
		}
	}
}
