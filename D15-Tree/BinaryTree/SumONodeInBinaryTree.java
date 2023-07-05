

package Tree;

public class SumOfNodes {
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

    // to build the treee

    public static class BuildTree{
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

    // to find the sum of the nodes
    public static int sum(Node root){
        if(root==null){
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        int res = leftSum+rightSum+root.data;
        return res;
    }
    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BuildTree tree = new BuildTree();
        Node root = tree.treeBuilder(node);
        System.out.println(sum(root));
    }
}
