package Arrays;

public class AllPossiblePairs {
    public static void main(String[] args) {
        int[] arr = {23,4,5,6,79,7};
        pairs(arr);

    }
    public static void pairs(int[] arr){
        //to find numbers of pairs
        int cp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                System.out.print("(" + arr[i]+", " + arr[j] + ") ;");
                cp++;

            }
            System.out.println();
        }
        System.out.println(cp);
    }
}
