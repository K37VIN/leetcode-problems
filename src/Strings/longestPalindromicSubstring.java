package Strings;

import java.util.ArrayList;

public class longestPalindromicSubstring {
    public static void main(String[] args){
        String str="aeiou";
        String longestSubstring=longestPalindromeSubstring(str);
        System.out.println(longestSubstring);
    }

    public static String longestPalindromeSubstring(String str){
        ArrayList<String> list=new ArrayList<>();
        int maxlen=0;
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=arr.length;j++){
                list.add(str.substring(i,j));
            }
        }

        for(int i=0;i<list.size();i++){
            if(isPalindrome(list.get(i))){
                if (list.get(i).length() > maxlen){
                    maxlen=list.get(i).length();
                }
            }
        }

        for(int i=0;i<list.size();i++){
            if(isPalindrome(list.get(i)) && list.get(i).length()==maxlen){
                return list.get(i);
            }
        }

       return null;
    }

    public static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        if (sb.reverse().toString().equals(str)){
            return true;
        }
        return false;
    }
}
