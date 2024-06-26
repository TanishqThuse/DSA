// #Two sum
//All I know is I have to use two pointers
//Approach 1 - Check if there exists two elements in an array such that their sum is equal to given k
//O(n^2) time complexity since we are using nested loops
import java.util.*;

class Nestes_Loops_App_twoSum{

    public static boolean checkPairExists(int A[], int n, int sum){
        for(int i=0; i<n ; i++){
            for(int j=i+1; j<n; j++){
                if(A[i] + A[j] == sum){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String args[]){
        // public boolean checkPairExists(int A[], int n, int sum);
        int A[] = {1, 4, 45, 6, 10, -8};
        int n = A.length;
        int sum = 16;

        if(checkPairExists(A, n , sum)){
            System.out.println("Pair exists");
        }
        else{
            System.out.println("Pair does not exist");
        }   
    }
}