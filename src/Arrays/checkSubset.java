package Arrays;

public class checkSubset {
    public static void main(String[] args){
        int[] arr1 = {2,3,4};
        int[] arr2 = {4,3};
        boolean checkSubset=checkSubsetTrueOrFalse(arr1,arr2);
        System.out.println(checkSubset);
    }

    public static boolean checkSubsetTrueOrFalse(int[] arr1,int[] arr2){
        boolean outcome=false;
        int n1= arr1.length;
        int n2= arr2.length;
        int max1=0,max2=0;
        for(int nums1:arr1){
            if(nums1>max1){
                max1=nums1;
            }
        }

        for(int nums2:arr2){
            if(nums2>max2){
                max2=nums2;
            }
        }

        int[] freq1=new int[max1+1];
        int[] freq2=new int[max2+1];

        for(int num1:arr1){
            freq1[num1]++;
        }

        for(int num2:arr2){
            freq2[num2]++;
        }

        for(int p:arr1){
            for (int q:arr2){
                if (!(p == q) && !(freq1[p]==freq2[q])){
                    return false;
                }
            }
        }

        return true;
    }
}
