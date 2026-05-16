package BinarySearch;

public class MinimumDaysToMakemBouquets {

    public boolean isPossible(
            int[] arr,
            int days,
            int m,
            int k
    ) {

        int count = 0;
        int bouquets = 0;

        for (int bloom : arr) {

            if (bloom <= days) {

                count++;

                if (count == k) {

                    bouquets++;

                    count = 0;
                }

            } else {

                count = 0;
            }
        }

        return bouquets >= m;
    }

    public int minDays(
            int[] arr,
            int m,
            int k
    ) {

        int flowersPossible = m * k;

        if (flowersPossible > arr.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        int res = -1;

        for (int days : arr) {

            low = Math.min(days, low);

            high = Math.max(days, high);
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (isPossible(arr, mid, m, k)) {

                res = mid;

                high = mid;

            } else {

                low = mid + 1;
            }
        }

        return res;
    }
}
