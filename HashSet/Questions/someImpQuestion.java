import java.util.*;

// Q1)Given an array of numbers find the majority element(s) with more than n/3 freq 
/*Steps :
 * 1)Create Hashmap
 * 2)Fnd freq of all num and store in map
 */
public class someImpQuestion{
    
    
    
    
    
    public static void main(String[] args) {




        /*BY ARRAY GONNA COMMMENT */
        // //By doing it with java the timeComplexity is O(n^2) --> hashMap converts to O(n) (Average case) worst of the worst is when nodes at each bucket (array index) has N nodes (i.e all linked list of maps) are at one index due to wired hashode
        // int timeComplexity=0;
        // //first solving majority element code with ested loops
        // int num[] = {1,3,2,5,1,3,1,5,1};
        // int n = num.length;
        // // timeComplexity++;
        // int c[] = new int[num.length];
        // // timeComplexity++;
        // int i,j;
        // for(i=0; i<num.length;i++)
        //     for(j=0;j<num.length;j++)
        //         if(j==num[i])
        //             c[j]++;

        // for(int k=0;k<num.length;k++){
        //     if(c[k] > n/3){
        //         System.out.println(k + " with a frequency of " + c[k]);
        //     }
        // }

    }
}