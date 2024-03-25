
//This code is dead since i have not yet understood the logic for this code

//Binary_Tree is grandparent of this class
public class LeetcodeCheckSubtree extends Qsns_on_TressBi {

    public static boolean isIdentical(Node root, Node subRoot) {
        
        if(subRoot == null || root == null) {
            return true;
        }

        // if(root == null){
        //     return false;
        // }

        if(root.data == subRoot.data){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        
        return false;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if(subRoot == null && root == null){
            return true;
        }
        else if(root == null || subRoot == null){
            return false;
        }

        if(root.data == subRoot.data) {
            return isIdentical(root, subRoot);
        }

        return isSubtree(root.left, subRoot.left) || isSubtree(root.right, subRoot.right);
        
    }

    //Program continued for finding sum of nodes at a specified height
    // public static int sumOfNodesAtSpecificHeight(Node root, int height, int sum){
    //     if(root == null){
    //         return 0;
    //     }
    //     else if(heightOfTree(root) == height){
    //         sum = sum+root.data;
    //         return sum;
    //     }
    //     else if(heightOfTree(root) > height){
    //         sum = sum + sumOfNodesAtSpecificHeight(root.left, height, sum);
    //         sum = sum + sumOfNodesAtSpecificHeight(root.right, height, sum);
    //     }
    //     else{
    //         return 0;
    //     }
    //     return sum;
        
    // }
    public static int sumOfNodesAtSpecificHeight(Node root, int targetHeight, int currentHeight) {
        if (root == null) {
            return 0;
        }
    
        if (currentHeight == targetHeight) {
            return root.data;
        }
    
        // Recursively compute the sum of nodes at the target height in the left and right subtrees
        return sumOfNodesAtSpecificHeight(root.left, targetHeight, currentHeight + 1)
             + sumOfNodesAtSpecificHeight(root.right, targetHeight, currentHeight + 1);
    }
    

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // int n[] = {8,4,-1,-1,-1} ;
        int n[] = {2, 4, 5, -1, -1, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node rootOfOriginalTree = tree.buildTree(nodes);
        Node rootOfSubtree = tree.buildTree(n);


        System.out.println("Is Subtree? ->" + isSubtree(rootOfOriginalTree, rootOfSubtree));
        System.out.println("Is isIdentical? ->" +isIdentical(rootOfOriginalTree, rootOfSubtree));

        int sum=0;
        //The below code is not working perfectly
        System.out.println("Sum at height = 3 is " + sumOfNodesAtSpecificHeight(rootOfOriginalTree , 3 , 1));

    }
    
}