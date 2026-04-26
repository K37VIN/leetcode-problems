package BinarySearch;

public class ImplementUpperBound {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7,9};
        int x=7;
        int upper=upperBound(arr,x);
        System.out.println(upper);
    }

    public static int upperBound(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low<high){
            int mid=low+(high-low)/2;
            if (arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
