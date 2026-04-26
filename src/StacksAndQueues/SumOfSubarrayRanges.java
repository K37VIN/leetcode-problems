package StacksAndQueues;

public class SumOfSubarrayRanges {

    public static void main(String[] args) {
        int[] arr = {1, 3, 3};
        int result = sumOfSubarrayRanges(arr);
        System.out.println(result);
    }
    public static int sumOfSubarrayRanges(int[] arr){
        int n = arr.length;

        int sum = 0;
        for (int i=0;i<n;i++){
            int smallest = arr[i];
            int largest = arr[i];
            for (int j = i; j<n;j++){
               smallest = Math.min(smallest,arr[j]);
               largest = Math.max(largest,arr[j]);

                sum += (largest-smallest);
            }

        }

        return sum;
    }
}
