package Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args){
        String str1="aab";
        String str2="xyz";
        boolean checkIsomorphic=checkIsomorphic(str1,str2);
        System.out.println(checkIsomorphic);
    }


    //this problem uses the concept of character-number mapping,one of the techniques for pattern matching in strings
    public static boolean checkIsomorphic(String str1,String str2){
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        HashMap<Character,Integer> mapping=new HashMap<>();
        HashMap<Character,Integer> mapping1=new HashMap<>();
        ArrayList<Integer> result1=new ArrayList<>();
        ArrayList<Integer> result2=new ArrayList<>();
        int nextNum1=0;
        int nextNum2=0;
        for(char ch:arr1){
            if(!mapping.containsKey(ch)){
                mapping.put(ch,nextNum1);
                nextNum1++;
            }
            result1.add(mapping.get(ch));
        }

        for (char ch:arr2){
            if (!mapping1.containsKey(ch)){
                mapping1.put(ch,nextNum2);
                nextNum2++;
            }
            result2.add(mapping1.get(ch));

        }

        int i=0, j=0;
        while(i<result1.size() && j<result2.size()){
            if (result1.get(i)!=result2.get(j)){
                return false;
            }
            else{
                i++;
                j++;
            }
        }

        return true;

    }
}
