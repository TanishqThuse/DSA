//package com.tanishq.trees;

//LevelOrder extends Binary_Tree(ancestor) and one more class(actual class)
class Qsns_on_TressBi extends Binary_Tree{
    
    public static int CountOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        else{
            
        }

        int leftNodesSum = sumOfNodes(root.left);
        int rightNodesSum = sumOfNodes(root.right);

        return leftNodesSum + rightNodesSum + root.data;
    }
    
    public static int heightOfTree(Node root){
        //in the standard example the height is 3
        //it has linear O(n) time complexity

        if(root == null){
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int myHeight = Math.max(leftHeight,rightHeight) + 1;

        return myHeight;
    }

    //Defn : The Number of nodes in the longest path between any 2 nodes
    //Or basically most farther apart nodes in tree ke beech ke nodes +vo do nodes

    //Since the time complexity is O(N^2) -> we want to optimise to O(N)
    public static int DiametreOfTree(Node root){
        /*Case 1 : It goes throught root
         * Case 2 : Diametre Does not go throught root
         * 
         * Approach 1 : O(N^2) time required 
         * {
         *      each node returns Max( left max,right max ,left+right+1 )
         *      
         * }
         */

         if(root==null){
            return 0;
         }

        int diametreOfLeft = DiametreOfTree(root.left);
        int diametreOfRight = DiametreOfTree(root.right);
        int dia_Through_ROOT = heightOfTree(root.left) + heightOfTree(root.right) + 1;
        
        int myDiametre = Math.max(dia_Through_ROOT, Math.max(diametreOfRight, diametreOfLeft)); 
        
        return myDiametre;

    }


    //The below is much more otimised with time complexity of O(n) , the previous code have time complexity of O(n^2)
    static class TreeInfo{

        int height;
        int diametre;

        TreeInfo(int height, int diametre){
            this.height = height;
            this.diametre = diametre;
        }
       
    }

    public static TreeInfo DiametreOfTreeButOptimised(Node root){
        
        if(root == null){
            return new TreeInfo(0, 0);
        }

        TreeInfo left = DiametreOfTreeButOptimised(root.left);
        TreeInfo right = DiametreOfTreeButOptimised(root.right);

        int myHeight = Math.max(left.height , right.height) + 1;
    
        //remember we tlked about 3 conditions for maximum diamtere
        /* 1. Max dia is through left node
         * 2. Max dia is thorugh right node
         * 3. Max dia passses through root , so return (height +1)
         */

        int diametreLeft = left.diametre;
        int diametreRight = right.diametre;
        int diametreThroughRoot = left.height + right.height + 1;

        int myDiametre = Math.max(Math.max(diametreLeft,diametreRight), diametreThroughRoot);

        TreeInfo myInfo = new TreeInfo(myHeight, myDiametre);
        return myInfo;
    }

    public static void main(String[] agrs){
        //Q for count of nodes:
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes); //in standar ex, it is 1(root)

        System.out.println("No. of nodes = "+ countOfNodes(root));
        System.out.println("Sum of nodes : "+sumOfNodes(root));
        System.out.println("Height of Tree : "+heightOfTree(root));        
        System.out.println("Diametre of Tree : " + DiametreOfTree(root) );
        System.out.println("Diametre of tree with O(n) time complexity : " + (DiametreOfTreeButOptimised(root)).diametre);
    }
}