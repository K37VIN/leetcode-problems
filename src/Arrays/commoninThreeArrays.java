package Arrays;

import java.util.ArrayList;

public class commoninThreeArrays {
    public static void main(String[] args){
        int[] arr1={2,3,4,7};
        int[] arr2={0,0,3,5};
        int[] arr3={1,3,8,9};
        ArrayList<Integer> common=commonElement(arr1,arr2,arr3);
        for(int i=0;i<common.size();i++){
            System.out.println(common.get(i));
        }
    }

    public static ArrayList<Integer> commonElement(int[] arr1,int[] arr2,int[] arr3){
        int n1=arr1.length;
        int n2=arr2.length;
        int n3=arr3.length;
        ArrayList<Integer> cmn= new ArrayList<>();
        for (int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                for (int k=0;k<n3;k++){
                    if (arr1[i] == arr2[j] && arr2[j] == arr3[k] && arr1[i] == arr3[k]){
                        cmn.add(arr1[i]);
                    }
                }
            }
        }
        return cmn;
    }
}
