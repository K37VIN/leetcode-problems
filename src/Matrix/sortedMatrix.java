package Matrix;

import java.util.*;
import java.util.ArrayList;

public class sortedMatrix {
    public static void main(String[] args){
        int[][] arr={{10,20,30,40},{15,20,35,42},{27,29,37,46},{32,33,38,49}};
        int n=4;
        int m=4;
        sortMatrix(arr,n,m);
    }

    public static void sortMatrix(int[][] arr,int n,int m){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                list.add(arr[i][j]);
            }
        }

        int[] arr1=new int[n * m];
        for(int i=0;i<list.size();i++){
            arr1[i]=list.get(i);
        }

        Arrays.sort(arr1);

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

    }
}
