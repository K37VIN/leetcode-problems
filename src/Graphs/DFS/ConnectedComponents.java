package Graphs.DFS;


import java.util.*;
public class ConnectedComponents {


    public static void dfs(int node,ArrayList<ArrayList<Integer>> graph,boolean[] visited){
        visited[node] = true;

        for(int neighbour:graph.get(node)){
            if (!visited[node]){
                dfs(neighbour,graph,visited);
            }
        }
    }

    public static int connectedComponents(int n,ArrayList<ArrayList<Integer>> graph){
        boolean[] visited = new boolean[n];

        int components = 0;

        for (int i=0;i<n;i++){
            if(!visited[i]){
                components++;

                dfs(i,graph,visited);
            }
        }


        return components;

    }
}
