/*

Problem
Finally, after purchasing a water cooler during the April long challenge, Chef noticed that his water cooler requires 22 liters of water to cool for one hour.

How much water (in liters) would be required by the cooler to cool for NN hours?

Input Format
The first line of input will contain an integer TT — the number of test cases. The description of TT test cases follows.
The first and only line of each test case contains an integer NN, as described in the problem statement.
Output Format
For each test case, output the number of liters of water required by the water cooler to cool for NN hours.

Constraints
1 \leq T \leq 10001≤T≤1000
1 \leq N \leq 10001≤N≤1000
Sample 1:
Input
Output
2
1
2
2
4
Explanation:
Test case 11: As mentioned in the problem statement, 22 liters of water is required by the water cooler to cool for 11 hour.

Test case 22: 44 liters of water is required by the water cooler to cool for 22 hours.



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
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t>0){
		    int n = scan.nextInt();
		    System.out.println(n*2);
		    t--;
		}
	}
}
