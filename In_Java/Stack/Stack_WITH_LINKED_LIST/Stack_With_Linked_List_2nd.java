// import java.util.*;

class Stack_With_Linked_list_2nd
{
    //first we have to create a LinkedList in order to use it for stack
    //in c we used struct  but here we will create a static class
    static class Node 
    {
        int data;
        Node next;

        //Creating a default constructor
        public Node(int data)
        {
            this.data = data;
            next = null; //default initilaising to null
        }
    }

    //similar to creating a static class for linkedList we create a static class for stack data structure
    //point to keep in mind here is S is capital in Stack
    static class Stack 
    {
        //As per the concepts we have learned 
        public static Node head; //we need to implement head node from linked List


        //We can create a method here itself to check if a stack is empythy or not
        public static boolean isEmpty()
        {
            return head == null ; 
        }
        
        public void push(int data)
        {
            Node newNode = new Node(data);
            if(isEmpty())
            {
                head = newNode;
                return;
            }
            else //pro-tip -> since i have used return in if even if i don't mention else the output will be same
            {
                //Now we have gotta traverse the LinkedList to reach the end
                //but if i think once again i have no relation with other node
                //i only want the HEAD AND THAT"S IT
                
                //so
                //i want the new Node to be head
                //if head = newNode; //it wont work
                //what i want is the next of the newNode is the last head or exhead
                //i must point the new node to the next node
                newNode.next = head;
                head = newNode; 
            }
        }

        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top = head.data;
            head = head.next; //i hope this should work
            return top;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }

            return head.data;
        }
    }

    //The good old main method
    public static void main(String Args[])
    {
        //now we are talking 
        // neeed to create an object of the Stack class? i guess

        Stack s = new Stack();
        s.push(2);
        s.push(3);
        s.push(69);

        while(!s.isEmpty())
        {
            //System.out.println(s.peek());
            System.out.println(s.pop()); 
        }
    }
}