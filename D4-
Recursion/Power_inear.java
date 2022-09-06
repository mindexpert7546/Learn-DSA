import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      int x = scan.nextInt();
      int n = scan.nextInt();
      
      int res = power(x,n);
      System.out.println(res);
      
    }

    public static int power(int x, int n){
        // return 0;
        
        if(n==0){
            return 1;
        }
        
        return x*power(x,n-1);
    }

}
