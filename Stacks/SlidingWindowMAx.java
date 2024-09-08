public class SlidingWindowMAx {
    
   // Brute  Force Approach 

    static int[] window (int arr[],int k ){
        int n = arr.length  ; 
        int ans [] = new int[n-k+1] ; 
        int z = 0 ; 

        for(int i = 0 ; i<arr.length-k+1 ; i++)
        {
            int max = Integer.MIN_VALUE ; 
            for(int j = i  ; j<i+k ; j++){
                max = Math.max(max, arr[j]) ;
            }
            ans[z++] = max ; 

        }
        return ans ; 
    }
    public static void main(String[] args) {
        
       
        int arr[]= {1,3,-1,-3,5,3,6,7} ;
        int brr[]  = window(arr, 3);
        for(int i = 0 ; i<brr.length; i++)
        System.out.print(brr[i] +" ");

    }
}
