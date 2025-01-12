package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {
    public static class  Edge {
        
        int src ; 
        int dest ; 
        int wieght ; 
       
        Edge(int sr, int des,int wt){
            src = sr ;
            dest =des ; 
           wieght =wt;
        }}
        static class Pair implements Comparable<Pair>{
            int v ; 
            int cost ; 
            Pair(int v,int cc){
               this.v= v ; 
                this.cost=cc ; 
            }
            @Override
            public int compareTo(Pair p2){
                return this.cost - p2.cost ;
            }
        }
        static void prims(ArrayList<Edge> graph[])
        {
            boolean vis [] = new boolean[graph.length] ; 
            PriorityQueue <Pair> pq = new PriorityQueue<>() ;
            pq.add(new Pair(0, 0)) ; 
            int finalCost= 0 ; 

            while (!pq.isEmpty()) {
                Pair curr = pq.remove() ; 
                if(!vis[curr.v] ){
                    vis[curr.v]= true ;
                    finalCost += curr.cost ; 
                    for(int i=0  ;i <graph[curr.v].size() ; i++){
                        Edge e = graph[curr.v].get(i) ;
                       pq.add(new Pair(e.dest, e.wieght)) ;
                }
            }
        } 
            System.out.println(finalCost);
        }

     

        static void creategraph(ArrayList<Edge> graph[]){
            for(int i=0 ; i<graph.length ; i++){
                graph[i] = new ArrayList<>() ;
            }

            graph[0].add(new Edge(0,1,10)) ;
            graph[0].add(new Edge(0,2,15)) ; 
            graph[0].add(new Edge(0,3,30)) ; 

            graph[1].add(new Edge(1,0,10)) ;
            graph[1].add(new Edge(1,3,40) ) ; 
            graph[2].add(new Edge(2,0,15)) ;
            graph[2].add(new Edge(2,3,50)) ; 
            graph[3].add(new Edge(3,1,40)) ;
            graph[3].add(new Edge(3,2,50)) ; 
        }

        public static void main(String[] args) {
            ArrayList<Edge> graph[] = new ArrayList[4] ; 

            creategraph(graph);
            String s = "GG" ; 
        
            prims(graph);
        }
}
