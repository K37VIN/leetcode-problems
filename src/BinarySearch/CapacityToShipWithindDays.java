package BinarySearch;


import java.util.*;
public class CapacityToShipWithindDays {

    public int shipWithinDays(int[] weights,int days){
        int low = 0;
        int high = 0;

        for (int wt:weights){
            low = Math.max(wt,low);

            high += wt;
        }

        while (low < high){
            int mid = low + (high - low)/2;

            if (canShip(weights,days,mid)){
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canShip(int[] weights,int days,int cap){
        int usedDays = 1;
        int currentCap = 0;

        for (int wt: weights){
            if (currentCap + wt >= cap){
                usedDays++;
            }

            if (usedDays > days){
                return false;
            }
        }

        return true;
    }
}

