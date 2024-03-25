package com.tanishq.queueus;
//I can also write code for queue in a seperate file and this class will extent the queue file
public class Queue extends BinaryTree_levelOrderTraversal
{
    // @Override

    //I am addiding the level Order Traversal using Queue or binary data structure
    //here caue of less khichdi

    //We have to use a queue
    public static class Queue{
        int arr[] = new int[5];
        int front, rear;

        public boolean isEmpty()
        {
            return front==rear;    
        }

        public void hello(){
            System.out.println("Hello :)");
        }

        public void enQueue(int data){
            if(isEmpty()){
                arr[front%5] = data;
                rear++;
                return; 
            }
            //we do %5 to make sure the queue is circular
            arr[rear%5] = data;
            rear++;
        }

        public int deQueue(){
            if(isEmpty()){
                System.out.println("EMPTY WHAT DO YOU EXPECT?");
                return 0;
            }

            int top = arr[front%5];
            arr[front%5] = -1;
            front++;
            return top;
        }

        public int peek() {
            return arr[front%5];
        }

        public void show() {
            if(isEmpty()){
                System.out.println("EMPTY WHAT DO YOU EXPECT?");
                return;
            }
            for(int i=front%5 ; i<=rear%5 ; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        q.show();
        q.deQueue();
        q.enQueue(10);
        q.show();
        
        // q.hello();
        
        // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);

        // // tree.preorder(nodes);

        // Inorder(root);
        // System.out.println();
    }
}
