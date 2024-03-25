import java.util.*;

public class run{
    
    public static class Queue{
        int arr[] = new int[5];
        int front, rear;

        public boolean isEmpty(){
            return front==rear;
        }

        public void enQueue(int data){
            //int index=0;
            if(isEmpty()){
                //System.out.println("Empty list");
                arr[front%5] = data;
                rear++;
                return ;
            }
            arr[rear%5] = data;
            rear++;
        }

        public int deQueue(){
            if(isEmpty()){
                System.out.println("Empty list");
                return 0;
            }
            int top = arr[front%5];
            front++;
            rear++;
            return top;
        }

        public void peek(){
            System.out.println(arr[front%5]);
        }

        public void show(){
            for(int i=front%5; i<=rear%5; i++){
                System.out.println(arr[i]);
            }
        }

    }

    public class Tree{

        

    }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(6);       
        q.enQueue(7);
        q.enQueue(8);
        q.enQueue(9);

        q.show();

        System.out.println("Actual test dequing");
        q.deQueue();
        q.deQueue();

        q.show();

    //     q.enQueue(69);
    //     q.enQueue(70);
    }
}