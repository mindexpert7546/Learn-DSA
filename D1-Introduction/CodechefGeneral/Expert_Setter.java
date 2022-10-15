/*
Problem
A problem setter is called an expert if at least 50 \%50% of their problems are approved by Chef.

Munchy submitted XX problems for approval. If YY problems out of those were approved, find whether Munchy is an expert or not.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of a two space-separated integers XX and YY - the number of problems submitted and the number of problems that were approved by Chef.
Output Format
For each test case, output on a new line YES, if Munchy is an expert. Otherwise, print NO.

The output is case-insensitive. Thus, the strings YES, yes, yeS, and Yes are all considered the same.

Constraints
1 \leq T \leq 10001≤T≤1000
1 \leq Y \le X \leq 10^61≤Y≤X≤10 
6
 
Sample 1:
Input
Output
4
5 3
1 1
4 1
2 1
YES
YES
NO
YES
Explanation:
Test case 11: We are given that 33 out of 55 problems were approved. Thus, 60 \%60% of the problems were approved. Since at least 50 \%50% of the problems were approved, Munchy is an expert.

Test case 22: We are given that 11 out of 11 problems were approved. Thus, 100 \%100% of the problems were approved. Since at least 50 \%50% of the problems were approved, Munchy is an expert.

Test case 33: We are given that 11 out of 44 problems were approved. Thus, 25 \%25% of the problems were approved. Since at least 50 \%50% of the problems were not approved, Munchy is not an expert.

Test case 44: We are given that 11 out of 22 problems were approved. Thus, 50 \%50% of the problems were approved. Since at least 50 \%50% of the problems were approved, Munchy is an expert.


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
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    //to find percentege 
		    int p =  (y*100)/x;
		    if(p>=50){
		        System.out.println("YES");
		    }
		    
		    else{
		        System.out.println("NO");
		    }
		    
		    t--;
		}
	}
}
