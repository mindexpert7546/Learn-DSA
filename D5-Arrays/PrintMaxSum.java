/*

input : 
 arr = {2,-1,6,56,78,43};

output: 

2 
2 -1 
2 -1 6 
2 -1 6 56 
2 -1 6 56 78 
2 -1 6 56 78 43 

-1 
-1 6 
-1 6 56 
-1 6 56 78 
-1 6 56 78 43 

6 
6 56 
6 56 78 
6 56 78 43 

56 
56 78 
56 78 43 

78 
78 43 

43 

184

*/

package Arrays;

public class MaximumSum {
    public static void main(String[] args) {
        int[] arr = {2,-1,6,56,78,43};
        subArrays(arr);
    }
    public  static  void subArrays(int[] arr){
        int max = Integer.MIN_VALUE;


        for (int i = 0; i <arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <=end ; k++) {
                    System.out.print(arr[k] + " ");

                    sum = sum+arr[k];
                    if(max<sum){
                        max = sum;
                    }


                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(max);
    }
}
