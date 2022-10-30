package Shorting;

public class ShortingC {
    public static void main(String[] args) {
        int[] arr = {9,7,5,4,5,7,2,3};
      //  bubbleShort(arr);
      //  selectionShort(arr);
        insertation(arr);
        printNow(arr);

    }

    //Bubble short
    public static void bubbleShort(int[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;

                    flag = true;
                }
            }
            if(flag==false){
                break;
            }
        }
    }

    //selection short

    public static void selectionShort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[max]>arr[j]){
                    max=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
    }

    //insertation short

    public static void insertation(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int pre = i-1;
            while (pre>=0 && arr[pre]>curr){
                arr[pre+1]=arr[pre];
                pre--;
            }
            arr[pre+1]=curr;
        }
    }
    public static void printNow(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
