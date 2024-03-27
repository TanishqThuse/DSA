/* Inserting, searching, removing needs constant time in hashset
    This maked hashset a very efficient data structure
    O(1), O(1), O(1)

    In Array :
    Inserting-> O(1)
    Searching : O(n)
    Removing : O(n)

    In sorted array: 
    Inserting : O(n)
    Searching : O(log n)
    Remove : O(n)

    In BST : 
    Add -> O(height)
    Search : O(height) or O(logn )-> exceptionnal
    Remove : O(height)
 */

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args){
        //Creating :
        HashSet<Integer> set = new HashSet<>();
        //same syntax like genetics and collection framework

        //Insertion : 
        set.add(1);

        //Search :
        set.contains(1);

        //Delete
        set.Delete(1);

        set.size();

        //All elemen6ts of set : 
        System.out.println(set);

        //Iterator
        // for(int i=0; i<n ; i++) {
        //     //Not possible
        // }

        Iterarot it = set.iterator();
        //hasNext ? 
        it.next();
        //it changes to the one it is iterating to's

        it.hasNext(); //--> boolean --> the condition which helps in stop loog

        Iterator it2 = set.iterator();
        while(it2.hasNext()){
            System.out.println(it.next());
        }
    }
}
