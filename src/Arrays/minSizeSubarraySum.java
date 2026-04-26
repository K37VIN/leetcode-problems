package Arrays;

import java.util.ArrayList;

public class minSizeSubarraySum {
    public static void main(String[] args) {
     int[] arr={2,3,1,2,4,3};
     int target=7;
     int size=minimumSizeSum(arr,target);
     System.out.println(size);
    }

    public static int minimumSizeSum(int[] arr,int target){
        int n=arr.length;
        int minSize=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int maxSum=0;
            for(int j=i;j<n;j++){
                maxSum+=arr[j];
                if (maxSum>=target){
                    minSize=Math.min(minSize,j-i+1);
                    break;
                }

            }
        }
        return minSize;
    }
}
