import java.io.*;
// import java.lang.reflect.Array;
import java.util.*;
import java.util.HashSet;

/*time complexity : O(n)*/
// E.g,
/*arr[] = {0, -1, 2, -3, 1} 
sum = -2 
Now start traversing: 
Step 1: For ‘0’ there is no valid number ‘-2’ so store ‘0’ in hash_map. 
Step 2: For ‘-1’ there is no valid number ‘-1’ so store ‘-1’ in hash_map. 
Step 3: For ‘2’ there is no valid number ‘-4’ so store ‘2’ in hash_map. 
Step 4: For ‘-3’ there is no valid number ‘1’ so store ‘-3’ in hash_map. 
Step 5: For ‘1’ there is a valid number ‘-3’ so answer is 1, -3  */

class Hashing_TwoSum {

    public static void checkPairs(int A[],  int size, int sum){
        // Hashset<Integer> set = new HashSet<Integer>(); s should've been capital
        HashSet<Integer> set = new HashSet<Integer>(); 
        for(int i=0; i<size; i++){
            int temp = sum - A[i]; 
            /*Basically temp is the value i want to search in hashser
            if it exists then well and good else i keep temp in it so that the 
            number who requires temp gets it and condition true */ 
            if(set.contains(temp)){
                System.out.println("Pair exists");
                return;
            }
            set.add(A[i]);
        }
        System.out.println("Pair doesn't exist");
    }

    public static void main(String args[]){
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 16;
        int size = A.length;
        Arrays.sort(A);

        checkPairs(A, size, sum);
    }  
}