/**This is basic for backtracking 
 * Example :
 * input : Arrays
 * Value : 1
 * backTrack by 2
 * output : -1 0 1 2 3
 * (Explanation if we will fill the element in array like value is started form 2
 * so it will be like that : 1,2,3,4,5 but we need to back track it by -2 so now it will be
 *  -1 0 1 2 3  because if we will backtrack it by 2 it will be 5-2, 4-2, 3-2, 2-2, 1-2 in
 *  reverse manner so.)
 *
 */

package BackTracking;

public class FillElementInArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        backTrackInArray(arr, 0, 1);
        printArray(arr);

    }

    //Function for print the array
    public static void printArray(int[] arr){
        for(int element : arr){
            System.out.print(element + " ");
        }
    }

    //Function for back tracking
    public  static void backTrackInArray(int[] arr, int i, int val){
        // Base case
        if(i==arr.length){
            return;
        }
        // Rec call for fill the element in array
        arr[i] = val;
        backTrackInArray(arr,i+1, val+1 );

        // Back track
        arr[i] = arr[i]-2;
    }
}
