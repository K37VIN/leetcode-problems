package BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2,3};
        int target=3;
        int pos=searchInRotatedArray(arr,target);
        System.out.println(pos);
    }

    public static int searchInRotatedArray(int[] arr,int x){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=low + (high-low)/2;

            if (arr[mid] == x){
                return mid;
            }
            if (arr[low] <= arr[mid]){
                if (x >= arr[low] && x < arr[mid]){
                    high=mid-1;
                 }
                else{
                    low=mid+1;
                }
            } else{
                if (x > arr[mid] && x <= arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            }
        return -1;

    }
}
