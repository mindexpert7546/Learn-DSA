package Arrays;

public class BinarySearchInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8,9,15,43};
        int key = 7;
        int res = binarySearch(arr,key);
        System.out.println(res);
    }

    public  static  int binarySearch(int[] arr, int key){
        int s = 0;
        int e = arr.length-1;
        while (s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] ==key){
                return  mid;
            }
            else  if(arr[mid]<key){
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        }
        return -1;
    }
}
