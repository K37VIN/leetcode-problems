package Arrays;

import java.util.ArrayList;

public class revArray {

    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7,8};
        int indx=3;
        ArrayList<Integer>rev=reverseArr(indx,arr);
        for(int i=0;i<rev.size();i++){
            System.out.println(rev.get(i));
        }

    }

    public static ArrayList<Integer> reverseArr(int indx,int[] arr){
        ArrayList<Integer> rev=new ArrayList<>();
       for(int i=0;i<arr.length-indx;i++){
          rev.add(arr[i]);
       }

       for(int i=arr.length-1;i>indx;i--){
           rev.add(arr[i]);
       }
    return rev;
}}