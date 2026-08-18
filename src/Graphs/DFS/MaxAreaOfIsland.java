package Graphs.DFS;

import java.util.*;


public class MaxAreaOfIsland {

    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,1,-1};


    public static int dfs(int r,int c,int[][] grid){
        int n = grid.length;
        int m = grid[0].length;

        if (r < 0 || r > n || c < 0 || c> n ){
            return 0;
        }

        int area = 1;

        for(int k=0;k<=4;k++){
            int nr = r+dr[k];
            int nc = c+dc[k];

            area += dfs(nr,nc,grid);
        }


        return area;
    }

    public static int maxAreaIsland(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;

        int maxArea = 0;

        for(int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                int area = dfs(i,j,grid);

                maxArea = Math.max(maxArea,area);

            }
        }

        return maxArea;
    }
}
