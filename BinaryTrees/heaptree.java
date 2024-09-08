
package BinaryTrees ;

import java.util.ArrayList;
import java.util.List;

public class heaptree {

   static  void swap(List<Integer> heap , int l,int r)
    {
        int temp = heap.get(l) ;
        heap.set(l,heap.get(r) ) ;heap.set(r, temp);
    }
  static   void push_up_inMinHeap(List<Integer> heap, int i){
        int parent_idx = (i-1)/2 ;
        if(i==0|| heap.get(parent_idx)< heap.get(i)) return ;
        //swap 
        swap(heap,i,parent_idx) ;
        push_up_inMinHeap(heap, parent_idx);
    }

 static   void insert_in_minHeap(List<Integer> heap, int element){
        heap.add(element) ;
        int idx = heap.size()-1; 
        push_up_inMinHeap(heap,idx); 
        
    }


    // insert in max heaphesap 

    static void push_up_inMaxHeap(List<Integer> heap, int i){
        int parent_idx = (i-1)/2 ;
        if(i==0|| heap.get(parent_idx)> heap.get(i)) return ;
        //swap 
        swap(heap,i,parent_idx) ;
        push_up_inMaxHeap(heap, parent_idx);
    }
    static   void insert_in_maxHeap(List<Integer> heap, int element){
        heap.add(element) ;
        int idx = heap.size()-1; 
        push_up_inMaxHeap(heap,idx); 
        
    }

    // deletion in min heap 
    static void push_down_in_Minheap(List<Integer> heap,int idx)

    {        int n = heap.size() -1 ;
        if(idx==n) return ; 

        
        int left= (2*idx) +1  ; 
        int right = (2*idx) + 2 ;  
        int smallest= idx ; 
        if(left<=n && heap.get(left) < heap.get(smallest)) smallest =left ; 
        if(right <=n && heap.get(right) < heap.get(smallest)) smallest = right ; 
       if(smallest ==idx) return  ;
       swap(heap,idx, smallest);
       push_down_in_Minheap(heap, smallest);
    }

    static void delete_in_MinHeap(List<Integer> heap){
        swap(heap, 0, heap.size()-1);
        heap.remove(heap.size()-1)   ;
        push_down_in_Minheap(heap,0) ; 
    }

    // deletion in max heap 
    static void push_down_in_Maxheap(List<Integer> heap,int idx)

    {        int n = heap.size() -1 ;
        if(idx==n) return ; 

        
        int left= (2*idx) +1  ; 
        int right = (2*idx) + 2 ;  
        int biggest= idx ; 
        if(left<=n && heap.get(left) > heap.get(biggest)) biggest =left ; 
        if(right <=n && heap.get(right) > heap.get(biggest)) biggest = right ; 
       if(biggest ==idx) return  ;
       swap(heap,idx, biggest);
       push_down_in_Maxheap(heap, biggest);
    }

    static void delete_in_MaxHeap(List<Integer> heap){
        swap(heap, 0, heap.size()-1);
        heap.remove(heap.size()-1)   ;
        push_down_in_Maxheap(heap,0) ; 
    }

 public static void main(String[] args) {
     List <Integer> heap = new ArrayList<>() ;
     heap.add(5);
     heap.add(20); 
     heap.add(10); 

     heap.add(40);
     heap.add(50);
  
     heap.add(30);
     heap.add(60);
     
     
     System.out.println(heap);
    delete_in_MinHeap(heap);
   System.out.println(heap);
 }
}
