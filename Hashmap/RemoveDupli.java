package Hashmap;

import java.util.HashMap;

public class RemoveDupli {
    public static void main(String[] args) {
        
        int arr [] = { 1,2,3,2 } ; 
        HashMap<Integer,Integer> map = new HashMap<>() ; 
    
        for( int i = 0 ; i< arr.length ; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1 ) ; 
            }
            else{
                int val = map.get(arr[i] ) ; 
                map.put(arr[i], val+1) ; 
            }
    
            
    }
    for(int i  : map.keySet()){
        System.out.println(i);
    }
}}
