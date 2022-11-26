/*
https://www.codechef.com/LP1TO201/problems/HOOPS


Problem
Read problem statements in Bengali, Mandarin Chinese, Russian, and Vietnamese as well.
You and your friend are playing a game with hoops. There are NN hoops (where NN is odd) in a row. You jump into hoop 11, and your friend jumps into hoop NN. Then you jump into hoop 22, and after that, your friend jumps into hoop N-1N−1, and so on.

The process ends when someone cannot make the next jump because the hoop is occupied by the other person. Find the last hoop that will be jumped into.

###Input

The first line contains an integer TT, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, a single integer NN.
###Output For each testcase, output in a single line the answer to the problem.

###Constraints

1 \leq T \leq 10^51≤T≤10 
5
 
1 \leq N \lt 2\cdot 10^51≤N<2⋅10 
5
 
NN is odd
###Subtasks Subtask #1 (100 points): original constraints

Sample 1:
Input
Output
2
1
3
1
2
Explanation:
Test Case 11: Since there is only 11 hoop, that's the only one to be jumped into.

Test Case 22: The first player jumps into hoop 11. The second player jumps into hoop 33 and finally the first player jumps into hoop 22. Then the second player cannot make another jump, so the process stops.

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
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t>0){
		    int n = scan.nextInt();
		    
		    int res = n/2;
		    
		    System.out.println(res+1);
		    t--;
		}
	}
}
