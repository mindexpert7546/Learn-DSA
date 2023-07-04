package Tree;

public class ToPrintPreOrderBinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        public  Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static class TreeBuilder {
        static int indx=-1;
        public Node buildTree(int[] node) {
            indx++;
            if(node[indx]==-1){
                return null;
            }
            Node newNode = new Node(node[indx]);
            newNode.left=buildTree(node);
            newNode.right=buildTree(node);
            return newNode;
        }
    }

    // to print the tree in preorder
    public static void preOrder(Node root){
       if(root==null){
           return;
       }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        TreeBuilder tree = new TreeBuilder();
        Node root = tree.buildTree(node);
        preOrder(root);

    }

}
