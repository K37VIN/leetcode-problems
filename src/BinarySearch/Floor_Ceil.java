package BinarySearch;

public class Floor_Ceil {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        int x=7;
        int floor=floorOfNumber(arr,x);
        int ceil=ceilOfNumber(arr,x);
        System.out.println(floor);
        System.out.println(ceil);
    }

    public static int ceilOfNumber(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low<high){
            int mid = low + (high-low)/2;
            if (arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return ans;
    }

    public static int floorOfNumber(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low<high){
            int mid = low + (high-low)/2;
            if (arr[mid]<=target){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return ans;

    }
}
