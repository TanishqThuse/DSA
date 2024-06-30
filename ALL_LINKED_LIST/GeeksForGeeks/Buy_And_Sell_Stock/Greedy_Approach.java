/*In order to maximize the profit, we have to minimize the cost price and maximize the selling price. So at every step, we will keep track of the minimum buy price of stock encountered so far. If the current price of stock is lower than the previous buy price, then we will update the buy price, else if the current price of stock is greater than the previous buy price then we can sell at this price to get some profit. After iterating over the entire array, return the maximum profit. */

/*Time Complexity: O(N). Where N is the size of prices array. 
Auxiliary Space: O(1) */

import java.util.*;
import java.io.*;

public class Greedy_Approach {

    public static int Max_Profit(int prices[], int size){
        // int prices[] = { 7, 1, 5, 6, 4 };
        int max_profit = 0;
        int buy = prices[0];

        for(int i=1; i<size; i++){
            // if(prices[i] > buy){
            //     max_profit = prices[i] - buy;
            // }
            // else if(prices[i] < buy){
            //     buy = prices[i];
            // }
            if(buy > prices[i]){
                buy = prices[i];
            }
            else if(prices[i] - buy > max_profit){
                max_profit = prices[i] - buy;
            }
        }
        return max_profit;
    }

    public static void main(String args[]){
        int prices[] = { 7, 1, 5, 6, 4 };
        int size = prices.length;
        int profit = Max_Profit(prices, size);
        System.out.println(profit);
    }
}
