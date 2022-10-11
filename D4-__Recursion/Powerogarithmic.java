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
        if(n==0){
            return 1;
        } 
        int res1 = power(x,n/2);
        
        int res = res1*res1;
        
        if(n%2==1){
            res = res*x;
        }
        
        return res;
        
    }

}
