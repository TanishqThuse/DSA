import java.util.*;
//Approach-2 Using Two Pointers

/*increment ‘l’ when the sum of the pair is less than the required sum and decrement ‘r’ when the sum of the pair is more than the required sum. If the sum is equal to the required sum, we have found the pair.*/

//Time Complexity: O(n)
/*Even though this algo counts only one pair but can be extended for multiple pairs */

class twoPointers_2Sum{

    public static boolean checkSum(int A[], int n, int sum){
        int start = 0;
        int end = n-1; // &A[n-1]
        
        
        while(start<end){
            if(A[start] + A[end] == sum){
                return true;
            }
            else if(A[start] + A[end] < sum){
                start++;
            }
            else{
                end--;
            }
            System.out.println(start + " ,"+end);
        }

        return false;
    }

    public static void main(String args[]){

        int A[] = {1, 4, 45, 6, 10, -8};
        int n = A.length;
        int sum = 16;
        Arrays.sort(A); //Since we need a sorted array to use two pointer approach
        System.out.println("Sorted array : ");
        for(int i=0; i<n ; i++)
            System.out.print(A[i]+" ");
        if(checkSum(A, n , sum)){
            System.out.println("Pair exists");
        }
        else{
            System.out.println("Pair does not exist");
        }
    }
}