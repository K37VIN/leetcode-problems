package Matrix;

import java.util.*;
import java.util.ArrayList;

public class kthMinimumFloor {
    public static void main(String[] args) {
        int[][] arr={{1,2,8},{4,10,11},{6,11,12}};
        int k=4;
        int n=3;
        int floor=kthMinFloor(arr,k,n);
        System.out.println(floor);
    }

    public static int kthMinFloor(int[][] arr,int k,int n){
        ArrayList<Integer> list=new ArrayList<>();
        int[] buildings=new int[n * n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                list.add(arr[i][j]);
            }
        }
        for(int i=0;i<list.size();i++){
            buildings[i]=list.get(i);
        }
        Arrays.sort(buildings);

        return buildings[k-1];
    }
}
