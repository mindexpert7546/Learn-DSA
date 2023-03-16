package LinkedList;

import com.sun.security.jgss.GSSUtil;

public class FindSize {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // head and tail
    private static Node head;
    private static Node tail;

    // add the element in first
    public void addFrist(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=null;
        }
        newNode.next = head;
        head = newNode;
    }

    // print the list element

    public void printList(){
        if(head==null){
            System.out.println("Empty List");
        }
        Node temp = head;
        while (temp !=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    // function for find size in list

    public int findSize(){
        if(head == null){
            return Integer.MIN_VALUE;
        }
        int sz = 0;
        Node temp = head;
        while (temp!=null){
            temp = temp.next;
            sz++;
        }
        return sz;
    }
    public static void main(String[] args) {
        FindSize fz = new FindSize();
        fz.addFrist(2);
        fz.addFrist(3);
        fz.addFrist(4);

        int siz = fz.findSize();
        System.out.println(siz);
        fz.printList();
    }
}
