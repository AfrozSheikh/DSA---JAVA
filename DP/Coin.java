package DP;

public class Coin {

    static int coinchange(int n , int a []){
        if(n==0 ) return 0 ; 
        int ans = Integer.MAX_VALUE ;
        for ( int i =0 ; i<a.length ; i++){
            if(n-a[i] >=0 ){
                int subAns = coinchange(n-a[i] , a);
                if(subAns != Integer.MAX_VALUE  && subAns+1 < ans){
                    ans = subAns+1 ;
            }

        }
    }        return ans ; 

    }

    public static void main(String[] args) {
        int a  [] = {1,7,5} ; 
        System.out.println(coinchange(18,a));
    }
}
