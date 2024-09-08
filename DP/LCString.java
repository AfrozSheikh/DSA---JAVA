package DP;

public class LCString {
    static int findLCString(String s , String d ){
        int n = s.length() ; 
        int m = d.length()  ; 
        int dp[][] = new int[n+1][m+1] ; 
        int ans = 0 ; 
        for(int i=1 ; i<n+1 ; i++){
            for(int j =1 ; j<m+1 ; j++){
                if(s.charAt(i-1) ==d.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1 ; 
                    ans = Math.max(ans,dp[i] [j]) ;
                }
                else{
                    dp[i][j] = 0 ; 
                }
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        System.out.println(findLCString("abcd", "abcd"));
    }
}