package BinarySearch;

public class NthRoot {
    public static int nthRoot(int n,int m){
        int low=1;
        int high=m;
        while(low<=high){
            int mid = low + (high-low)/2;
            long ans=0;
            for (int i =1;i<=n;i++){
                ans *= mid;
                if (ans > m) break;

            }

            if (ans == m){
                return mid;
            }
            if (ans < m){
                low = mid + 1;
            }
            else{
                high =mid - 1;
            }
        }


        return -1;


    }
}
