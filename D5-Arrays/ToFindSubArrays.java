/*
input : 
arr = {2,4,6,5,8,9}

output : 

0 
0 1 
0 1 2 
0 1 2 3 
0 1 2 3 4 


1 
1 2 
1 2 3 
1 2 3 4 


2 
2 3 
2 3 4 


3 
3 4 


4 
*/

package Arrays;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {2,4,6,5,8,9};
        subArrays(arr);
    }
    public  static  void subArrays(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <end ; k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
