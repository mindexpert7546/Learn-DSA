

package Tree;

public class CountNode {
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

    // to build tree
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

    // to count the node in tree
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        int res = leftCount+rightCount+1;
        return res;
    }
    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        TreeBuilder tree = new TreeBuilder();
        Node root = tree.treeBuilder(node);
        System.out.println(count(root));

    }
}
