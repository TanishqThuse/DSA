/*WHat is BST? :
 * Data at ,
 * 1)Left subtree nodes < root
 * 2)Right subtree nodes > root
 * 3)Left and right subtree are also BST with no duplicates

    Recap of previous orders : 
    Preorder traversal : Root value, LS(Left subtree) , RS
    Inorder traversal : LS, Root, RS
    Postorder traversal :  LS, RS, Root

    POV-> BST gives an sorted sequence for Inorder traversal

 */

 /*A special property is we can implement binary searchalgorithm here
  * 1) The time complexity of Binary search is O(log n)
  * O(log n) = O(H) , O(Height)
  *
    Skewed tress -> Balanced nahi he ek hi direction me tree nikal rha he 
    SO skeweed trees ki time complexity is O(n) worset worst case so O(H) is suitable

    Most of the problems are solved by recursion and apply kaizen method os making problems simpler
  */

    /*Creating a BST
     * 
     *  
     */

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;
import java.util.*;

public class BST {
    
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root,int data) {
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(root.data > data) {
            root.left = insert(root.left, data);
        }
        else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static void Inorder(Node root) {
        if(root == null) {
            return ;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void Preorder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void Postorder(Node root) {
        if(root == null) {
            return;
        }

        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }

    //The time complexity of this is O(H) 
    public static boolean isPresent(Node root, int key){ 
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        }
        else if(root.data > key) {
            return isPresent(root.left, key);
        }
        else if(root.data < key) {
            return isPresent(root.right, key);
        }
        else{
            return false;
        }
    }

    /* Deletion of a node : 
     * 
     * 1)If the node is a leaf(no child) --> aram se kardo
     * 2)If the node has one single child --> uske parent ko vo node se link kardo
     * 3)If the node has 2 childs --> {
     *      search for inorder successor
     *      If the node has 2 children then like 1 on Left and 6 on right, the inorder successor is 6
     *      here, replace the root node(which is being removed) with 6 so as to maintain the logic of bigger numbers being on right
     * 
     *      Inorder successor is always the leftmost value in right subtree
     * }
     * Let's write the code for it !
     */
    public static Node deleteUsingBinarrySearch(Node root, int key ){
        if(root == null){

        }

        if(root.data > key) {
            root.left = deleteUsingBinarrySearch(root.left, key);
            return root;
        }
        else if(root.data < key) {
            root.right = deleteUsingBinarrySearch(root.right, key);
            return root;
        }
        else { // root.data == key

            //Case 1 :
            if(root.left == null && root.right == null) {
                return null;
            }

            //Case 2 : Only 1 child is present
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }

            //Case 3 : If both the child are present
            // if(root.left!=null && root.right!=null) {
                
            // } No need to write as it it true anyways
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteUsingBinarrySearch(root.right, key);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root){
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }
    
    //Incorrect function not working 
    public static Node deleteUsingLinearMethod(Node root, int key, int timeComplexity){
        if(root.data > key){
            root.left = deleteUsingBinarrySearch(root, key);
            return root;
        }
        else if(root.data < key){
            root.right = deleteUsingBinarrySearch(root, key);
            return root;
        }
        else{ //root.data = value
            
            //Case 1 : No children
            if(root.left == null && root.right == null){
                return null;
            }
            else{
                return null;
            }
            //Case 2 : 



        }
    }

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int values[] = {5,1,3,4,2,7};
        // int values[] = {11,1,2,4,6,8,12,14,10,3,9,15,5,7,13};
        Node root = null;

        //Creating tree
        for(int i=0; i<values.length ; i++){
            root = insert(root, values[i]);
        }

        System.out.println("The BST printed in Inorder form is : ");
        Inorder(root);
        System.out.println();

        System.out.println("The BST printed in Preorder form is : ");
        Preorder(root);
        System.out.println();

        System.out.println("The BST printed in Postorder form is : ");
        Postorder(root);
        System.out.println();

        int c = 3;
        System.out.println(c+" is Present in BST? : " + isPresent(root, c));

        //Practise deletion of Node by yourself for clearance
        System.out.println("Before deleting 7 : " );
        Inorder(root);
        System.out.println();

        System.out.println("After deleting 7 : ");
        root = deleteUsingBinarrySearch(root, 7);
        Inorder(root);
    
    }
}