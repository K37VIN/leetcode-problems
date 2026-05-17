package BinarySearch;

public class AggressiveCows {
    private boolean canPlace(int[] dist,int k,int dis){
        int count = 1;
        int lastPos =dist[0];


        for (int i=1;i<dist.length;i++){
           if ((dist[i] - lastPos) >= dis){
               count++;
               lastPos = dist[i];
           }
        }

        return count >= k;
    }

    public int aggressiveCows(int[] dist,int k){

        int n = dist.length;
        int low = 1;
        int high = dist[n-1] - dist[0];
        int ans = -1;
        while(low < high){
            int mid = low + (high - low)/2;
            if (canPlace(dist,k,mid)){
                ans = mid;
                low = mid + 1;
            }

            else{
               high = mid;
            }
        }

        return ans;

    }
}
