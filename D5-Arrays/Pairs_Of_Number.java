package Arrays;

public class AllPossiblePairs {
    public static void main(String[] args) {
        int[] arr = {23,4,5,6,79,7};
        pairs(arr);

    }
    public static void pairs(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length; j++) {
                System.out.print("(" + i+", " + j + ") ;");

            }
            System.out.println();
        }
    }
}
