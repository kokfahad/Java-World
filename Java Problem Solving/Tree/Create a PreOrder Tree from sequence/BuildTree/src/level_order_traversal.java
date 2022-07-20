import java.util.*;

public class level_order_traversal {
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

    public static void level_order_traversal(Node root){
        if (root == null)
            return;
        Queue<Node>queue= new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            Node currNode = queue.remove();
            if (currNode == null){
                System.out.println();
                if (queue.isEmpty()){
                    break;
                }else {
                    queue.add(null);
                }
            }else {
                System.out.print(currNode.data+ " ");
                if (currNode.left != null){
                    queue.add(currNode.left);
                }
                if (currNode.right != null){
                    queue.add(currNode.right);
                }
            }
        }
    }




    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        PreOrderBuildTree tree = new PreOrderBuildTree();
        Node root = tree.buildTree(nodes);
        level_order_traversal(root);

    }
}
