package DevideAndConcer;

public class MergeShortImplement {
    public static void main(String[] args) {
        int[] arrr = {76,5,45,43,23,6};

        //call the shorting funcion
        divideArrayRecursion(arrr,0,arrr.length-1);
        //call function for print element
        printShortedArray(arrr);
    }

    //to print the shorted array

    public static void printShortedArray(int[] arr){
        for(int element:arr){
            System.out.print(element + " ");
        }
    }

    //divide for shorting

    public static void divideArrayRecursion(int[] arr, int start, int end){

        //base case
        if(start>=end){
            return;
        }

        // to find the mid value

        int mid = start + (end-start)/2;

        //left recursion division

        divideArrayRecursion(arr,start,mid);

        //right recursion division

        divideArrayRecursion(arr,mid+1, end);

        // call function for merge
        mergeFun(arr, start, mid, end);
    }

    //to create merge function for merge shorted array

    public static void mergeFun(int[] arr, int start, int mid, int end){
        //create temp array
        int[] temp = new int[end-start+1];
        //to create index
        int i=start;//index for left short
        int j= mid+1; //index for right short
        int k=0; // index for temp array
        //to merge
        while (i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // merge remain left

        while (i<=mid){
            temp[k++] = arr[i++];
        }
        //merge remain right

        while (j<=end){
            temp[k++]=arr[j++];
        }
        //copy the temp array
        for(int m=0,l=start; m<temp.length; l++,m++){
            arr[l]=temp[m];
        }
    }

}
