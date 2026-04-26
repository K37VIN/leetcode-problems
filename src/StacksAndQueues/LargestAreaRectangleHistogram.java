package StacksAndQueues;

public class LargestAreaRectangleHistogram {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3, 1};
        int n = arr.length;

        System.out.println("The largest area in the histogram is " + largestArea(arr, n));
    }

    public static int largestArea(int[] arr,int n){
        int maxArea = 0;

        for (int i = 0;i < n; i++){
            int minHeight=Integer.MAX_VALUE;
            for (int j = i;j<n;j++){
                minHeight=Math.min(minHeight,arr[j]);

                int area = minHeight * (j - i + 1);

                maxArea = Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
}
