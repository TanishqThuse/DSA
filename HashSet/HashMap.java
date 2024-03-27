
//Stores value and key , use the conceot of mapping
//The key is always unique
/*
 * 1) key-> value
 * 2)Real life example is student(value) roll no. (key)
 * fuel(key) and price(value)
 *  same 
 */

import java.util.*;
// import java.util.HashMap;
/**
 * InnerHashMap
 */
public interface InnerHashMap {

    
} public class HashMap {

    public static void main(String[] args) {
    //country(key) , population(value)
    
    //idk man why on earth i get error below
    HashMap<String, Integer> map = new HashMap();

    //Insertion -> map.put(), fucntion
    map.put("India",120); 
    map.put("China",130);

    System.out.println(map);

    //search
    if(map.contains("India")){
        System.out.println("Present");
    }

    map.get("China"); //--> gives value for key CHina

    //Iteration in HashMap

    // for(int i=0;i<n;i++){
    //     use iterator instead!!
    // }

    //enhanced for loop
    // for(int val : arr){
    //     //much better syntax for 'for' loop 
    // }

    int a[] = {1,2,3,4,5};
    for(int val: a){
        // System.out.println(a[val]);
        System.out.println(val);
        //direactly value
    }

    //Map entry

    //idk man why are there so many fucking errors here
    Map.Entry<K,V> e : Map.Entry<K,V>;

    for(map.Entry<String, Intege> e : map.entrySet();){
        System.out.println(e.getKey()); //prints key
        System.out.println(e.getValue()); //prints value
    }

    //ex : e={"India",120}
    // if : i do e.getKey() --> returns "India"
    // if i do e.getValue() --> retunrs 20


    }
}