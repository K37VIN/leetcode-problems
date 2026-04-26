package Strings;

import java.util.ArrayList;

public class SmallestWindowInStringContainingAllCharactersOfAnotherString {
    public static void main(String[] args) {
        String str="cn";
        String x="c";
        String smallestWindow=smallestWindowContainingAllCharacters(str,x);
        System.out.println(smallestWindow);
    }

    public static String smallestWindowContainingAllCharacters(String str,String x){
        ArrayList<String> list=new ArrayList<>();
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=arr.length;j++){
                list.add(str.substring(i,j));
            }
        }

        int minSize=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if (containsAllCharacters(list.get(i),x)){
                if (list.get(i).length() < minSize){
                    minSize=list.get(i).length();

                }

            }
        }

        for(int i=0;i<list.size();i++){
            if (containsAllCharacters(list.get(i),x) && list.get(i).length() == minSize){
                return list.get(i);
            }
        }
        return null;

    }


    public static boolean containsAllCharacters(String str,String x){
        ArrayList<Character> list=new ArrayList<>();
        char[] arr=str.toCharArray();
        char[] characters=x.toCharArray();
        for (int i=0;i<characters.length;i++){
            list.add(characters[i]);
        }

        for(char ch:arr){
            list.remove((Character)ch);
        }

        if (list.isEmpty()){
            return true;
        }

        return false;
    }


}
