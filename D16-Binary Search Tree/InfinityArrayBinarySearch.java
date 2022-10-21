package binarySearch;

public class InfinityArryBinarySearch {

    public static void main(String[] args) {
    int[] arr = {2,34,56,78,90,122,123,124,136,345};
    int target = 121;
        
        //output -1;
        // if target is 122 
        // output : 5 that is index of 122
        
    int res = binarySearch(arr, target);
        System.out.println(res);
    }
    public  static  int  binarySearch(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target>arr[end]){
            int temp = end+1;
            end = end + (end-start+1)*2;
            start = temp;
        }
        return  searchHere(arr, target, start, end);
    }

    public  static int searchHere(int[] arr, int target, int start, int end){
        while (start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else {
                return  mid;
            }
        }
        return -1;
    }
}
