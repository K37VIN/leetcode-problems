package Arrays;

import java.util.*;

import java.util.ArrayList;

public class medianOfAllSubarraysOfAParticularSize {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int m=3;
        ArrayList<Double> resultant=medianOfAllSubarrays(arr,m);
        System.out.println(resultant);
    }

    public static ArrayList<Double> medianOfAllSubarrays(int[] arr, int m) {
        int n = arr.length;
        ArrayList<Double> medians = new ArrayList<>();

        for (int i = 0; i <= n - m; i++) {

            // Extract subarray of size m
            int[] temp = new int[m];
            for (int j = 0; j < m; j++) {
                temp[j] = arr[i + j];
            }

            // Sort the subarray
            Arrays.sort(temp);

            // Compute median
            double med;
            if (m % 2 == 1) {
                med = temp[m / 2];
            } else {
                med = (temp[m / 2 - 1] + temp[m / 2]) / 2.0;
            }

            medians.add(med);
        }

        return medians;
    }

}
