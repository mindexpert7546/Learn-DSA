/**
input : [2, 3, 6, 14, 20, 23]

output : true
*/

package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SumOfPainrs {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(14);
        list.add(20);
        list.add(23);
        int target = 23; // sum should be 23
        System.out.println(findTarget(list,target));
    }

    // function
    public static boolean findTarget(ArrayList<Integer> list, int target){
        int lP=0;
        int rP = list.size()-1;
        while (lP<rP){
            if(list.get(lP) + list.get(rP)==target) {
                return true;
            }
           else if(list.get(lP) + list.get(rP)<target){
               lP++;
            }
           else{
               rP--;
            }

        }
        return false;
    }
}
