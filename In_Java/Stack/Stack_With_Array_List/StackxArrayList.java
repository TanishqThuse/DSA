import java.util.*;

class StackxArrayList
{
    static class Stack 
    {
        static ArrayList<Integer> list = new ArrayList<>();
    //  int list = new int();
    //  
        public boolean isEmpty()
        {
            return list.size() == 0;
        }

        public void push(int data)
        {
            list.add(data);
        }

        //pop always removes the top element
        public int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            //to get the last element of the list --> Which is the 'top' value and nOT LAST
            int top = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return top;
        }

        //this will show topmost of stack
        public static int peek()
        {
            int top = list.get(list.size() - 1);
            return top; 
        }

    }   
       public static void main(String[] args)
        {
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);

            while(!s.isEmpty())
            {
                System.out.println(s.pop());

                // //or
                // System.out.println(s.peek());
                // s.pop();
            }
        }
}




























// list.size() == 0 --> The arraylist is empty