

package Tree;

public class InOrderTraversal {
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
    public static class BinaryTreeBuild{
        static int indx = -1;
        public  Node buildtree(int[] node){
            indx++;
            if(node[indx]==-1){
                return null;
            }
            Node newNode = new Node(node[indx]);
            newNode.left=buildtree(node);
            newNode.right=buildtree(node);
            return newNode;
        }
    }

    // Inorder traversal
    public static void inOrderTreversal(Node root){
        if(root==null){
            return;
        }
        inOrderTreversal(root.left);
        System.out.print(root.data +" ");
        inOrderTreversal(root.right);
    }
    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeBuild tree = new BinaryTreeBuild();
        Node root = tree.buildtree(node);
       // System.out.println(root.data);
        inOrderTreversal(root);
    }
}
