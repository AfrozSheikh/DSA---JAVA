package DP;

import java.util.Arrays;

public class CatalansNumber {

    public static int catalan(int n , int dp[]){
        if(n==0 || n==1){
            return 1 ; 
        }
        if(dp[n]!=-1) return dp[n] ; 
        int ans =0 ; 
        for(int i = 0 ;i<n ; i++){
            ans+= catalan(i, dp) * catalan(n-i-1, dp) ; 

        }
        return dp[n] = ans ; 

    }
    public static void main(String[] args) {
        int m =5  ;
        int dp [] = new int[m+1] ; 
        Arrays.fill(dp, -1);
        System.out.println(catalan(m,dp));
    }
}
