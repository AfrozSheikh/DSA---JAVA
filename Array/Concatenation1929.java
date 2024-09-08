package Array;

public class Concatenation1929 {
    

    //  static int []  cat(int nums[]){
    //     int ans [] = new int[nums.length*2] ;
    //     int j = 0 ; 
    //     for(int i = 0 ; i<=nums.length ; i++){
    //       if(j==3){
    //         j=0 ; 
    //         for(int k = i ; k<ans.length; k++){
    //                 ans[k] = nums[j] ; 
    //                 j++;
    //         }
    //         return ans ;

           
    //       }
    //         ans[i] = nums[j] ; 
    //         j++;
    //     }
    //     return ans ; 


    // }
   
   static int [] cat(int nums[]) {
    int n = nums.length * 2 ; 
    int ans [] = new int[n] ; 
    n=n/2 ; 
    for(int i = 0 ; i<nums.length; i++){
            ans[i] = nums[i] ;
           
            ans[n++] = nums[i] ; 
    }
    return ans ; 
   }
    public static void main(String[] args) {
        int arr[] = {1,2,1} ;
        
        int all[] = cat(arr);
        for(int i =0 ; i<all.length ; i++){
            System.out.print(all[i]+" ");
        }
       
    }
}
