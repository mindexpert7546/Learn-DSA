/*
Input : 
arr = {45,66,76,56,5,5,6};
key = 66;

output : 1

*/

package Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        //creating the array 
        int[] arr = {34,56,78,66,4,33};
        int key = 78;

        //call the function and store the value in res
        int res = linearSearch(arr, key);
        System.out.println(res);

    }

    //method for linear search
    public static  int linearSearch(int arr[] , int key){

        //linear search in array
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] ==key){
                return  i;
            }
        }
        return  -1;
    }
}
