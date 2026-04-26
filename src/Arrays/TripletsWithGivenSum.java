package Arrays;

import java.util.ArrayList;

public class TripletsWithGivenSum {
    public static void main(String[] args){
        int[] arr={10,5,5,5,2};
        int K=12;
        ArrayList<ArrayList<Integer>> triplets=tripletsWithSum(arr,K);
        System.out.println(triplets);
        }

    public static ArrayList<ArrayList<Integer>> tripletsWithSum(int[] arr,int K){
        int n=arr.length;
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();

        int i=0,j=0,k=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                for(k=0;k<n;k++){
                    if (arr[i]+arr[j]+arr[k] == K){
                        ArrayList<Integer> list=new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        result.add(list);
                    }
                }
            }
        }



        return result;
    }
}
