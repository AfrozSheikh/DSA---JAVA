package Sorting;
 // non zero elemnts ki relative ordering chnage nahi hona and move all 0's array ke end me
public class q1 {

    public static void soln(int arr[]){
        int n = arr.length ; 
        for(int i =0 ;  i<n-1 ; i++){
            boolean flag = false;
            for(int j =0 ; j<n-i-1 ; j++){
                if(arr[j]==0&&arr[j+1]!=0){
                    int temp= arr[j] ; 
                    arr[j]=arr[j+1] ; 
                    arr[j+1] =temp ; 
                } 
            }}
        }
    
    public static void main(String[] args) {
        int arr [] = { 5,0,4,0,1} ; 
        soln(arr);
        for (int i : arr) {
            System.out.println(i);
        } 
   
    }

}
