public class Create_PreOrder_Tree_from_Sequence {

     static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class PreOrderBuildTree{
        static int idx = -1;

        public static Node buildTree(int nodes[]){
            idx++;

            if (nodes[idx] == -1)
                return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }



    public static void main(String[] args) {
       int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       PreOrderBuildTree tree = new PreOrderBuildTree();
       Node root = tree.buildTree(nodes);
       System.out.println(root.data);
       System.out.println(root.left.data);
       System.out.println(root.right.data);
       System.out.println(root.left.left.data);
       System.out.println(root.left.right.data);
    }
}
