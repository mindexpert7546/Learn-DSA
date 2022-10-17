/* package codechef; // don't place package name! */
/*
Problem
There is a fair going on in Chefland. Chef wants to visit the fair along with his NN friends. Chef manages to collect KK passes for the fair. Will Chef be able to enter the fair with all his NN friends?

A person can enter the fair using one pass, and each pass can be used by only one person.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of a single line containing two space-separated integers N, KN,K.
Output Format
For each test case, print on a new line YES if Chef will be able to enter the fair with all his NN friends and NO otherwise.

You may print each character of the string in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq N, K \leq 1001≤N,K≤100
Sample 1:
Input
Output
4
5 8
6 3
2 2
1 2
YES
NO
NO
YES
Explanation:
Test case 11: Chef needs 55 passes for his friends and one pass for himself and he collected 88 passes. Thus he will be able to enter the fair with all his friends.

Test case 22: Chef needs 66 passes for his friends and one pass for himself while he collected only 33 passes. Thus he will not be able to enter the fair with all his friends, only three of them can enter the fair.

Test case 33: Chef needs 22 passes for his friends and one pass for himself while he collected only 22 passes. Thus either Chef or one of his friends can't enter the fair.

Test case 44: Chef needs a total of 22 passes, one for himself and one for his friend. He collected 22 passes. Thus he will be able to enter the fair with his friend.






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
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    if(x<y){
		        System.out.println("YES");
		    }
		    
		    else{
		        System.out.println("NO");
		    }
		    
		    t--;
		}
	}
}
