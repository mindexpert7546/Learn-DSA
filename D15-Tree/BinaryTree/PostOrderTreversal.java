
package Tree;

public class PostOrderTraversal {
    public static class Node{
            int data;
            Node left;
            Node right;
            Node(int data){
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }

        // Build tree
    public static class Tree{
        static int indx=-1;
        public  Node buildTree(int[] node){
            indx++;
            if(node[indx]==-1){
                return null;
            }
            Node newNode = new Node(node[indx]);
            newNode.left=buildTree(node);
            newNode.right=buildTree(node);
            return newNode;
        }

        // post order traversal


    }

    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
       
        postOrder(root.right);
         System.out.print(root.data+ " ");
    }

    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree t = new Tree();
        Node root = t.buildTree(node);
        postOrder(root);

    }
}
