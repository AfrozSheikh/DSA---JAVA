package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Implementation {
    public static class  Edge {
        
        int src ; 
        int dest ; 
        int wieght ; 
       
        Edge(int sr, int des,int wt){
            src = sr ;
            dest =des ; 
           wieght =wt;
        }}

        static void creategraph(ArrayList<Edge> graph[]){
            for(int i=0 ; i<graph.length ; i++){
                graph[i] = new ArrayList<>() ;
            }

            graph[0].add(new Edge(0,1,1));
            graph[0].add(new Edge(0,2,1));

            graph[1].add(new Edge(1,0,1));
            graph[1].add(new Edge(1,3,1));

            graph[2].add(new Edge(2,0,1));
            graph[2].add(new Edge(2,4,1));

            graph[3].add(new Edge(3,1,1));
            graph[3].add(new Edge(3,4,1));
            graph[3].add(new Edge(3,5,1));
        
            graph[4].add(new Edge(4,2,1));
            graph[4].add(new Edge(4,3,1));
            graph[4].add(new Edge(4,5,1));

            graph[5].add(new Edge(5,3,1));
            graph[5].add(new Edge(5,4,1));
            graph[5].add(new Edge(5,6,1));

            graph[6].add(new Edge(6,5,1));

        }

        public static void bfs(ArrayList<Edge> [] graph){
            Queue<Integer> q = new LinkedList<>() ; 
            boolean visited[]= new boolean[graph.length] ;
            q.add(0) ; 
            while (!q.isEmpty()) {
                int curr = q.remove() ;
                if(!visited[curr]){
                    System.out.print(curr+" ");
                    visited[curr] = true ; 
                    for(int i= 0 ; i<graph[curr].size() ; i++){
                        Edge e = graph[curr].get(i) ;
                        q.add(e.dest) ; 
                    }
                }
                
            }
        }
  
        static void dfs(ArrayList<Edge> graph[] , boolean visited[] , int curr){
            System.out.print(" "+curr);
            visited[curr] =true ;
            for(int i = 0 ; i<graph[curr].size() ; i++)
            {
                Edge e = graph[curr].get(i) ; 
                if(!visited[e.dest]){
                    dfs(graph, visited, e.dest);

                }
            }
        }

           
      
          
        public static void main(String[] args) {
            int v= 7; 
            ArrayList<Edge> [] graph = new ArrayList[v] ;
            creategraph(graph);     
            
           dfs(graph, new boolean[v], 0);
            
        

    
        
    }
}