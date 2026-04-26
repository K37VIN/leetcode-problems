package Strings;

public class countCustomersWhoDidNotGetComputer {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        int k=2;
        int computersWithoutUse=CustomerNotUsingComputers(arr,k);
        System.out.println(computersWithoutUse);
    }

    public static int CustomerNotUsingComputers(int[] arr,int k){
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max-k;
    }
}
