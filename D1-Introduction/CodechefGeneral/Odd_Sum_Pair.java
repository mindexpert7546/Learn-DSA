/* package codechef; // don't place package name! */

/*
Problem
Chef has 33 numbers A, BA,B and CC.

Chef wonders if it is possible to choose exactly two numbers out of the three numbers such that their sum is odd.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of three integers A, B, CA,B,C.
Output Format
For each test case, output YES if you can choose exactly two numbers with odd sum, NO otherwise.

The output is case-insensitive. Thus, the strings YES, yes, yeS, and Yes are all considered the same.

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq A, B, C \leq 101≤A,B,C≤10
Sample 1:
Input
Output
4
1 2 3
8 4 6
3 3 9
7 8 6
YES
NO
NO
YES
Explanation:
Test case 1: Chef can choose 22 and 33 since 2 + 3 = 52+3=5 and 55 is odd.

Test case 2: It can be shown that Chef cannot choose two numbers among 88, 44 and 66 with odd sum.




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
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    
		  
		   if((a+b)%2==1 || (b+c)%2==1 || (a+c)%2 ==1){
		       System.out.println("YES");
		   }
		    else{
		        System.out.println("NO");
		    }
		    t--;
		}
	}
}

