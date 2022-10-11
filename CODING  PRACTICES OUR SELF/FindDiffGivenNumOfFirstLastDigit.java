/** Find the diff between first and last digit of a given number ? (number should be of any digit )
 * 
 * And also handle test cases Up to n 
 */

 import java.util.Scanner;
public class FindDiffGivenNumOfFirstLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Number of test cases: ");
        int t = scan.nextInt();
        while(t>0){
            System.out.println("Enter number : ");
            int n = scan.nextInt();
            int  mod1,res;
            mod1 = n%10;
            while(n>=10){
                n=n/10;
            }
            res = mod1-n;
            System.out.println(Math.abs(res));
            t--;
        }
    }
}
