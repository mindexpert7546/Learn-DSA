// link : https://www.codechef.com/NOV221D/problems/WTRMIXING
/**
Problem
Chef is setting up a perfect bath for himself. He has XX litres of hot water and YY litres of cold water.
The initial temperature of water in his bathtub is AA degrees. On mixing water, the temperature of the bathtub changes as following:

The temperature rises by 11 degree on mixing 11 litre of hot water.
The temperature drops by 11 degree on mixing 11 litre of cold water.
Determine whether he can set the temperature to BB degrees for a perfect bath.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of four space-separated integers A, B, X,A,B,X, and YY — the initial temperature of bathtub, the desired temperature of bathtub, the amount of hot water in litres, and the amount of cold water in litres respectively.
Output Format
For each test case, output on a new line, YES if Chef can get the desired temperature for his bath, and NO otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

Constraints
1 \leq T \leq 20001≤T≤2000
20 \leq A, B \leq 4020≤A,B≤40
0 \leq X, Y \leq 200≤X,Y≤20
Sample 1:
Input
Output
4
24 25 2 0
37 37 2 9
30 20 10 9
30 31 0 20
YES
YES
NO
NO
Explanation:
Test case 11: The initial temperature of water is 2424 and the desired temperature is 2525. Chef has 22 litres of hot water. He can add 11 litre hot water in the tub and change the temperature to 24+1=2524+1=25 degrees.

Test case 22: The initial temperature of water is 3737 and the desired temperature is also 3737. Thus, Chef does not need to add any more water in the bathtub.

Test case 33: The initial temperature of water is 3030 and the desired temperature is 2020. Chef needs to add 1010 litres of cold water to reach the desired temperature. Since he only has 99 litres of cold water, he cannot reach the desired temperature.

Test case 44: The initial temperature of water is 3030 and the desired temperature is 3131. Chef needs to add 11 litre of hot water to reach the desired temperature. Since he has no hot water, he cannot reach the desired temperature.
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
		while (t>0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    
		    if(a==b){
		        System.out.println("YES");
		    }
		    else if(a>b){
		        int res = a-b;
		        if(res<=y){
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		    }
		    else if(a<b){
		        int res = b-a;
		        if(res<=x){
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		    }
		    t--;
		} 
	}
}
