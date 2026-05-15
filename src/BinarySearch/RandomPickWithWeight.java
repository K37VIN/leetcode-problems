package BinarySearch;


import java.util.*;

public class RandomPickWithWeight {
    int[] prefix;
    int total;
    Random rand;

    public RandomPickWithWeight(int[] w){

       prefix = new int[w.length];
       prefix[0] = w[0];
       int n = w.length;
       for (int i = 1;i<n;i++){
           prefix[i] = prefix[i-1] + w[i];
       }

       total = prefix[prefix.length - 1];

       rand = new Random();

    }


    public int randomPick(){
        int target = rand.nextInt(total) + 1;

        int low = 0;
        int high = prefix.length - 1;

        while (low < high){
            int mid = low + (high - low)/2;

            if (prefix[mid] >= target){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }
}
