package Arrays;

public class majorityElementII {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        int element=majorityElement(arr);
        System.out.println(element);
    }
    public static int majorityElement(int[] arr){
        int n=arr.length;

        int max=0;
        for(int nums:arr){
            if (nums>max){
                max=nums;
            }
        }
        int[] freq=new int[max+1];
        for(int num:arr){
            freq[num]++;
        }

        for( int number:arr){
            if (freq[number]> Math.floor (n / 3)){
                return number;
            }
        }
        return 0;
    }
}
