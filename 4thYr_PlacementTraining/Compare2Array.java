package Year_4th_PlacementTraining.May11_Assignment;
import java.util.Scanner;
public class CompareArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int k = 0;
        System.out.println("Enter first array element : ");
        for (int i = 0; i < n; i++) {
            arr1[i]=scan.nextInt();
        }
        System.out.println("Enter second array element : ");
        for (int i = 0; i < n; i++) {
            arr2[i]=scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr1[i]==arr2[i]){
                k++;
            }
        }
        System.out.println(k==n?"Yes":"No");
    }
}
