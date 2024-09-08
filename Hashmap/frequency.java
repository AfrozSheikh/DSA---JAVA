package Hashmap;

import java.util.HashMap;

public class frequency {
    public static void main(String[] args) {
        
        int arr[]= {1,2,3,1,3,4,4,4,3,5,3,4,4,4} ; 
        HashMap<Integer,Integer> m = new HashMap<>() ; 
       for(int i =0 ; i< arr.length; i++){
        if(!m.containsKey(arr[i])) m.put(arr[i], 1);
      else  m.put(arr[i], m.get(arr[i])+1) ; 
       }
      
       System.out.println(m);
        int value =0 ; int anskey =-1; 
       for(int key : m.keySet()){
       int val = m.get(key) ; 
       if(val> value){
        value = m.get(key) ; 
        anskey = key ; 
       }
       }

        System.out.println(anskey);
    }
}
