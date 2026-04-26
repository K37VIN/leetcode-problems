package Arrays;

public class maxProductSubarray {
    public static void main(String[] args){
        int[] arr={-2,6,-3,-10,0,2};
        int maxProduct=maximumProduct(arr);
        System.out.println(maxProduct);
    }

    public static int maximumProduct(int[] arr){
        int n=arr.length;
        int maxProd=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=i;j<n;j++){
                product*=arr[j];
                maxProd=Math.max(maxProd,product);
            }
        }
        return maxProd;
    }
}
