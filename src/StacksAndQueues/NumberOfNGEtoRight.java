package StacksAndQueues;
import java.util.*;

public class NumberOfNGEtoRight {


    public static void main(String[] args) {
        int[] arr ={3,4,2,7,5,8,10,6};
        int queries=2;
        int[] indices={0,5};
        List<Integer> result=numberOfNGERight(arr,queries,indices);
        System.out.println(result);
    }

    public static List<Integer> numberOfNGERight(int[] arr,int queries,int[] indices ){
        List<Integer> list = new ArrayList<>();

        for (int i=0;i<indices.length;i++){
            int cnt = 0;
            int elem = arr[indices[i]];
            for (int j=indices[i]+1;j<arr.length;j++){
                if (arr[j] > elem){
                    cnt += 1;
                }
            }
            list.add(cnt);
        }


        return list;
    }
}
