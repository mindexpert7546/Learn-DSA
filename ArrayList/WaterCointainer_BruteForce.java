/**
input : [23, 3, 22, 13, 6, 61]
output : 115

*/

package ArrayList;

import java.util.ArrayList;

public class WaterContainer {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(3);
        list.add(22);
        list.add(13);
        list.add(6);
        list.add(61);
        System.out.println(list);
        System.out.println(containgerWater(list));

    }
    // Create function for container water
    public static int containgerWater(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        int h,w,waterContain;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                h = Math.min(list.get(i),list.get(j));
                if(i==j){
                    w =1;
                }else{
                    w = j-i;
                }
                waterContain = h*w;
                max = Math.max(max,waterContain);
            }
        }
        return max;
    }
}
