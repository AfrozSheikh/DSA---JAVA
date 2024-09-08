package Sorting;

public class Bubble {

    static void swap(int arr[] , int a ,int b){
        int temp =arr[a] ; 
        arr[a] =arr[b] ; 
        arr[b] = temp ; 

    }

    static void Bsort(int arr[]){
        for(int i= 0 ; i<arr.length-1 ;i++){
            for(int j=0 ; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1) ; 
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2 ,1};Bsort(arr);
        for (int i : arr) { 
            System.out.println(i); 
        }

    }
}
