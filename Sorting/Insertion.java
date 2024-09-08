package Sorting;

public class Insertion {

    static void insertSort(int arr[]){
        int n = arr.length ; 
        for(int i= 0 ;i<n ; i++){
            int j = i ; 
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j] ; 
                arr[j] = arr[j-1] ; 
                arr[j-1] = temp  ; 
                j-- ; 
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1}  ; 
        insertSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
