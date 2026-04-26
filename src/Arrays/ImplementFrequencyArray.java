package Arrays;

public class ImplementFrequencyArray {

    public static void main(String[] args){
        int[] arr={2,2,3,3,4,4,4,5,7,8,8,9};
        frequencyArray(arr);
    }
    public static void frequencyArray(int[] arr){
        int max=0;
        int n=arr.length;
        for (int nums:arr){
            if (nums>max) max=nums;
        }

        int[] freq=new int[max+1];
        for(int num:arr){
            freq[num]++;
        }

        for(int i=0;i<max+1;i++){
            if (freq[i] > 0)
             System.out.println(i + "->" + freq[i]);
        }
    }
}
