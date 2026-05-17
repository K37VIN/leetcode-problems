package BinarySearch;


import java.util.*;

public class KthElementOfTwoSortedArrays {


    public int kthElementOf2SortedArray(int[] a,int[] b,int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i:a){
            pq.add(i);
        }
        for (int j:b){
            pq.add(j);
        }

        List<Integer> ls= new ArrayList<>();
        for(int i=0;i<k;i++){
            ls.add(pq.poll());
        }

        return ls.get(k-1);
    }
}
