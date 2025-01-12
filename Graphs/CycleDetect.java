package Graphs ; 

import java.util.ArrayList;
// DFS is used 

public class CycleDetect {



    public static class  Edge {
        
        int src ; 
        int dest ; 
        
       
        Edge(int sr, int des){
            src = sr ;
            dest =des ; 
          
        }}
     static void creategraph(ArrayList<Edge> graph[]){
            for(int i=0 ; i<graph.length ; i++){
                graph[i] = new ArrayList<>() ;
            }

            graph[0].add(new Edge(0, 1)) ;
          graph[0].add(new Edge(0, 2)) ;
            graph[0].add(new Edge(0, 3)) ;

            graph[1].add(new Edge(1, 0)) ;
            graph[1].add(new Edge(1, 2)) ;

           graph[2].add(new Edge(2, 0)) ;
           graph[2].add(new Edge(2, 1)) ;
            graph[3].add(new Edge(3, 0)) ;
            graph[3].add(new Edge(3, 4)) ;
            graph[4].add(new Edge(4, 3)) ;

        }
        
        public static boolean detechCycke(ArrayList<Edge> [] graph){
            boolean vis[]= new boolean[graph.length] ;
            for(int i =0 ; i<graph.length ; i++)
            {
                if(!vis[i])
                {
                    if(detectCycleUtil(graph,vis,i,-1)) 
                    return true ; 
                }
            }
            return false ; 
        }

        static boolean detectCycleUtil(ArrayList<Edge> graph[] , boolean vis[] ,int curr, int parent)
        {
            vis[curr] = true ;
            for(int i =0 ; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i)  ;

                if(!vis[e.dest] ) {
                if (detectCycleUtil(graph,vis,e.dest,curr)) {
                    return true; 
                }
              }

                else if(vis[e.dest] && e.dest !=parent) return true ; 
            }
            return false ; 
        }
        public static void main(String[] args) {
            int v= 7; 
            ArrayList<Edge> [] graph = new ArrayList[v] ;
          
            creategraph(graph);
           
            System.out.println(detechCycke(graph));
        

    
        
    }
}

