/**
 * To create matrix in array list 
 * print it 
 * itrate it 
 * 
 * exmple : 
 * output : 
 * [[2, 3, 4], [5, 6, 7], [8, 9, 10]] 
 * 0 1 2 
 * 0 1 2 
 * 0 1 2 
 */

package ArrayList;

import java.util.ArrayList;
public class MartixArrayList {
    public static void main(String[] args) {

        //Sub list
        ArrayList<Integer>  list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        ArrayList<Integer>  list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        ArrayList<Integer>  list3 = new ArrayList<>();
        list3.add(8);
        list3.add(9);
        list3.add(10);

        //Main list
        ArrayList<ArrayList>  mainList = new ArrayList<>();
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        //To print the main list
        System.out.print(mainList + " ");
        System.out.println();

        //To itrate the main list element
        for (int i = 0; i < mainList.size(); i++) {
            for (int j = 0; j <mainList.get(i).size() ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
