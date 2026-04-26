package Arrays;

public class countInversions {
    public static void main(String[] args){
        int[] arr={2,5,1,3,4};
        int countInv=numberOfInversions(arr);
        System.out.println(countInv);
    }

    public static int numberOfInversions(int[] arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
