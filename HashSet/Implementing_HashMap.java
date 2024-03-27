
//here we are finally wiriting the internal code for haskMap like stack, linkedlist 
//for interviews imp
//the first way is by creating an array of linkedList

import java.security.Key;
import java.util.ArrayList;
import java.util.LinkedList;

import org.w3c.dom.Node;


/*The methods used and defined in this code are : 
 * 1)Class HashMap which is a user defined class
 *      ->The class Hashmap also contains a public Node which has a default parameterized construtor as well
 * 2)Then we define some variables like n -> which is the number of values which are stored in the LinkedList
 *      The second varibale which we define is the -> N which is like the the total elemts of array size
 * 
 * 3)After that we have a public HashMap which is thwhere the confusion started , looks like we took the implementation of the above class and created this public HashMap
 * 
 * -> Anyways this is where we first define the bucket list
 * we also circlate a for loop in which we create empty linkedLists
 * 
 * 4)We have a method called HashFucntion which calls HashCode() method which sets a unqie hashCode for each bucketlist value
 * 5)We also create a linked list lode in the seachInLL method which traverses on the linkedList in the bucket list's each elemtnt of the array
 * 6)We have a method called put, 
 * the pust method searches for the value in the linkedlist and finds it then the data is assigted to it
 * 
*/
public class Implementing_HashMap {

    static class HashMap<K,V>{
        K keys;
        V values;

        public Node(K keys, V values) {
            this.keys = keys;
            this.values = values;
        }
    }

    private int n; //n --> is for number of values linkedlist nodes
    private int N; //this is my total numbers of buckets , it is basically the size of array
    private LinkageList<Node> bucketsOrSimplyApnaArrayOfLinkedLists[]; //N = buckets.length\

    @SuppressWarnings("unchecked")
    public Implementing_HashMap(){
        this.N = 4;
        this.bucketsOrSimplyApnaArrayOfLinkedLists = new LinkedList[4]; //creating an array of LinkedLists

        //now i will create that many linkedlists
        for(int i=0; i<4 ; i++){
            //creating a node for each bucker which points to null
            this.bucketsOrSimplyApnaArrayOfLinkedLists[i] = new LinkedList<>();
        }
    }

    private int hashFunction(K keys){
        //to encrupt the bucketIndex for a value to be specified to a value
        int bucketIndex = keys.hashCode();
        // hashCode() fucntion returns value between -231000 and +23100 something 
        //also the values is between 0 to N-1
        // so, the important thing to do is:
        return Math.abs(bucketIndex) % N;  //%N since to make value in between 0 to N-1
    }

    //ye code thoda practise karna padega
    private int searchInLinkedList(K keys, int bucketIndex) {
        LinkedList<Node> ll = bucketsOrSimplyApnaArrayOfLinkedLists[bucketIndex];
        
        for(int i=0; i<ll.size(); i++) {
            if(ll.get(i).keys == keys) {
                return i; //where i is our dataIndex;
            }
        }
    }

    public void put(K keys, V values){
        // hashFunction(keys); //a function that converts each keys(like India ) to a hashCode()
        int bucketIndex = hashFunction(keys);
        int dataIndex = searchInLinkedList(keys, bucketIndex); //this will return a data index
        //dataIndex LinkedList ke andar mera index batata he
        //data index is by default -1?

        if(dataIndex == -1) { //key doesn't exit
            bucketsOrSimplyApnaArrayOfLinkedLists[i].add(new Node(keys, values)) ;
        }
        else{ //keys exists
            Node data = bucketsOrSimplyApnaArrayOfLinkedLists[bucketIndex].get[dataIndex];
            //here buckets referes to the array and the value at get dataIdex is basically the final final linked lists' value present int the bucket list
            data.value = values;
        }

        double lambdaARatioToMaintainSize = (double)n/N;
        
        if(lambdaARatioToMaintainSize > 2.0) {
            //rehashing
            reHash(bucketsOrSimplyApnaArrayOfLinkedLists);
        }
    }

    private void reHash() {
        LinkageList<Node> oldBucket[] = bucketsOrSimplyApnaArrayOfLinkedLists;
        bucketsOrSimplyApnaArrayOfLinkedLists = new LinkedList[N*2];

        for(int i=0; i<oldBucket.length;i++) {
            LinkedList<Node> ll = oldBucket[i];
            for(int j=0; j<ll.size(); j++){
                Node node = ll.get(j);
                put((node.keys), node.values);
            }
        }
        
    }

    public V get(K keys) {
        int bucketIndex = hashFunction(keys);
        int dataIndex = searchInLinkedList(keys, bucketIndex); //this will return a data index
        //dataIndex LinkedList ke andar mera index batata he
        //data index is by default -1?

        if(dataIndex == -1) { //key doesn't exit
            // old code for put ->bucketsOrSimplyApnaArrayOfLinkedLists[i].add(new Node(keys, values)) ;
            return false;
        }
        else{ //keys exists --> for this condition
            // Node data = bucketsOrSimplyApnaArrayOfLinkedLists[bucketIndex].get[dataIndex];
            Node node = bucketsOrSimplyApnaArrayOfLinkedLists[bucketIndex].get(dataIndex);
            //here buckets referes to the array and the value at get dataIdex is basically the final final linked lists' value present int the bucket list
            return node.value;
            //in the above case we are using the .remove() function
        }
    }

    public ArrayList<K> keySet() {
        //declaring a new keys arraylist
        ArrayList<K> keys = new ArrayList<>();

        for(int i=0; i<bucketsOrSimplyApnaArrayOfLinkedLists.length;i++){
            LinkedList<Node> ll = bucketsOrSimplyApnaArrayOfLinkedLists[i];
            for(int j=0; j<ll.size();j++){
                //i didn't quite understand this logic
                Node node = ll.get(j);
                keys.add(node.key);
            }
        }
        return keys;
    }

    public boolean isEmpty() {
        return n==0; //n--> nodes, check is nodes are zero
    }

    public boolean containsKey(K Keys) {

        int bucketIndex = hashFunction(keys);
        int dataIndex = searchInLinkedList(keys, bucketIndex);
    
        if(dataIndex == -1) { //key doesn't exist
            return false;
        }
        else { //key exist
            return true;
        }
    }

    public V remove() {
        //Case 1 : if key exists and return it's value
        //Case 2 : doesn't exit then retun nll value

        //We follow the same procedure for searching the linkedlist , 
        //i.e search it using search and then change

        int bucketIndex = hashFunction(keys);
        int dataIndex = searchInLinkedList(keys, bucketIndex);

        if(dataIndex == -1){ //keys not found
            return null;
        }
        else{ //keys found
            Node newNode = bucketsOrSimplyApnaArrayOfLinkedLists[bucketIndex].remove(dataIndex);
            n--;
            return node.value;
            // newNode = ll.remo
            // if(bucketsOrSimplyApnaArrayOfLinkedLists[bucketIndex].get(dataIndex++) != null ){
                
            // }
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String, Integers> map = new HashMap<>();
        map.put("India",190);
        map.put("China",200);
        map.put("US",50);

        //Let's check if i can get a keySet
        ArrayList<String> key = map.keySet();

        //Now we will use this
        while(!map.isEmpty()){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
       
    }
}