package Arrays;

public class ToFindLargestNum {
    public static void main(String[] args) {
        int[] arr = {3,4,34,56,78,2,45,98};

        //to call the function
        int res = largestNum(arr);
        System.out.println(res);
    }

    //function for find largest number from array

    public  static  int largestNum(int[] arr){
        int min = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if(min < arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
