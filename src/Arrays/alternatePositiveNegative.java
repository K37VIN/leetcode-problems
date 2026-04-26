package Arrays;

import java.util.ArrayList;

public class alternatePositiveNegative {
    public static void main(String[] args){
        int[] arr={9,4,-2,-2,-1,5,0,-5,-3,2};
        rearrangePositiveNegative(arr);
    }

    public static void rearrangePositiveNegative(int[] arr){
        int n=arr.length;
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if (arr[i]<0){
                neg.add(arr[i]);
            }
        }

        int i=0,j=0,k=0;
        while(i<pos.size() && j<neg.size()){
            arr[k++] = pos.get(i++);
            arr[k++] = neg.get(j++);
        }

        while(i<pos.size()){
            arr[k++] = pos.get(i++);
        }
        while(j<neg.size()){
            arr[k++] = neg.get(j++);
        }

        for (int p=0;p<n;p++){
            System.out.println(arr[p]);
        }
    }
}
