package Graphs;

import java.util.ArrayList;

// ALL PATH FROM SOURCE TO TARGET 

public class Path {
    public static  class Edge{
        int src ; 
        int dest ; 
        Edge(int s, int d)
        {
            src = s ; 
            dest =d ; 
        }
    }

   public static void creategraph(ArrayList<Edge> graph[]){
        for(int i = 0  ; i<graph.length ; i++){
            graph[i] = new ArrayList<>() ; 
        }

        graph[0].add(new Edge(0,3)) ; 
        graph[2].add(new Edge(2,3)) ; 
        graph[3].add(new Edge(3,1)) ; 
        graph[4].add(new Edge(4,0)) ; 
        graph[4].add(new Edge(4,1)) ; 
        graph[5].add(new Edge(5,0)) ; 
        graph[5].add(new Edge(5,2)) ; 
    }

    static void printAllPath( ArrayList<Edge> graph [] , int src ,int des , String path){
        if(src==des){
            System.out.println(path+des);
            return ;
        }
        for(int i = 0 ; i< graph[src].size();i++){
            Edge e = graph[src].get(i) ; 
            printAllPath(graph, e.dest, des, path+src);

        }
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph [] = new ArrayList[6]  ; 
        creategraph(graph);
        printAllPath(graph, 5, 1, "");
    }
}
