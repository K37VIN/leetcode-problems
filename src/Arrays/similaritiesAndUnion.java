package Arrays;

import java.util.ArrayList;

public class similaritiesAndUnion {

    public static void main(String[] args){
        int[] arr1={1,2};
        int[] arr2={3,4};
        ArrayList<Integer> counts=similarityAndUnion(arr1,arr2);
        for(int i=0;i<counts.size();i++){
            System.out.println(counts.get(i));
        }
    }
    public static ArrayList<Integer> similarityAndUnion(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        ArrayList<Integer> counts=new ArrayList<>();
        int count=0;
        for (int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if (arr1[i]==arr2[j]){
                    count++;
                }
            }
        }
        counts.add(count);

        ArrayList<Integer> union=new ArrayList<>();
        for(int i=0;i<n1;i++){
            union.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            union.add(arr2[i]);
        }

        counts.add(union.size());

        return counts;
    }
}
