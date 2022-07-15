public class Preorder_Inorder_Postorder_traversal {
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

    public static void preorder_traversing(Node root){
        if (root == null)
            return;

        System.out.print(root.data+" ");
        preorder_traversing(root.left);
        preorder_traversing(root.right);
    }

    public static void inorder_traversing(Node root){
        if (root == null)
            return;

        inorder_traversing(root.left);
        System.out.print(root.data+" ");
        inorder_traversing(root.right);

    }

    public static void postorder_traversing(Node root){
        if (root == null)
            return;

        postorder_traversing(root.left);
        postorder_traversing(root.right);
        System.out.print(root.data+" ");


    }




    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        PreOrderBuildTree tree = new PreOrderBuildTree();
        Node root = tree.buildTree(nodes);
        System.out.println("**************Pre-order*************");
        preorder_traversing(root);
        System.out.println();
        System.out.println("************In-order*************");
        inorder_traversing(root);
        System.out.println();
        System.out.println("************Post-order*************");
        postorder_traversing(root);

    }
}
