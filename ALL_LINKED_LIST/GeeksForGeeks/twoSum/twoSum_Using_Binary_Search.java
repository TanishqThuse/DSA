import java.util.*;

//twoSum pair check using binary search
/*Time complexity : O(N logN) */

class twoSum_Using_Binary_Search {

    public static boolean BinarySearch(int A[], int start, int end, int search_key){
        
        /*On a size note I am passing 'A' as  a sorted array so no need to sort it again 
        * Since I have passed it from checkPair method instead of main*/
        while(start<=end){
            int mid = (start+end)/2;
            if(A[mid]==search_key){
                return true;
            }
            else if(A[mid]<search_key){
                start=mid+1; //it's mid +1 kyuki i have alreadt checked for mid in the if() statement
            }
            else {
                end=mid-1;
            }
        }
        return false;
    }

    public static boolean checkPairExists(int A[], int size, int sum){
        Arrays.sort(A);
        
        for(int i=0; i<size; i++){
            int search_key = sum-A[i];

            if(BinarySearch(A, i+1, size-1, search_key)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int A[] = { 1, 4, 45, 6, 10, -8 };
        int n = A.length;
        int sum = 16;
        
        if(checkPairExists(A, n, sum)){
            System.out.println("Pair exists");
        }
        else{
            System.out.println("Pair doesn't exist");
        }
    }    
}
