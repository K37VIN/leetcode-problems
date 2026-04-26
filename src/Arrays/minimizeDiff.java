package Arrays;

public class minimizeDiff {
     public static void main(String[] args){
         int[] arr={1,5,8,10};
         int currentMin=Integer.MAX_VALUE;
         int currentMax=Integer.MIN_VALUE;
         int k=2;
         int diff=minDifference(arr,k,0,currentMin,currentMax);
         System.out.println(diff);
     }


     public static int minDifference(int[] arr,int k,int i,int currentMin,int currentMax){
         int n=arr.length;
         int ans=currentMax-currentMin;

         //Base case
         if (i == n){
             return currentMax-currentMin;
         }

         //Try out all possible combinations
         int new_val1=arr[i]-k;
         int new_min1=Math.min(currentMin,new_val1);
         int new_max1=Math.max(currentMin,new_val1);

         int diff1=minDifference(arr,k,i+1,new_min1,new_max1);

         int new_val2=arr[i]+k;
         int new_min2=Math.min(currentMin,new_val2);
         int new_max2=Math.max(currentMin,new_val2);

         int diff2=minDifference(arr,k,i+1,new_min2,new_max2);



         //find the minimum difference
         return Math.min(diff1,diff2);

     }
}
