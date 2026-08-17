package Graphs.DFS;


import java.util.*;

public class CycleDetectionInUndirectedGraph {

    public static boolean dfs(int node,int parent,ArrayList<ArrayList<Integer>> graph,boolean[] visited){
         visited[node] = true;
         for(int neighbour:graph.get(node)){
             if(!visited[neighbour]){
                 if(dfs(neighbour,parent,graph,visited)){
                     return true;
                 }
             }
             else if(neighbour != parent){
                 return true;
             }
         }

         return false;
    }

    public static boolean hasCycle(int n,ArrayList<ArrayList<Integer>> graph){
        boolean[] visited = new boolean[n];

        for(int i = 0;i < n;i++){
            if (dfs(i,-1,graph,visited)){
                return true;
            }
        }

        return false;
    }
}
