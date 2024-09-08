
package DP ; 


// 0-1 knapsack


public class Knapsack0 {
 
    /// Recusrion - Brute force  
    // T.C.= O(2^n)
    static int knapsack(int[] val , int wt[] , int bag,int n ){
        if(bag==0 || n==0) return 0 ; 
        if(wt[n-1]<=bag){
            // if valid
            //then include
          int ans1= val[n-1] +  knapsack(val, wt, bag-wt[n-1], n-1) ;
          //exclude
            int ans2 = knapsack(val, wt, bag, n-1) ;
            return Math.max(ans1, ans2);
        }
        else{
            // not valid 
            return knapsack(val, wt, bag, n-1) ;
        }
    }

    /// Using DP - memoiozaation  O(N*bagWeight)
    static int knapsack2(int[] val , int wt[] , int bag,int n ,int dp[][]){
        if(bag==0 || n==0) return 0 ; 
        if(dp[n][bag]!=-1){
            return dp[n][bag] ; 
        }
        if(wt[n-1]<=bag){
            // if valid
            //then include
          int ans1= val[n-1] +  knapsack2(val, wt, bag-wt[n-1], n-1,dp) ;
          //exclude
            int ans2 = knapsack2(val, wt, bag, n-1,dp) ;
            dp[n][bag] =  Math.max(ans1, ans2);
            return   dp[n][bag] ; 
        }
        else{
            // not valid 
            dp[n][bag] =  knapsack2(val, wt, bag, n-1,dp) ;
            return   dp[n][bag] ; 
        }
    }
    public static void main(String arhs[]){
        int val [] = { 15,14,10,45,30} ; 
        int wt[]= {2,5,1,3,4} ; 
        int bag = 7  ;
        int dp [][]= new int[val.length+1][bag+1 ] ; 
        for(int i =0 ; i<dp.length ;i++ ){
            for(int j = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1; 
            }
        }
        System.out.println(knapsack2(val, wt, bag, val.length,dp));
    }
}
