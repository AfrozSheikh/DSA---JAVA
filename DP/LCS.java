package DP;

public class LCS {

    static int findLCS(String s , String d , int n , int m ,int dp[][]){
        if(n==0 || m==0) return 0 ; 
        if(dp[n][m]!=-1)return dp[n][m] ; 
        if(s.charAt(n-1)== d.charAt(m-1)){
            return dp[n][m] =findLCS(s, d, n-1, m-1, dp)+1;

        }
        else{
            int ans1 = findLCS(s, d, n-1, m, dp) ;
            int ans2 = findLCS(s, d, n, m-1, dp) ; 
            return dp[n][m] = Math.max(ans1, ans2) ; 
        }

    }
    public static void main(String[] args) {
        String s = "age" ; 
        String d = "abedg" ; 
        int n = s.length() ;
         int m = d.length() ; 
         int dp[][] = new int[n+1][m+1] ; 
         for(int i=0 ; i<n+1 ; i++){
            for(int j =0 ; j<m+1 ; j++){
                dp[i][j] = -1 ; 
            }
         }
         System.out.println(findLCS(s, d, n, m, dp));

    }
}
