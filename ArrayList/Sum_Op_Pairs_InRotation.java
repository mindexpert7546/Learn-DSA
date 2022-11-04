package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SumOfPairsRotation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //sorted and rotated list
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target =17; //sum should be equals to 16

        //function calling
        System.out.println(sumOfParisRot(list,target));

    }
    public static boolean sumOfParisRot(ArrayList<Integer> list,int target){

        // to find breaking point
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)> list.get(i+1)){
                bp=i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;

        while (lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)>target){
                rp = (list.size()+rp-1)%list.size();
            }
            else {
                lp = (lp+1)%list.size();
            }
        }
    return false;
    }
}
