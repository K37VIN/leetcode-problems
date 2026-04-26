package BinarySearch;


//to find single element in an array we can use the XOR method of bit manipulation
public class SingleElementInArray {
    public static int singleElement(int[] arr){
        int ans = 0;
        int n=arr.length;

        for (int i=0;i<n;i++){
           ans=ans ^ arr[i];
        }

        return ans;
    }
}
