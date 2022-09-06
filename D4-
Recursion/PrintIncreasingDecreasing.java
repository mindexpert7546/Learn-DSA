import java.io.*;
import java.util.*;
//Class 
public class Main 
{

  //Main Method : 
    public static void main(String[] args) throws Exception 
    {
      Scanner scan = new Scanner(System.in);
      
      int n = scan.nextInt();
      pdi(n);
    }
//Recursion Function : 
    public static void pdi(int n)
    {
        
        if(n==0)
        {
            return;
        }
        
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
        
    }

}
