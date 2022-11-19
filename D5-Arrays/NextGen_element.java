/**
 * input : 6,8,1,3,6
 * output : 8 -1 3 6 -1
 */


package Arrays;

public class GextGenElement {
    public static void main(String[] args) {
        int[] arr = {6,8,1,3,6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    arr[i] = arr[j];
                    break;
                }
                else {
                    arr[i] = -1;
                    break;
                }
            }
            if(i+1==arr.length){
                arr[i]=-1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
