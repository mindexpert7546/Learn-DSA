//https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab

//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution g = new Solution();
            int ans = g.getMiddle(head);
            System.out.println(ans);
            //printList(head); 
            t--;
        }
    } 
} 
   
// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         int sz = 0;
         
         Node temp = head;
         
         while(temp!=null){
             temp=temp.next;
             sz++;
         }
         int pos = sz/2;
         
         int k=0;
         Node t = head;
         int i=0;
         while(t!=null){
             if(i==pos){
                 k=t.data;
                 break;
             }
             t=t.next;
             i++;
         }
         return k;
    }
}
