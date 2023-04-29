package PrepInsta;

import java.util.HashSet;

public class P39_CountOfDistinctElement {
    public static void main(String[] args) {
        int[] arr = {22,22,3,44,5,6,6,5,4,7,6};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
