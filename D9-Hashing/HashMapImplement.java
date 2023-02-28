package Hash;

import java.util.HashMap;
import java.util.Map;

public class HashMapImp {
    public static void main(String[] args) {
       HashMap<String, Integer> m = new HashMap<String , Integer>();

       m.put("Kundan", 1);
       m.put("Kumar", 2);
       m.put("Krishna", 4);

        System.out.println(m.size());

        System.out.println(m.isEmpty());

        // to print the map

        System.out.println(m);

        // to iterate the hashmap

        for(Map.Entry<String, Integer> e : m.entrySet()){
            System.out.println(e.getKey() + " " +  e.getValue());
        }
    }
}
