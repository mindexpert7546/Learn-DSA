/*
Problem
Read problem statements in Mandarin, Bengali, Russian, and Vietnamese as well.
Chef aims to be the richest person in Chefland by his new restaurant franchise. Currently, his assets are worth AA billion dollars and have no liabilities. He aims to increase his assets by XX billion dollars per year.

Also, all the richest people in Chefland are not planning to grow and maintain their current worth.

To be the richest person in Chefland, he needs to be worth at least BB billion dollars. How many years will it take Chef to reach his goal if his value increases by XX billion dollars each year?

###Input

The first line contains an integer TT, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, three integers AA, BB, XX.
###Output For each test case, output in a single line the answer to the problem.

###Constraints

1 \leq T \leq 21\ 0001≤T≤21 000
100 \leq A < B \leq 200100≤A<B≤200
1 \leq X \leq 501≤X≤50
XX divides B - AB−A
###Subtasks Subtask #1 (100 points): Original constraints

Sample 1:
Input
Output
3
100 200 10
111 199 11
190 200 10
10
8
1
Explanation:
Test Case 11: Chef needs to increase his worth by 200 - 100 = 100200−100=100 billion dollars and his increment per year being 1010 billion dollars, so it will take him \frac{100}{10} = 10 
10
100
​
 =10 years to do so.

Test Case 22: Chef needs to increase his worth by 199 - 111 = 88199−111=88 billion dollars and his increment per year being 1111 billion dollars, so it will take him \frac{88}{11} = 8 
11
88
​
 =8 years to do so.

Test Case 33: Chef needs to increase his worth by 200 - 190 = 10200−190=10 billion dollars and his increment per year being 1010 billion dollars, so it will take him \frac{10}{10} = 1 
10
10
​
 =1 year to do so.
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
		    int x  = scan.nextInt();
		    int y = scan.nextInt();
		    int z = scan.nextInt();
		    
		    int res = y-x;
		    System.out.println(res/z);
		    
		    t--;
		}
	}
}
