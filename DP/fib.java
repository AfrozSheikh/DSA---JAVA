package DP;

import java.util.Arrays;

public class fib {
    public static int fibDp(int  n , int arr[] ){
        if(n==0 || n==1 ){
            arr[n] = n;
            return n ; 
        }
        if(arr[n]!=-1) return arr[n] ;  
        arr[n] =  fibDp(n-1, arr)+fibDp(n-2, arr);
        return arr[n] ; 

    }

    public static void main(String[] args) {
        int arr [ ] = new int [7] ; 
        Arrays.fill(arr,-1);
        // System.out.println(fibDp(6, arr));
        arr[0] =  0  ;
        arr[1] =  1  ;
        for( int i = 2 ; i<= 6 ; i++ ){
            arr[i] = arr[i-2]+arr[i-1] ; 
    }
    for( int i : arr){
        System.out.println(i);
    }
}
}
