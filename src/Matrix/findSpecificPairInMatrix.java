package Matrix;

import java.util.ArrayList;

public class findSpecificPairInMatrix {
    public static void main(String[] args){
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int n=3;
        int m=3;
        int maxDiff=maximumDifference(mat,n,m);
        System.out.println(maxDiff);
    }

    public static int maximumDifference(int[][] mat,int n,int m){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                list.add(mat[i][j]);

            }
        }

        int[] arr=new int[n*m];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }

        int len=arr.length;

        int maxDiff=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int diff=arr[j]-arr[i];
                maxDiff=Math.max(maxDiff,diff);
            }
        }

        return maxDiff;
    }
}
