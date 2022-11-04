/**
 * To Find maximum number form the array List
 * Example : arr = {23,4,565,778,66,55}
 * Output : 778
 *
 */

package ArrayList;
import  java.util.ArrayList;
public class FindMaxNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(918);
        list.add(20);
        list.add(56);
        list.add(65);
        list.add(43);
        list.add(98);
        list.add(26);
        list.add(53);
        list.add(73);
        list.add(90);

        // Call the max function

        System.out.println(maxElement(list));
    }

    //Function for return max element form the arraylist

    public static int maxElement(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;

        //Method 1
//        for (int i = 0; i < list.size(); i++) {
//            if(max<list.get(i)){
//                max = list.get(i);
//            }
//        }

        // Method 2 Bys usint math funcion
        for (int i = 0; i < list.size(); i++) {
             max = Math.max(max, list.get(i));
        }


        return max;
    }
}
