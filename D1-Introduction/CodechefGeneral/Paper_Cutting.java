/* package codechef; // don't place package name! */
/*


Problem
Chef has a square-shaped chart paper with the side length equal to NN. He wants to cut out K \times KK×K squares from this chart paper.

Find the maximum number of K \times KK×K squares he can cut from the entire chart paper.

Note that, some part of the chart paper might not be a included in any K \times KK×K cutout square.

Input Format
The first line contains a single integer TT — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two space-separated integers NN and KK — the side length of the entire chart paper and the side length of the cutout squares.
Output Format
For each test case, output on a new line the maximum number of K \times KK×K squares Chef can cut from the entire chart paper.

Constraints
1 \leq T \leq 10001≤T≤1000
1 \leq K \le N \leq 10001≤K≤N≤1000
Sample 1:
Input
Output
3
5 1
2 2
5 2
25
1
4
Explanation:
Test case 1: Chef can cut out 2525 squares of size 1 \times 11×1 from the entire 5 \times 55×5 chart paper.

Test case 2: Chef can cut out 11 square of size 2 \times 22×2 from the entire 2 \times 22×2 chart paper.

Test case 3: Chef can cut out 44 squares of size 2 \times 22×2 from the entire 5 \times 55×5 chart paper.



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
		    int k = scan.nextInt();
		    int res = n/k;
		    System.out.println(res*res);
		    
		    t--;
		}
	}
}
