package Graphs.DFS;

public class NumberOfIslands {
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,1,-1};

    public static void dfs(int r,int c,char[][] grid){
         int n = grid.length;
         int m = grid[0].length;

         grid[r][c] = '0';

         for (int k = 0;k<4;k++){
             int nr = r + dr[k];
             int nc = c + dc[k];

             if (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == '1'){
                 dfs(nr,nc,grid);
             }
         }
    }

    public static int numOfIslands(char[][] grid){
        int n = grid.length;
        int m = grid[0].length;


        int islands = 0;
        for (int i = 0;i < n;i++){
            for (int j = 0;j < m;j++){
                if (grid[i][j] == '1'){
                    islands++;
                    dfs(i,j,grid);
                }
            }
        }

        return islands;
    }

 }
