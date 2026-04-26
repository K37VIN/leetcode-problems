package BinarySearch;

public class Sqrt {
    public static void main(String[] args) {
        int num=9;
        int sqrt=sqrtNum(num);
        System.out.println(sqrt);
    }
    public static int sqrtNum(int num){
        int low=1;
        int high=num/2;
        int ans = 0;
        while (low<high){
            int mid=low+(high-low)/2;
            if (mid * mid <= num){
                ans = (int) mid;
                low=(int)mid+1;
            }
            else{
                high=(int)mid-1;
            }
        }


        return ans;

    }
}
