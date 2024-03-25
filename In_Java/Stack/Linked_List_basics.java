import java.util.io;

//The actual linkedList
public class LinkedList {

    Node head; //head of the list

    //Linked list Node
    static class Node {
        int data;
        Node next;

        //constructor for that 
        Node(int data)
        {
            this.data = data;
            next = null; 
            //the above is a default constructor to initialize the pointer to null
        }

    //Now we create a method to insert a node
    public static LinkedList insert(LinkedList list,int data)
    {
        //Creating a new nodw witht the given data
        Node newNode = new Node(data);

        //if the Linked List is empty,
        //then make the new node as head

        if(list.head == null)
        {
            list.head = newNode;
        }
        else{
            //Now we have to traverse till the last node
            //after we traverse till the last node then place the newNode there

            Node last = list.head;
            //coz initially we want last node to be equal to that one

            while(last.next != null)
            {
                last = last.next;
            }
            //now after the loop ends we are standing at the last node

            //assuming the data was already inserted in the original list,now we have pointer the last node to the new node
            last.next = newNode;
        }

        //Retur the list by the head
        return list ; //im not quite sure about this
    }
        //now i need a method to print the LinkedList
        public static void printList(LinkedList list) //LinkedList is class name and list is the name of the class
        {
            //what on earth is curr?
            Node currNode = list.head;
            //Edit : i have created a new node which i will use to rtraverse the entire list

            System.out.println("LinkedList : ");

            //Now we have to traverse through the LinkedList
            while(currNode != null) {
                //Print the data at the present node
                System.out.println(currNode.data + "");

                //Also go the next node
                currNode = currNode.next;
            }
        }
    }
}