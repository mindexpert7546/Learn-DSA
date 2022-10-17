/* package codechef; // don't place package name! */
/*

Problem
Chef is not feeling well today. He measured his body temperature using a thermometer and it came out to be XX °F.

A person is said to have fever if his body temperature is strictly greater than 9898 °F.

Determine if Chef has fever or not.

Input Format
The first line contains a single integer TT — the number of test cases. Then the test cases follow.
The first and only line of each test case contains one integer XX - the body temperature of Chef in °F.
Output Format
For each test case, output YES if Chef has fever. Otherwise, output NO.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).

Constraints
1 \le T \le 101≤T≤10
94 \le X \le 10394≤X≤103
Sample 1:
Input
Output
3
98
100
96
NO
YES
NO
Explanation:
Test Case 1: Since X = 98X=98 is not greater than 9898, Chef does not have fever.

Test Case 2: Since X = 100X=100 is greater than 9898, Chef has fever.

Test Case 3: Since X = 96X=96 is not greater than 9898, Chef does not have fever.

*/
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
		    if(n>98){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    t--;
		}
	}
}
