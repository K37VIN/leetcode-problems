package BinarySearch;

//If a number ≤ k exists in the array, it pushes the k-th missing number forward.
//        Think like this:
//
//        We are searching for the k-th missing number.
//
//        Initially, we assume missing numbers start from 1.
//
//        Every time we see a number in the array that is ≤ k, that number:
//
//        Was expected to be missing
//
//        But is actually present
//
//        So the missing count shifts forward by 1
//
//        Hence → k++

import java.util.*;

public class KthMissingPositiveNumber {

    public static void main(String[] args) {
        int[] arr={4,7,9,10};
        int k=4;
        int kthNumber=kthMissingPositive(arr,k);
        System.out.println(kthNumber);
    }
    public static int kthMissingPositive(int[] arr,int k){
        for (int i=0;i<arr.length;i++){
            if (arr[i]<=k){
                k++;
            }
            else{
                break;
            }
        }
        return k;
    }
}
