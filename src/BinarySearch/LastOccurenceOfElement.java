package BinarySearch;


// dammar ghorer paposh ta shoriye dite hobe
public class LastOccurenceOfElement {
    public static void main(String[] args) {
        int[] arr={3, 4, 13, 13, 13, 20, 40};
        int x=13;
        int last_index=lastOccurenceOfElement(arr,x);
        System.out.println(last_index);
    }

    public static int lastOccurenceOfElement(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int result=-1;

        while(low<=high){
            int mid = low + (high - low)/2;
            if (arr[mid] == x){
                result=mid;
                low=mid+1;
            }
            if (arr[mid] < x){
                low=mid+1;
            }
            if (arr[mid] > x){
                high=mid-1;
            }
        }
       return result;
    }
}
