package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class KthSmallestLargest {
    public static void main(String[] args) {
        int[] arr={7,8,6,3,11,4,25,1,2,4};
        int k=4;
        ArrayList<Integer> largestAndSmallest=KthLargestSmallest(arr, k);
        for (int i=0;i<largestAndSmallest.size();i++) {
            System.out.println(largestAndSmallest.get(i));
        }
    }

    public static ArrayList<Integer> KthLargestSmallest(int[] arr,int k){
        ArrayList<Integer> Karr=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        Karr.add(arr[k-1]);
        Karr.add(arr[n-k]);
        return Karr;
    }
}
