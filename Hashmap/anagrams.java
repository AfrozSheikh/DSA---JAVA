package Hashmap;

import java.util.HashMap;

public class anagrams {
    static void angram (String s , String t){
        // if(s.length() != t.length()) return false ;  
      
        HashMap<Character,Integer>  h = new HashMap<>() ; 
        HashMap<Character,Integer>  k = new HashMap<>() ; 
      for(int i =0 ; i<s.length() ; i++){
        if(!h.containsKey(s.charAt(i))){
            h.put(s.charAt(i), 1) ; 
        }
        else{
            h.put(s.charAt(i), h.get(s.charAt(i))+1) ; 
        }
      }
      for(int i =0 ; i<t.length() ; i++){
        if(!k.containsKey(t.charAt(i))){
            k.put(t.charAt(i), 1) ; 
        }
        else{
            k.put(t.charAt(i), k.get(t.charAt(i))+1) ; 
        }
      }
      System.out.println(h);System.out.println(k);
     
      System.out.println(h.equals(k));
    }
    public static void main(String[] args) {
        // System.out.println(angram("abc", "cba"));
        angram("cccabc", "bacccc");
    }
}
