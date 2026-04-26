package Graphs;

import java.util.*;
public class BidirectionalBFS {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 1},
                {1, 0, 0, 1},
                {1, 1, 0, 0},
                {0 ,1 ,0 ,1},
        };

        int sr=0;
        int sc=0;
        int tr=9;
        int tc=9;

        int path=shortestPathUsingBidirectionalBFS(grid,sr,sc,tr,tc);
        System.out.println(path);

    }
    public static int shortestPathUsingBidirectionalBFS(int[][] grid, int sr, int sc, int tr, int tc) {

        int rows = grid.length;
        int cols = grid[0].length;


        if (grid[sr][sc] == 0 || grid[tr][tc] == 0)
            return -1;

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        Queue<int[]> q1 = new LinkedList<>();
        Queue<int[]> q2 = new LinkedList<>();

        boolean[][] visited1 = new boolean[rows][cols];
        boolean[][] visited2 = new boolean[rows][cols];

        int[][] dist1 = new int[rows][cols];
        int[][] dist2 = new int[rows][cols];


        q1.add(new int[]{sr, sc});
        visited1[sr][sc] = true;
        dist1[sr][sc] = 0;


        q2.add(new int[]{tr, tc});
        visited2[tr][tc] = true;
        dist2[tr][tc] = 0;


        while (!q1.isEmpty() && !q2.isEmpty()) {


            if (q1.size() < q2.size()) {
                int ans = expandBFS(grid, q1, visited1, visited2, dist1, dist2, directions);
                if (ans != -1) return ans;
            } else {
                int ans = expandBFS(grid, q2, visited2, visited1, dist2, dist1, directions);
                if (ans != -1) return ans;
            }
        }

        return -1;
    }

    private static int expandBFS(
            int[][] grid, Queue<int[]> q,
            boolean[][] visitedCurr, boolean[][] visitedOther,
            int[][] distCurr, int[][] distOther,
            int[][] dirs) {

        int rows = grid.length;
        int cols = grid[0].length;

        int size = q.size();
        while (size-- > 0) {

            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];


            if (visitedOther[r][c]) {
                return distCurr[r][c] + distOther[r][c];
            }


            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols &&
                        grid[nr][nc] == 1 && !visitedCurr[nr][nc]) {

                    visitedCurr[nr][nc] = true;
                    distCurr[nr][nc] = distCurr[r][c] + 1;
                    q.add(new int[]{nr, nc});
                }
            }
        }
        return -1;
    }

}
