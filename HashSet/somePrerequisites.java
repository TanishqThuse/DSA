import java.util.*;

import org.w3c.dom.traversal.NodeIterator;

public class somePrerequisites {

    public static class Node {

        int data;
        Node leftNode;
        Node rightNode;

        public Node(int data) {
            this.data = data;
            leftNode = null;
            rightNode= null;
        }
    }

    public static void AssigingNodesPointers(Node node, Node lNode, Node rNode) {
        node.leftNode = lNode;
        node.rightNode = rNode;
    }

    public static void printDataOfEachNode(Node node) {
        while(node.rightNode != null){
            System.out.println(node.data);
        }
    }

     public static void main(String[] args) {

        //i have made default construtor of Node as parameterised can change that too
        Node head = new Node(1);

        Node firsNode = new Node(5);
        Node secondNode = new Node(6);

        //Assiging the left and right node
        //special case for head node
        //first method
        // head.leftNode = null; //aleady done by default constructor
        // head.rightNode = firsNode;
        AssigingNodesPointers(head, null, firsNode);
        AssigingNodesPointers(firsNode, head, secondNode);
        AssigingNodesPointers(secondNode, firsNode, null);

        printDataOfEachNode(head);

     }
}