package Arrays;

public class BestTimeBuyAndSellStock {
    public static void main(String[] args){
        int[] arr={7,1,5,3,6,4};
        int profit=maximizeProfit(arr);
        System.out.println(profit);
    }

    public static int maximizeProfit(int[] arr){
        int n=arr.length;
        int diff=0;
        for(int i=0;i<n;i++){
            for (int j=1;j<n;j++) {
                diff = Math.max(diff,(arr[j] - arr[i]));
            }
        }
        if (diff<0){
            return 0;
        }
        return diff;
    }
}
