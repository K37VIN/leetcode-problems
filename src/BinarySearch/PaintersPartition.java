package BinarySearch;

public class PaintersPartition {

    private int countPainters(int[] boards,int time){
        int painters = 1;
        int totalTime = 0;
        for (int i = 0; i < boards.length; i++){
            if ((totalTime + boards[i]) <= time){
                totalTime += boards[i];
            }
            else{
                painters++;
                totalTime = boards[i];
            }
        }

        return painters;
    }

    public int painterPartition(int[] boards, int k,int n){
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int result = 0;


        for(int i = 0;i < n;i++){
            low = Math.max(low,boards[i]);
            high += boards[i];
        }

        while(low < high){
            int mid = low + (high - low)/2;
            int painters = countPainters(boards,mid);
            if(painters <= k){
                result = mid;
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }

        return result;
    }
}
