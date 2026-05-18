package BinarySearch;

public class MagneticForceBetweenTwoBalls {

    private boolean possibleDistance(int[] position,int dist, int m){
        int count = 1;
        int  lastPos = position[0];
        for(int i = 0; i < position.length;i++){
            if ((position[i] - lastPos) >= dist){
                count++;
                lastPos = position[i];
            }
        }
        return count >= m;
    }



    public int magneticForce(int[] position,int m,int n){
        int low = 1;
        int high = position[n-1] - position[0];
        int result = 0;

        while(low < high){
            int mid = low + (high - low)/2;
            if (possibleDistance(position,mid,m)){
                result = mid;
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }

        return low;
    }
}
