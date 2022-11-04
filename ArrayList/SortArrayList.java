package ArrayList;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayList {
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
        
        // To sort the array list
        Collections.sort(list);
        System.out.println(list);

        // sort the array list in reverse order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
