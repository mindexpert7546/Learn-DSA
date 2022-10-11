

public class SimpleLInkedList {

     private Node head;
     private Node tail;
     private int size;
     public SimpleLInkedList(){
         this.size=0;
     }

     //to insert value in linkedlist
     public void InsertValue(int val){
         Node node = new Node(val);
         node.next = head;
         head = node;
         if(tail ==null){
             tail=head;
         }
         size=+1;
     }

     //to display element 
     public void display(){
         Node temp = head;
         while(temp !=null){
             System.out.print(temp.value + "->");
             temp = temp.next;
         }
        
     }
//Creating node 
    private class Node{
        private int value;
        private Node next;

        //creating constructure for Node 
        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String[] args) {

        //creating object of class 
        SimpleLInkedList sll = new SimpleLInkedList();

        //inserting the value 
        sll.InsertValue(23);
        sll.InsertValue(232);
        sll.InsertValue(223);
        sll.InsertValue(2223);
        sll.InsertValue(232);
        sll.InsertValue(2223);

        //displaying the vlaue
        sll.display();
    }
}
