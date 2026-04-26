package DynamicProgramming.SubsequencesPattern;
import java.util.*;

public class PartitionSetWithMinAbsoluteDiff {

    public boolean SubsetSumUtil(int ind,int target,int[] arr,int[][] dp){
        if (target == 0){
            return true;
        }
        if (ind == 0){
            return (arr[0] == target);
        }

        if (dp[ind][target] != -1){
            return dp[ind][target] == 1;
        }



        boolean notTake = SubsetSumUtil(ind-1,target,arr,dp);
        boolean take = false;
        if (arr[ind] <= target){
            take = SubsetSumUtil(ind-1,target-arr[ind],arr,dp);
        }

        boolean result = take || notTake;
        dp[ind][target] = result ? 1:0;
        return result;
    }

    public int minSubsetSumDifference(int[] arr,int n){
        int totSum = 0;

        for (int val:arr){
            totSum+=val;
        }
        int[][] dp = new int[n][totSum + 1];
        for (int[] row:dp){
            Arrays.fill(row,-1);
        }

        for(int i = 0;i<=totSum;i++){
            SubsetSumUtil(n-1,i,arr,dp);

        }


        int min = Integer.MAX_VALUE;
        for(int s1 = 0; s1 <= totSum; s1++){
            if (dp[n-1][s1] == 1){
                int s2 = totSum - s1;
                int diff = Math.abs(s1-s2);

                min = Math.min(min,diff);
            }
        }

       return min;
    }


}
