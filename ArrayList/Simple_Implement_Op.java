

package ArrayList;

// Importing the array list package
import java.util.ArrayList;
public class BasicArrayList {
    public static void main(String[] args) {

        //To implement the arrayList in java
        ArrayList<Integer> list = new ArrayList<>();

        //To add element in arraylist
        //Time complexity of add operation is O(1) that is constant time complexity
        list.add(56);
        list.add(536);
        list.add(56);
        list.add(536);
        list.add(456);
        list.add(566);
        list.add(956);

        // To print the array list
        System.out.println(list);

        //Get element form array List
        //Time complexity of get operation is O(1) that is constant time complexity
        System.out.println(list.get(3));

        //To remove the element form array list
        //Time complexity of remove opertation is O(n)
        list.remove(4);
        System.out.println(list);

        //Set element at any index
        //Time complexity of set operation is O(n)
        list.set(3,676);
        System.out.println(list);

        //add element at any index
        //Time complexity of add index is O(n)

        list.add(2,4567);
        System.out.println(list);

        // Check any particular element is avilable or not
        //list.contains(elementName);
        // it will show boolean value like true or false
        System.out.println(list.contains(45));

        // To find the size of array List
        System.out.println(list.size());

        // To itrate the element of Array List
        //By simple for loop to itrate the arrayList element

        for (int i = 0; i <list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // By for each loop itrate the arraylist element
        for(int element : list){
            System.out.print(element + " ");
        }
    }

}
