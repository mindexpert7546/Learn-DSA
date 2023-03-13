package LinkedList;

public class AddFirst {
    // node is created
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //head and tail
    private static Node head;
    private static Node tail;

    // add first

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=null;
        }
        newNode.next = head;
        head = newNode;
    }

    // print the linked list

    public void printList(){
        Node temp = head;
        if(head==null){
            System.out.println("Empty list");
        }
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        AddFirst ad = new AddFirst();
        ad.addFirst(4);
        ad.addFirst(5);
        ad.addFirst(6);
        ad.addFirst(7);
        ad.addFirst(8);
        ad.addFirst(9);
        ad.addFirst(10);

        ad.printList();
    }
}
