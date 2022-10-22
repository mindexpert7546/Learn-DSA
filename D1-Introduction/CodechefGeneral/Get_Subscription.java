
/*
Problem
Chef wants to conduct a lecture for which he needs to set up an online meeting of exactly XX minutes.

The meeting platform supports a meeting of maximum 3030 minutes without subscription and a meeting of unlimited duration with subscription.

Determine whether Chef needs to take a subscription or not for setting up the meet.

Input Format
First line will contain TT, the number of test cases. Then the test cases follow.
Each test case contains a single integer XX - denoting the duration of the lecture.
Output Format
For each test case, print in a single line, YES if Chef needs to take the subscription, otherwise print NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq X \leq 1001≤X≤100
Sample 1:
Input
Output
4
50
3
30
80
YES
NO
NO
YES
Explanation:
Test Case 11: Without subscription, the platform allows only 3030 minutes of duration. Since Chef needs to conduct a lecture of 5050 minutes, he needs to buy the subscription.

Test Case 22: Without subscription, the platform allows 3030 minutes of duration. Since Chef needs to conduct a lecture of 33 minutes only, he does not need to buy the subscription.

Test Case 33: Without subscription, the platform allows 3030 minutes of duration. Since Chef needs to conduct a lecture of 3030 minutes only, he does not need to buy the subscription.

Test Case 44: Without subscription, the platform allows only 3030 minutes of duration. Since Chef needs to conduct a lecture of 8080 minutes, he needs to buy the subscription.



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
		int  t = scan.nextInt();
		
		while(t>0){
		    
		    int n = scan.nextInt();
		    if(n>30){
		       System.out.println("YES"); 
		    }
		    else{
		        System.out.println("NO");
		    }
		    t--;
		}
	}
}
