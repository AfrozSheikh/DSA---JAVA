package PriorityQueue;

import java.util.PriorityQueue;

public class KthLargest { 
    // O()
    public static void main(String[] args) {
       
       int nums[] ={3,7,2,9,5} ; 
       int k= 2 ; 
       PriorityQueue<Integer> p = new PriorityQueue<>() ; 
       for(int i = 0 ; i< nums.length ; i++){
        if(p.size()==k){
            // agaar top chhota tha , remove top add element
            if(p.peek()< nums[i]){
                p.poll() ; 
                p.add(nums[i]) ; 
              
            }  continue; 
        }
        p.add(nums[i] ) ; 
       }
System.out.println(p.peek());
    }
}
