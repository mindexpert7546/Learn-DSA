/* package codechef; // don't place package name! */
/*

Problem
This semester, Chef took XX courses. Each course has YY units and each unit has ZZ chapters in it.

Find the total number of chapters Chef has to study this semester.

Input Format
The first line will contain TT, the number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing three space-separated integers X, Y,X,Y, and ZZ.
Output Format
For each test case, output in a single line the total number of chapters Chef has to study this semester.

Constraints
1 \leq T \leq 10001≤T≤1000
1 \leq X, Y, Z \leq 10001≤X,Y,Z≤1000
Sample 1:
Input
Output
3
1 1 1
2 1 2
1 2 3
1
4
6
Explanation:
Test case 11: There is only 11 course with 11 unit. The unit has 11 chapter. Thus, the total number of chapters is 11.

Test case 22: There are 22 courses with 11 unit each. Thus, there are 22 units. Each unit has 22 chapters. Thus, the total number of chapters is 44.

Test case 33: There is only 11 course with 22 units. Each unit has 33 chapters. Thus, the total number of chapters is 66.
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
		    int z = scan.nextInt();
		    int res = x*y*z;
		    System.out.println(res);
		    
		    t--;
		}
	}
}


