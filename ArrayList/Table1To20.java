/**
 * Create table in array list like martix
 * Table 1 to 20 
 * 
 * output : 
 * 1 2 3 4 5 6 7 8 9 10 
 * 2 4 6 8 10 12 14 16 18 20 
 * 3 6 9 12 15 18 21 24 27 30 
 * 4 8 12 16 20 24 28 32 36 40 
 * 5 10 15 20 25 30 35 40 45 50 
 * 6 12 18 24 30 36 42 48 54 60 
 * 7 14 21 28 35 42 49 56 63 70 
 * 8 16 24 32 40 48 56 64 72 80 
 * 9 18 27 36 45 54 63 72 81 90 
 * 10 20 30 40 50 60 70 80 90 100 
 * 11 22 33 44 55 66 77 88 99 110 
 * 12 24 36 48 60 72 84 96 108 120 
 * 13 26 39 52 65 78 91 104 117 130 
 * 14 28 42 56 70 84 98 112 126 140 
 * 15 30 45 60 75 90 105 120 135 150 
 * 16 32 48 64 80 96 112 128 144 160 
 * 17 34 51 68 85 102 119 136 153 170 
 * 18 36 54 72 90 108 126 144 162 180 
 * 19 38 57 76 95 114 133 152 171 190 
 * 20 40 60 80 100 120 140 160 180 200 
 */

package ArrayList;
import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;

public class TableInArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();
        ArrayList<Integer> list6 = new ArrayList<>();
        ArrayList<Integer> list7 = new ArrayList<>();
        ArrayList<Integer> list8 = new ArrayList<>();
        ArrayList<Integer> list9 = new ArrayList<>();
        ArrayList<Integer> list10 = new ArrayList<>();
        ArrayList<Integer> list11= new ArrayList<>();
        ArrayList<Integer> list12= new ArrayList<>();
        ArrayList<Integer> list13= new ArrayList<>();
        ArrayList<Integer> list14= new ArrayList<>();
        ArrayList<Integer> list15= new ArrayList<>();
        ArrayList<Integer> list16= new ArrayList<>();
        ArrayList<Integer> list17= new ArrayList<>();
        ArrayList<Integer> list18= new ArrayList<>();
        ArrayList<Integer> list19= new ArrayList<>();
        ArrayList<Integer> list20= new ArrayList<>();


        for (int i = 1; i <=10; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
            list4.add(i*4);
            list5.add(i*5);
            list6.add(i*6);
            list7.add(i*7);
            list8.add(i*8);
            list9.add(i*9);
            list10.add(i*10);
            list11.add(i*11);
            list12.add(i*12);
            list13.add(i*13);
            list14.add(i*14);
            list15.add(i*15);
            list16.add(i*16);
            list17.add(i*17);
            list18.add(i*18);
            list19.add(i*19);
            list20.add(i*20);
        }

        //Add it in main list
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        mainList.add(list4);
        mainList.add(list5);
        mainList.add(list6);
        mainList.add(list7);
        mainList.add(list8);
        mainList.add(list9);
        mainList.add(list10);
        mainList.add(list11);
        mainList.add(list12);
        mainList.add(list13);
        mainList.add(list14);
        mainList.add(list15);
        mainList.add(list16);
        mainList.add(list17);
        mainList.add(list18);
        mainList.add(list19);
        mainList.add(list20);

        //System.out.println(mainList);

        // To itrate the array list

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);

            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }


    }
}
