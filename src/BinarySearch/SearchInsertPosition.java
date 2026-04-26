package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 6;
        int pos = insertPosition(arr, x);
        System.out.println(pos);
    }

    public static int insertPosition(int[] arr,int num){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low<high){
            int mid=low+(high-low)/2;
            if (arr[mid]>=num){
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
