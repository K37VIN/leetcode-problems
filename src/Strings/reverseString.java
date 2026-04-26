package Strings;

public class reverseString {
    public static void main(String[] args){
        String word="ninja";
        String rev=reversedWord(word);
        System.out.println(rev);
    }


    public static String reversedWord(String word){
        StringBuilder str=new StringBuilder();
        StringBuilder sb=str.append(word);
        return sb.reverse().toString();

    }

}
