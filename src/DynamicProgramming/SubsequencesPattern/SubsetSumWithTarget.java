package DynamicProgramming.SubsequencesPattern;

public class SubsetSumWithTarget {

    public boolean subsetSum(int ind, int target, int[] arr, int[][] dp){
        if (target == 0){
            return true;
        }
        if (ind == 0){
            return (arr[0] == target);
        }

        if (dp[ind][target] != -1){
            return dp[ind][target] == 1;
        }



        boolean notTake = subsetSum(ind-1,target,arr,dp);
        boolean take = false;
        if (arr[ind] <= target){
            take = subsetSum(ind-1,target-arr[ind],arr,dp);
        }

        boolean result = take || notTake;
        dp[ind][target] = result ? 1:0;
        return result;
    }
}
