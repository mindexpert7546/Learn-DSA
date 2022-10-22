/*
Problem
Read problem statements in Mandarin, Bengali, Russian, and Vietnamese as well.
Chef has taken his first dose of vaccine DD days ago. He may take the second dose no less than LL days and no more than RR days since his first dose.

Determine if Chef is too early, too late, or in the correct range for taking his second dose.

Input Format
First line will contain TT, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, three integers D, L, RD,L,R.
Output Format
For each test case, print a single line containing one string - "Too Early" (without quotes) if it's too early to take the vaccine, "Too Late" (without quotes) if it's too late to take the vaccine, "Take second dose now" (without quotes) if it's the correct time to take the vaccine.

Constraints
1 \leq T \leq 10^51≤T≤10 
5
 
1 \leq D \leq 10^91≤D≤10 
9
 
1 \leq L \leq R \leq 10^91≤L≤R≤10 
9
 
Subtasks
Subtask 1 (100 points): Original constraints
Sample 1:
Input
Output
4
10 8 12 
14 2 10
4444 5555 6666 
8 8 12
Take second dose now
Too Late
Too Early
Take second dose now
Explanation:
Test case 11: The second dose needs to be taken within 88 to 1212 days and since the Day 1010 lies in this range, we can take the second dose now.

Test case 22: The second dose needs to be taken within 22 to 1010 days since Day 1414 lies after this range, it is too late now.

Test case 33: The second dose needs to be taken within 55555555 to 66666666 days and since the Day 44444444 lies prior to this range, it is too early now.
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
	      int x = scan.nextInt();
	      int y = scan.nextInt();
	      int z = scan.nextInt();
	      
	      if(x>=y && x<=z){
	          System.out.println("Take second dose now");
	      }
	      else if(x<y){
	          System.out.println("Too Early");
	      }
	      else{
	          System.out.println("Too Late");
	      }
	      t--;
	  }
	}
}
