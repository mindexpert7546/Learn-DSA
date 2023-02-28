package Hash;

import java.util.HashSet;
import java.util.Iterator;

public class ImplementOfHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Kundan");
        set.add("gfg");
        set.add("Kumar");
        set.add("Krishna");
        set.add("Anuj");
        set.add("Manoj");
        set.add("Vishal");
        set.add("Ajay");

        // to find the size of set
        System.out.println( set.contains("Kundan"));;
        System.out.println(set.size());

        // to remove the item from set

        set.remove("Anuj");

        // to check set is empty or not

        System.out.println(set.isEmpty());

        // avilablity of element

        System.out.println(set.contains("Ajay"));

        // To iterate the hashset

        Iterator<String> i = set.iterator();

        while (i.hasNext()){
            System.out.print(i.next() + " ");
        }
    }
}
