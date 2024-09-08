
package Graphs ;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {
    public static class  Edge {
        
        int src ; 
        int dest ; 
        int wt ; 
       
        Edge(int sr, int des,int w){
            src = sr ;
            dest =des ; 
           wt =w;
        }}

        static void creategraph(ArrayList<Edge> graph[]){
            for(int i=0 ; i<graph.length ; i++){
                graph[i] = new ArrayList<>() ;
            }
            graph[0].add(new Edge(0,1,2) ) ; 
            graph[0].add(new Edge(0,2,4)) ; 

            graph[1].add(new Edge(1,3,7)) ;
            graph[1].add(new Edge(1,2,1)) ;

            graph[2].add(new Edge(2,4,3)) ; 

            graph[3].add(new Edge(3,5,1)) ; 

            graph[4].add(new Edge(4,3,2)) ; 
            graph[4].add(new Edge(4,5,5)) ;
        }

        static class  Pair implements Comparable<Pair> {
        int n ; int path ; 
        public Pair(int a , int p ){
            n = a ; 
            path =p ; 
        }
        @Override 
        public int compareTo(Pair p2){
            return this.path - p2.path ; 
        }
            
        }
        static void dikra(  ArrayList<Edge> graph[] ,int src){
            int dist[] = new int[graph.length]  ; 
            for(int i = 0 ; i<graph.length ; i++){
                if(i!=src){
                    dist[i] =Integer.MAX_VALUE  ; 
                }
            }
            boolean vis [] = new boolean[graph.length] ; 
            PriorityQueue<Pair> pq = new PriorityQueue<>() ; 

            pq.add(new Pair(src, 0));
            while(!pq.isEmpty()){
                Pair curr = pq.remove() ; 
                if(!vis[curr.n]){
                    vis[curr.n] = true ;

                    for(int i = 0 ; i<graph[curr.n].size() ; i++){
                        Edge e = graph[curr.n].get(i) ;
                        int u = e.src ; 
                        int v= e.dest ; 
                        int wtt = e.wt ; 
                        if(dist[u]+ wtt < dist[v]){
                            dist[v] =dist[u]+ wtt ;
                            pq.add(new Pair(v, dist[v])) ;
                        }
                    }
                }
            }

            for (int i = 0; i < dist.length; i++) {
                System.out.println(dist[i]);
            }
        }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6] ; 
        creategraph(graph);

        int src= 0 ; 
        dikra(graph, src);

    }
}
