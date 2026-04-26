package Strings;

import java.util.ArrayList;

public class findAllOccurencesOfAString {
    public static void main(String[] args){
        String str="yxxyxxy";
        String pat="xxy";
        ArrayList<Integer> indices=findOccurrencesOfPattern(str,pat);
        System.out.println(indices);

    }

    public static ArrayList<Integer> findOccurrencesOfPattern(String str, String pat){
        char[] arr=str.toCharArray();
        char[] pattern=pat.toCharArray();
        ArrayList<Integer> indices=new ArrayList<>();
        int n=arr.length;
        int m=pattern.length;


        for(int i=0;i<=n-m;i++){
            int j=0;
            while(j<m && arr[i+j] == pattern[j]){
                j++;
            }
            if (j == m){
                indices.add(i);
            }
        }

      return indices;
    }
}
