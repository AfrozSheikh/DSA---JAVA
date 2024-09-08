package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelecton {
    public static void main(String[] args) {
        int start [] ={ 1,3,0,5,8,5} ;
        int end[]= { 2,4,6,7,9,9} ;
        int activty [][] = new int[start.length][3] ;
        for(int i = 0 ; i< start.length ; i++){
            activty[i][0]= i ; 
            activty[i][1]=start[i]  ;
            activty[i][2] = end[i] ;  
        }

        Arrays.sort(activty,Comparator.comparingDouble(o->o[2]));

        int maxAct = 0 ; 
        ArrayList<Integer> ans  = new ArrayList<>() ;
        maxAct =1 ;
        ans.add(activty[0][0]) ;
        int lastend =activty[0][2] ; 
        for(int i =1 ; i<end.length; i++){
            if(activty[i][1]>=lastend){
                maxAct++ ;
                ans.add(activty[i][0]) ;
                lastend = activty[i][2] ; 
            }
        }
        System.out.println(ans);
    }
}
