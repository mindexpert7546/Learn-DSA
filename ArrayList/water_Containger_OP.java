package ArrayList;

import java.util.ArrayList;

public class WaterContainerOp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(3);
        list.add(22);
        list.add(13);
        list.add(6);
        list.add(61);
        System.out.println(waterC(list));

    }
    //function for water container
    public static int waterC(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        int lP = 0;
        int rP = list.size()-1;

        while (lP<=rP){
            int h = Math.min(list.get(lP), list.get(rP));
            int w = rP-lP;
            int resW = h*w;
            max = Math.max(max,resW);
            if(lP<rP){
                lP++;
            }else{
                rP--;
            }
        }
        return max;
    }
}
