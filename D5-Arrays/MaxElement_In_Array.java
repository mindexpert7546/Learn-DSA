/*
 input : 34,56,4,65,87,3,4
 output : 87 (This is max element in array);
*/


public class MaxValueInArray {

    public static void main(String[] args) {
        int[] arr = {34,56,4,65,87,3,4};
        System.out.println( Maxelement(arr));
    }
    public  static  int Maxelement(int[] arr){
        int minValue =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
