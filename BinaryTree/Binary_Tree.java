
public class Binary_Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;
        public static Node buildTree(int nodes[]) {
            index++;
            //for the first time index++ -> it refers to 0th index
            
            if(index >= nodes.length || nodes[index] == -1) {
                return null;
            }

            //if we have successfully surpassed the if condition 
            //it means the node needs some children on left or right
            
            //by default every index wiill have some index and it's null if at the index the value is null 

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    /*In preorder traversal we have to print
     * the entire eft nodes of root and then ther left of the left 
     * and their right and then the entire right of ther root statrting with
     * left of right and then right of right and end
     */
    //Basically :
    /*
     * 1)The root subtree
     * 2)The left subtree
     * 3)The right subtree
     */
    public static void preorder(Node root) {
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //Inorder traversal 
    // * 1)The left subtree
    // * 2)The root subtree
    // * 3)The right subtree
    public static void Inorder(Node root){
        if(root == null) {
            return;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    //Postorder traversal
    /* 1)Left subtree
     * 2)Right subtree
     *3) Root subtree
     */
    public static void postorder(Node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
        
    }

    //Level Order Traversal
    /*Print the elemtns in levels */
    //also use Queue for FIFO property
    public static void levelorder(Node root) {
    //DONE IN ANOTHER CLASS    
    }

    public static int countOfNodes(Node root){
        // Node newnNode = new Node();

        if(root == null){
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }
 
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(countOfNodes(root));

        // tree.preorder(nodes);

        // Inorder(root);
        // System.out.println();
        //  preorder(root);
        //Preorder Traversal
        //Traverse to each node of tree and print it's data

        // BinaryTree t = new BinaryTree();
        // Node root1 = tree.TraversePrint(nodes);
    }
}