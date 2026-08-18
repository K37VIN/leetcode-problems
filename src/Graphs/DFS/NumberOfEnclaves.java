package Graphs.DFS;

public class NumberOfEnclaves {

    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,1,-1};

     public static void dfs(int r,int c,int[][] grid){
         int n = grid.length;
         int m = grid[0].length;

         if (r<0 || r>=n || c<0 || c>=m || grid[r][c] == 0){
             return;
         }

         grid[r][c] = 0;

         for(int k = 0; k<4; k++){
             int nr = r + dr[k];
             int nc = c + dc[k];

             dfs(nr,nc,grid);
         }
     }

     public static int numberOfEnclaves(int[][] grid){

         int n = grid.length;
         int m = grid[0].length;

         for(int j = 0;j<m;j++){
             dfs(0,j,grid);
             dfs(n-1,j,grid);
         }

         for(int i = 0;i<n;i++){
             dfs(i,0,grid);
             dfs(i,m-1,grid);
         }


         int count = 0;
         for(int i = 0;i<n;i++){
             for(int j = 0;j<m;j++){
                 if(grid[i][j] == 1){
                     count++;
                 }
             }
         }
         return count;

     }
}
