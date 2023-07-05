

package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeverTraversal {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }



    }
    // To build tree
    public static class BuildTree{
        static int indx = -1;
        public Node builder(int[] node){
            indx++;
            if(node[indx]==-1){
                return null;
            }
            Node newNode = new Node(node[indx]);
            newNode.left=builder(node);
            newNode.right=builder(node);
            return newNode;
        }
    }

    // level order traversal

    public static void leverOrder(Node root){
        if(root==null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            Node currNode = queue.remove();
            if(currNode==null){
                System.out.println();
                if(queue.isEmpty()){
                    break;
                }
                else{
                    queue.add(null);
                }
            }
            else {
                System.out.print(currNode.data+ " ");
                if(currNode.left!=null){
                    queue.add(currNode.left);
                }
                if(currNode.right!=null){
                    queue.add(currNode.right);
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BuildTree tree = new BuildTree();
        Node root = tree.builder(node);
        leverOrder(root);
    }
}
