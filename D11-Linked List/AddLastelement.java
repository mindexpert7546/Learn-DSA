package LinkedList;

public class AddLastElement {
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

    // add last

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next = newNode;
        tail = newNode;
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
        AddLastElement adl = new AddLastElement();
        adl.addLast(34);
        adl.addLast(35);
        adl.addLast(36);
        adl.addLast(37);
        adl.addLast(38);
        adl.addLast(39);
        adl.addLast(40);

        adl.printList();
    }
}
