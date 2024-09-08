package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSort {
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

        graph[2].add(new Edge(2,3)) ; 
        graph[3].add(new Edge(3,1)) ; 
        graph[4].add(new Edge(4,0)) ; 
        graph[4].add(new Edge(4,1)) ; 
        graph[5].add(new Edge(5,0)) ; 
        graph[5].add(new Edge(5,2)) ; 
    }

    static void topSortDFS(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length] ; 
        Stack<Integer> s= new Stack<>() ; 
        for(int i = 0 ; i< graph.length ; i++){
            if(!vis[i]){
                topSortUtil(graph,i,vis,s) ; 
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }

    static void topSortUtil(ArrayList<Edge> graph[] ,int curr,boolean vis[], Stack<Integer> s ){
        vis[curr] =true ; 
        for(int i = 0 ; i<graph[curr].size() ; i++){
            Edge e = graph[curr].get(i) ; 
            if(!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    static void indegCalculator(int arr[] ,ArrayList<Edge> graph[]){
        for(int i = 0 ; i<graph.length; i++) {
            int v= i ; 
            for(int j = 0 ;j<graph[v].size(); j++){
                Edge e = graph[v].get(j) ; 
                arr[e.dest]++ ; 
            }
        }
        
    }

  static void   topSortBFS(ArrayList<Edge> graph[]){
    int indegree []= new int [graph.length] ; 
    indegCalculator(indegree, graph);
    Queue <Integer> q = new LinkedList<>() ; 
    for ( int  i = 0; i < indegree.length; i++) {if (indegree[i]==0) {
        q.add(i);     
    }   
    }
    while (!q.isEmpty()) {
        int curr = q.remove() ;
        System.out.print(curr+" ");
        for(int i =0 ;i<graph[curr].size() ; i++){
            Edge e = graph[curr].get(i) ;
            indegree[e.dest]-- ; 
            if(indegree[e.dest]==0 ){
                q.add(e.dest);
            }
        }
    }
  }


public static void main(String[] args) {
    ArrayList<Edge> graph[] = new ArrayList[6] ; 
    creategraph( graph);
    topSortDFS(graph);  
}}
