package BinarySearch;

public class KokoEatingBananas {


    private boolean isPossible(int[] bananas,int speed,int h){

        int timePerPile = 0;
        for (int i = 0;i < bananas.length;i++){
            if (bananas[i] > speed){
                timePerPile += (int) Math.ceil((double) bananas[i] / speed);
            }
            else{
                timePerPile += 1;
            }
        }

        return timePerPile <= h;
    }

    public int Bananas(int[] bananas,int h){
        int low = 1;
        int high = 0;
        for (int i = 0;i < bananas.length;i++){
            high = Math.max(high,bananas[i]);
        }

        while (low < high){
            int mid =  low + (high - low)/2;

            if (isPossible(bananas,mid,h)){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }
}
