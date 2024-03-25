import java.util.*;
// import java.String.lang;
class Basic
{
    static void print_List(ArrayList<Integer> to_be_printed)
    {
        for(int i=0 ; i<to_be_printed.size() ; i++)
        {
            System.out.println(to_be_printed.get(i));
        }
    }

    public static void main(String[] Args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        //adding elemts
        list.add(1);
        list.add(48);
        list.add(3);
        list.add(4);
        
        // //before adding
        // System.out.println("Before adding");
        // System.out.println(list);

        // //to get elements
        // print_List(list);

        // System.out.println("After adding");
        // list.add(4,100);
        // System.out.println(list);
        // print_List(list);

        // for(int i : list.size())
        // {
        //     System.out.println(list.get(i));
        // }


        //before sorting
        System.out.println("Before adding");
        System.out.println(list);

        System.out.println("After sorting");
        Collections.sort(list);
        System.out.println(list);
        
    }
}