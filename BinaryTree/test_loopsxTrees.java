
public class test_loopsxTrees extends Binary_Tree{
    //even though i have exteneted it from Binary_Tree class, i still wanna learn how to buildTress so i am string wiriting the methods for it

    static class Node extends BinaryTree{
        int data;
        Node left;
        Node right;
       
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //practise the below code
    static class BinaryTree extends Binary_Tree {
        static int index = -1;
        public static Node buildTree(int nodes[]) {
            index++;
            //for the first time index++ -> it refers to 0th index
            
            if(nodes[index] == -1) {
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
        
        public static Node rootLevelUp(Node root, Node root2){
            
        }

        public static void printNodes(Node root){
            Node root2 = root;

            while(root!=null){
                if(root.left==null){
                    System.out.println(root.data);
                    root = rootLevelUp(root,root2);
                }
            }
        }

        public static void main(String[] args){
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);

            System.out.println(countOfNodes(root));

            printNodes(root);
        }
    }
} 