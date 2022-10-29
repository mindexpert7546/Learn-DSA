package Arrays;

public class ReverseElement {
    public static void main(String[] args) {
        int[] arr = {23,4,56,78,6,32};
        reverseElement(arr);

    }
    public static void reverseElement(int[] arr){
        int s = 0;
        int e = arr.length-1;
        int temp;
        while (s<=e){
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
