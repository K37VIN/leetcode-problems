package Strings;

import java.util.ArrayList;
import java.util.HashSet;

public class ShortestSubstringWithAllCharacters {
    public static void main(String[] args) {
        String str="aabbcabb";
        String subsequence=shortestSubsequenceWithCharacters(str);
        System.out.println(subsequence);
    }

    public static String shortestSubsequenceWithCharacters(String str){
        HashSet<Character> set=new HashSet<>();
        char[] arr=str.toCharArray();
        for(char ch:arr){
            set.add(ch);
        }

        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=arr.length;j++){
                list.add(str.substring(i,j));
            }
        }

        int minSize=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(containsAllCharacters(list.get(i),set)){
                if(list.get(i).length() < minSize){
                    minSize=list.get(i).length();
                }
            }
        }

        for(int i=0;i<list.size();i++){
            if(containsAllCharacters(list.get(i),set) && list.get(i).length() == minSize){
                return list.get(i);
            }
        }

        return null;

    }

    public static boolean containsAllCharacters(String str,HashSet<Character> set){
        HashSet<Character> copy=new HashSet<>(set);
        char[] arr=str.toCharArray();
        int n=arr.length;

        for(char ch:arr) {
            copy.remove(ch);
        }
        if (copy.isEmpty()){
            return true;
        }

        return false;
    }

}
