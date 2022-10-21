/* package codechef; // don't place package name! */

/*
Problem
Chef has recently moved into an apartment. It takes 3030 minutes for Chef to reach office from the apartment.

Chef left for the office XX minutes before Chef was supposed to reach. Determine whether or not Chef will be able to reach on time.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of a single integer XX.
Output Format
For each test case, output YES if Chef will reach on time, NO otherwise.

The output is case-insensitive. Thus, the strings YES, yes, yeS, and Yes are all considered the same.

Constraints
1 \leq T \leq 601≤T≤60
1 \leq X \leq 601≤X≤60
Sample 1:
Input
Output
6
30
60
14
29
31
42
YES
YES
NO
NO
YES
YES
Explanation:
Test case 1: Chef leaves 3030 minutes before he is supposed to reach, so he will reach the office exactly on time since it takes 3030 minutes to commute.

Test case 2: Chef will reach 3030 minutes early.

Test case 3: Chef will reach 16 minutes late.


*/

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
		    
		    int n = scan.nextInt();
		    if(n>=30){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    t--;
		}
	}
}

