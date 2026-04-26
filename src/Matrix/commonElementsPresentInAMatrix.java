package Matrix;

import java.util.ArrayList;

public class commonElementsPresentInAMatrix {
    public static void main(String[] args){
        int[][] mat={{1,4,5,6},{3,4,5,6},{5,6,7,2}};
        int n=3;
        int m=4;
        ArrayList<Integer> common=commonElements(mat,n,m);
        System.out.println(common);
    }

    public static ArrayList<Integer> commonElements(int[][] mat,int n,int m){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> commons=new ArrayList<>();
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                list.add(mat[i][j]);
            }
        }
        int[] arr=new int[n*m];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }

        int len=arr.length;

        int max=0;
        for(int i=0;i<len;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] freq=new int[max+1];
        for(int num:arr){
            freq[num]++;
        }


        for(int nums:arr){
            if (freq[nums] == n && !commons.contains(nums)){
                commons.add(nums);
            }
        }


        return commons;

    }
}
