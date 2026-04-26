package Graphs;

import java.util.*;

public class MazeSolver {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 1, 1, 1, 0, 1, 1, 1},
                {0, 1, 0, 1, 0, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 0, 0, 1, 0, 1, 1},
                {1, 0, 0, 1, 1, 1, 1, 0, 1, 0},
                {1, 1, 1, 0, 0, 1, 0, 1, 1, 0},
                {0, 0, 1, 1, 1, 1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 0, 1, 1, 1, 0},
                {1, 0, 1, 1, 1, 1, 1, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 1, 0, 1},
                {0, 1, 1, 1, 1, 0, 1, 1, 1, 1}
        };
        int sr = 0;
        int sc = 0;
        int tr = 9;
        int tc = 9;

        int minPath = shortestPathInMazeWithoutObstacles(grid, sr, sc, tr, tc);
        System.out.println(minPath);

    }

    public static int shortestPathInMazeWithoutObstacles(int[][] grid,int sr,int sc,int tr,int tc){
        int rows=grid.length;
        int cols=grid[0].length;
        int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};

        if(grid[sr][sc]==0 || grid[tr][tc]==0){
            return -1;   //unreachable
        }

        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited=new boolean[rows][cols];
        int[][] dist=new int[rows][cols];


        q.add(new int[]{sr,sc});
        visited[sr][sc]= true;
        dist[sr][sc]=0;

        while(!q.isEmpty()){
            int[] cur=q.poll();
            int r=cur[0], c=cur[1];

            if(r == tr && c == tc){
                return dist[r][c];
            }

            for(int[] d:directions){
                int nr=r+d[0];
                int nc=c+d[1];


                if (nr >=0 && nr<rows && nc >=0 && nc<cols && !visited[nr][nc] && grid[nr][nc] == 1){
                    visited[nr][nc]=true;
                    dist[nr][nc]=dist[r][c]+1;
                    q.add(new int[]{nr,nc});
                }
            }


        }

        return -1;  //No path exists

    }
}
