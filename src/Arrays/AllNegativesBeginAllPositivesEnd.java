package Arrays;

import java.util.ArrayList;

public class AllNegativesBeginAllPositivesEnd {
    public static void main(String[] args) {
        int[] arr={2,3,6,-1,-3,4,-9};
        ArrayList<Integer> reorder=reorderArr(arr);
        for (int i=0;i<reorder.size();i++){
            System.out.println(reorder.get(i));
        }
    }

    public static ArrayList<Integer> reorderArr(int[] arr){
        int n=arr.length;
        ArrayList<Integer> rearr=new ArrayList<>();
        for(int i=0;i<n;i++){
            if (arr[i]<0){
                rearr.add(arr[i]);
            }
        }
        for (int i=0;i<n;i++){
            if (arr[i]>=0){
                rearr.add(arr[i]);
            }
        }

        return rearr;
    }
}
