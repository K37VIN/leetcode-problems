package Graphs.DFS;

public class FloodFill {

    static int[] dr= {-1,1,0,0};
    static int[] dc= {0,0,1,-1};

    public static void dfs(int r,int c,int[][] image,int originalColor,int newColor){
        int n = image.length;
        int m = image[0].length;

        if (r<0 || r>n || c<0 || c>m){
            return;
        }
        if (image[r][c] != originalColor){
            return;
        }

        image[r][c] = newColor;


        for(int k=0;k<4;k++){
            int nr = r + dr[k];
            int nc = c + dc[k];

            dfs(nr,nc,image,originalColor,newColor);
        }
    }
    public static int[][] floodFill(int sr,int sc,int color,int[][] image){
        int originalColor = image[sr][sc];

        if (originalColor == color){
            return image;
        }

        dfs(sr,sc,image,originalColor,color);

        return image;
    }
}
