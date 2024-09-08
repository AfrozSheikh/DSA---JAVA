package Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class isomorphic {

    static boolean isIsomorphic(String s , String t){
        HashMap<Character,Character> m =new HashMap<>() ; 
        for(int i = 0 ;i<s.length() ; i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
          if(m.containsKey(sc)){
            if(m.get(sc)!= tc) return false ; 
           }
           else if(m.containsValue(tc)){
            return false ; 
           }
           else{
            m.put(sc, tc) ; 
           }
        }
        return true  ; 
    }
    
    public static void main(String[] args) {
        System.out.println(isIsomorphic("alo" ,"xxy"));
        HashSet <Integer> s  = new HashSet<>() ; 
        
    }
}
