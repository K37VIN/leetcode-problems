package Graphs.DFS;

import java.util.*;

public class DepthFirstSearch {

    public static void dfs(int node,ArrayList<ArrayList<Integer>> graph,boolean[] visited){
        visited[node] = true;

        for (int neighbour:graph.get(node)) {
            if (!visited[neighbour]) {
                dfs(neighbour,graph,visited);
            }
        }
    }
}
