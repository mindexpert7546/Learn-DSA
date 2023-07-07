

//https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
//{ Driver Code Starts
import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Is_LinkedList_Palindrom
{
	 Node head;  
	 Node tail;
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Solution g = new Solution();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}




// } Driver Code Ends


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        
        
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        
        Node temp = head;
        while(temp!=null){
            stack.push(temp.data);
            queue.add(temp.data);
            temp = temp.next;
        }
        
        boolean flag = true;
        if(stack.size()!=queue.size())return false;
        
        while(!stack.isEmpty()){
            if(stack.peek()!=queue.peek()){
                flag = false;
                break;
            }
            stack.pop();
            queue.remove();
        }
        
        return flag;
        /*
       StringBuilder sb = new StringBuilder("");
      // StringBuilder sb1 = new StringBuilder("");
       
       Node temp = head;
       while(temp!=null){
           sb.append(temp.data);
           temp = temp.next;
       }
       
       String str = sb.toString();
       String str1 = sb.reverse().toString();
       
       if(str.equals(str1))return true;
       return false;
       
       */
    }    
}

