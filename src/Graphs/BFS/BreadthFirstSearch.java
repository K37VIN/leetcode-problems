package Graphs.BFS;


import java.util.*;
public class BreadthFirstSearch {

    public static void bfs(int start,ArrayList<ArrayList<Integer>> graph,boolean[] visited){

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()){
            int node = queue.poll();

            System.out.println(node + " ");

            for (int neighbor : graph.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;

                    queue.offer(neighbor);
                }
            }
        }
    }
}
