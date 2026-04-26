package BinarySearch;

public class ImplementLowerBound {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,8};
        int x=5;
        int lower=lowerBound(arr,x);
        System.out.println(lower);
    }

    public static int lowerBound(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low<high){
            int mid=low+(high-low)/2;

            if(arr[mid]>=target){
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
