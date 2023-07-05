package Tree;

public class HeightofTreee {
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

    // to build the tree
    public static class TreeBuilder{
        static int indx = -1;
        public Node treeBuilder(int[] node){
            indx++;
            if(node[indx]==-1){
                return null;
            }
            Node newNode = new Node(node[indx]);
            newNode.left=treeBuilder(node);
            newNode.right=treeBuilder(node);
            return newNode;
        }
    }

    // to find the size of the tree

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lsize = height(root.left);
        int rsize = height(root.right);
        int res = Math.max(lsize,rsize)+1;
        return res;
    }
    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        TreeBuilder t = new TreeBuilder();
        Node root = t.treeBuilder(node);
        System.out.println(height(root));
    }
}
