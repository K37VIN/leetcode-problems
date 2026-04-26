package BinarySearch;

import java.util.*;
public class SmallestDivisor {


    private static int helper(int[] arr, int div) {
        int sum = 0;
        for (int num : arr) {
            sum += (int) Math.ceil((double) num / div);
        }
        return sum;
    }
    public static int smallestDivisor(int[] arr,int limit){
        int low=1;
        int high=Arrays.stream(arr).max().getAsInt();

        while (low<=high){
            int mid=low+(high-low)/2;
            if(helper(arr,mid) <= limit){
                high=mid-1;
            }
            else{
                low=mid + 1;
            }
        }
       return low;
    }
}
