import java.util.*;

public class LevelOrder extends BinaryTree_levelOrderTraversal {

    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>(); // Use LinkedList or another class implementing Queue
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        levelOrder(root);
    }
}


// import java.util.*;

// public class LevelOrder extends BinaryTree_levelOrderTraversal {

//     public static void levelOrder(Node root) {
//         Queue<Node> q = new LinkedList<>(); // Corrected the typo here
//         q.add(root);
//         q.add(null);

//         while (!q.isEmpty()) {
//             Node currNode = q.remove();
//             if (currNode == null) {
//                 System.out.println();
//                 if (q.isEmpty()) {
//                     break;
//                 } else {
//                     q.add(null);
//                 }
//             } else {
//                 System.out.print(currNode.data + " ");
//                 if (currNode.left != null) {
//                     q.add(currNode.left);
//                 }
//                 if (currNode.right != null) {
//                     q.add(currNode.right);
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);
// x
//         levelOrder(root);
//     }
// }

// // // import com.tanishq.queueus.*;

// // import java.util.*;
// // public class LevelOrder extends BinaryTree_levelOrderTraversal {

// //     public static void levelOrder(Node root) {
// //         Queue<Node> q = new LinkeList<>();
// //         q.add(root);
// //         q.add(null); 
// //         //the reason i add null is i get help in getting on next line

// //         while(!q.isEmpty()){
// //             Node currNode = q.remove();
// //             if(currNode == null) {
// //                 System.out.println();

// //                 if(q.isEmpty()){
// //                     break;
// //                 }
// //                 else{
// //                     q.add(null);
// //                 }
// //             }
// //             else{
// //                 System.out.println(currNode.data + " ");
// //                 if(currNode.left != null){
// //                     q.add(currNode.left);
// //                 }
// //                 if(currNode.right != null){
// //                     q.add(currNode.right);
// //                 }
// //             }
            
// //         }
// //     }
// //     public static void main(String[] args){
           
// //         int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
// //         BinaryTree tree = new BinaryTree();
// //         Node root = tree.buildTree(nodes);

// //         levelOrder(root);

// //         // while(!q.isEmpty()){

// //         // }
// //     }
// // }