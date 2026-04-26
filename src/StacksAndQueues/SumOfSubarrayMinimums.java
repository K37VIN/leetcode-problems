package StacksAndQueues;

import java.util.*;

public class SumOfSubarrayMinimums {

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int ans = sumOfSubarrayMins(arr);
        System.out.println(ans);
    }

    public static int sumOfSubarrayMins(int[] arr){

        List<List<Integer>> subarray = generateSubarrays(arr);
        List<Integer> mins = new ArrayList<>();

        for (List<Integer> subs: subarray){
            int min = Integer.MAX_VALUE;

            for(int num:subs){
                min = Math.min(num,min);
            }

            mins.add(min);
        }

        int sum = 0;
        for(int i = 0;i < mins.size();i++){
            sum += mins.get(i);
        }

        return sum;
    }


    public static List<List<Integer>> generateSubarrays(int[] arr){

        int n = arr.length;
        List<List<Integer>> subarray = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for (int j = i; j < n; j++) {

                List<Integer> temp = new ArrayList<>();

                for (int k = i; k <= j; k++) {
                    temp.add(arr[k]);
                }

                subarray.add(temp);
            }
        }

        return subarray;
    }
}