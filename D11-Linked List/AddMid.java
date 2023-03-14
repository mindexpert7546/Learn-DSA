package LinkedList;

public class AddMidElement {
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

    // add element in first

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=null;
        }
        newNode.next = head;
        head = newNode;
    }
    // add element in last

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // add element in mid

    public void addMid(int ind, int data){
        Node newNode = new Node(data);
        if(ind == 0){
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i<ind-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;


    }
    // print the list element

    public void printList(){
        Node temp = head;
        if(head==null){
            System.out.println("Empty list ");
            return;
        }
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        AddMidElement amd = new AddMidElement();
        amd.addLast(1);
        amd.addLast(2);
        amd.addLast(3);
        amd.addLast(4);
        amd.addLast(5);
        amd.addFirst(6);
        amd.addMid(2,45);

        // to print the list
        amd.printList();
    }
}
