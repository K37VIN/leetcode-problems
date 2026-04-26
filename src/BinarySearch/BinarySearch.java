package BinarySearch;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={12,11,2,3,8,1,10};
        int elem=10;
        boolean found=binarySearch(arr,elem);
        System.out.println(found);
    }

    public static boolean binarySearch(int[] arr,int x){
        int length=arr.length;
        int low=0;
        int high=arr.length-1;
        Arrays.sort(arr);
        while(low<high){
            int mid=low+(high-low)/2;

            if(x == mid){
                return true;
            }
            if (x > mid){
                low=mid+1;
            }
            if (x < mid){
                high=mid-1;
            }
        }
    return false;
    }
}
