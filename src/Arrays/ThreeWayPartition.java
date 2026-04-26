package Arrays;

import java.util.ArrayList;

public class ThreeWayPartition {
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 3, 4};
        int a = 2;
        int b = 3;
        ArrayList<Integer> partition = threeWayPartition(arr, a, b);
        for (int i = 0; i < partition.size(); i++) {
            System.out.println(partition.get(i));
        }
    }

    public static ArrayList<Integer> threeWayPartition(int[] arr, int a, int b) {
        int n = arr.length;
        ArrayList<Integer> partition = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] < a) {
                partition.add(arr[i]);
            }

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] >= a && arr[i] <= b) {
                partition.add(arr[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > b) {
                partition.add(arr[i]);
            }
        }
        return partition;
    }
}
