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
	int T = scan.nextInt();
	//Alice driving (Distance ->A kilometers and Time ->X Hour)
    //Bob driving (Distance -> B kilometers  and Time ->Y Hour)	
	float A,X,B,Y;

	while(T>0){
	    
	    A = scan.nextFloat();
	    X = scan.nextFloat();
	    
	    B = scan.nextFloat();
	    Y = scan.nextFloat();
	    
	    float speed_of_Alice = A/X;
	    float speed_of_Bob = B/Y;
	    if(speed_of_Alice>speed_of_Bob){
	        System.out.println("Alice");
	    }
	    else if(speed_of_Alice<speed_of_Bob){
	        System.out.println("Bob");
	    }
	    else{
	        System.out.println("Equal");
	    }
	      
	    T--;
	}
	}
}
