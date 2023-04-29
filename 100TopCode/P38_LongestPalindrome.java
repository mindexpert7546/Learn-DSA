package PrepInsta;

public class P38_LongestPlandrome {
    public static void main(String[] args) {
        int arr[] = {2,121,3,161,76,123};
        System.out.println(largestPal(arr));
    }
    // function for array to find largest palindrome
    public static int largestPal(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            if(arr[i]>max && ispalNum(arr[i])){
                max = arr[i];
            }
        }
        return max;
    }
    // function for find palindrome number
    public static boolean ispalNum(int n){
        int temp = n;
        int rev = 0;
        while (n>0){
            int mod = n%10;
            rev = rev*10+mod;
            n/=10;
        }

        if(temp==rev){
            return true;
        }
        return false;
    }
}
