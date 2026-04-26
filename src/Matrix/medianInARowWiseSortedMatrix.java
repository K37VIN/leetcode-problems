package Matrix;

import java.util.*;
import java.util.ArrayList;

public class medianInARowWiseSortedMatrix {
    public static void main(String[] args){
        int[][] arr={{1,3,5},{2,6,9},{3,6,9}};
        int n=3;
        int m=3;
        int median=findMedian(arr,n,m);
        System.out.println(median);
    }

    public static int findMedian(int[][] arr,int n,int m){
        int len=n * m;
        ArrayList<Integer> onedim=new ArrayList<>();
        int[] arr1=new int[len];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                onedim.add(arr[i][j]);
            }
        }
        for(int i=0;i<onedim.size();i++){
            arr1[i]=onedim.get(i);
        }

        Arrays.sort(arr1);

        int p=arr1.length;
        if (p % 2 == 1){
            return arr1[p / 2];
        }
        else{
            return arr1[p / 2 - 1] + arr1[p / 2];
        }
    }
}
